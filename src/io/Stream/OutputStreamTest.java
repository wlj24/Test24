package io.Stream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by wlj on 2018/12/2.
 */
public class OutputStreamTest {
    public static void main(String[] args) throws IOException {
        File file=new File("1.txt");
        FileOutputStream fileOutputStream=new FileOutputStream(file);

        String a="aaaa";
        fileOutputStream.write(a.getBytes());
        fileOutputStream.close();
        System.out.println(a);

    }
}
