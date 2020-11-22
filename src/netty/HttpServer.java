package netty;

import a.E;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoop;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.codec.http.HttpContentCompressor;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.HttpServerCodec;
import io.netty.handler.codec.http.HttpServerKeepAliveHandler;

import java.net.InetSocketAddress;

public class HttpServer {

    public static void  start(int port){
       // 主从多线程模式
        //Boss 负责监听网络连接事件
        EventLoopGroup boosGroup=new NioEventLoopGroup();
        // EventLoop 负责处理 Channel 的读写事件。
        EventLoopGroup workGroup=new NioEventLoopGroup();
        //服务端启动
        ServerBootstrap serverBootstrap=new ServerBootstrap();
        try {
          //
            serverBootstrap.group(boosGroup, workGroup).
                    //设置 Channel 类型
                    channel(NioServerSocketChannel.class).
                    //绑定端口
                    localAddress(new InetSocketAddress(port)).
                    //注册 ChannelHandler
                    childHandler(new ChannelInitializer<SocketChannel>() {

                        @Override
                        protected void initChannel(SocketChannel socketChannel) throws Exception {
                            socketChannel.pipeline().
                                    // HTTP 编解码
                                            addLast("codec", new HttpServerCodec()).
                                    //
                                            addLast("compressor", new HttpContentCompressor()).
                                    addLast("aggregator", new HttpObjectAggregator(65536)).
                                    addLast("handler", new HttpServerHandler());
                        }
                    }).childOption(ChannelOption.SO_KEEPALIVE, true);
            ChannelFuture channelFuture = serverBootstrap.bind().sync();
            System.out.println("HttpServer is started ,Listening on " + port);
            channelFuture.channel().closeFuture().sync();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            workGroup.shutdownGracefully();
            boosGroup.shutdownGracefully();
        }



    }

    public static void main(String[] args) {
        start(8080);
    }
}
