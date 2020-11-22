package javashen;

import a.E;

import java.io.IOException;
import java.io.InputStream;

public class ClassLoaderTest {
    public static void main(String[] args)  throws Exception {
        ClassLoader classLoader=new ClassLoader()  {
            @Override
            public Class<?> loadClass(String name) throws ClassNotFoundException {
                String fileName=name.substring(name.lastIndexOf(".")+1)+".class";
                InputStream inputStream=getClass().getResourceAsStream(fileName);
                if(inputStream==null){
                    return super.loadClass(name);
                }
                try {
                    byte[] b=new byte[inputStream.available()];
                    inputStream.read(b);
                    return defineClass(name,b,0,b.length);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return super.loadClass(name);
            }
        };
        Object o=classLoader.loadClass("javashen.ClassLoaderTest").newInstance();
        System.out.println(o.getClass());
        System.out.println(o instanceof javashen.ClassLoaderTest);
    }
}
