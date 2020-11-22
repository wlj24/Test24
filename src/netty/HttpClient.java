package netty;

import a.E;
import io.netty.bootstrap.Bootstrap;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.http.*;

import java.net.URI;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class HttpClient {
    public void connect(String host,int port){
        EventLoopGroup eventLoopGroup=new NioEventLoopGroup();
        try {
            Bootstrap bootstrap=new Bootstrap();
            bootstrap.group(eventLoopGroup);
            bootstrap.channel(NioSocketChannel.class);
            bootstrap.option(ChannelOption.SO_KEEPALIVE,true);
            bootstrap.handler(new ChannelInitializer<SocketChannel>() {

                @Override
                protected void initChannel(SocketChannel socketChannel) throws Exception {
                    socketChannel.pipeline().addLast(new HttpResponseDecoder());
                    socketChannel.pipeline().addLast(new HttpRequestEncoder());
                    socketChannel.pipeline().addLast(new HttpClientHandler());

                }
            });
            ChannelFuture channelFuture=bootstrap.connect(host,port).sync();
            URI url=new URI("http://127.0.0.1:8080");
            String content="hello world";
            DefaultFullHttpRequest defaultFullHttpRequest=new DefaultFullHttpRequest(HttpVersion.HTTP_1_1,HttpMethod.GET,
                    url.toASCIIString(), Unpooled.wrappedBuffer(content.getBytes(StandardCharsets.UTF_8)));
            defaultFullHttpRequest.headers().set(HttpHeaderNames.HOST,host);
            defaultFullHttpRequest.headers().set(HttpHeaderNames.CONNECTION,HttpHeaderValues.KEEP_ALIVE);
            defaultFullHttpRequest.headers().set(HttpHeaderNames.CONTENT_LENGTH,content.getBytes().length);
            channelFuture.channel().write(defaultFullHttpRequest);
            channelFuture.channel().flush();
            channelFuture.channel().closeFuture().sync();

        }catch (Exception e){
              e.printStackTrace();
        }finally {
            eventLoopGroup.shutdownGracefully();
        }
    }

    public static void main(String[] args) {
        HttpClient httpClient=new HttpClient();
        httpClient.connect("127.0.0.1",8080);
    }
}
