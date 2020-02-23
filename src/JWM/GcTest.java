package JWM;

import javax.management.MBeanAttributeInfo;

public class GcTest {
  //  public Object instance=null;
    private static final int _1MB=1024*1024;
 //   private byte[] b=new byte[2*_1MB];
    public static void main(String[] args) {
        testAllocation();
    }
    public static void testAllocation(){
        byte[] a1,a2,a3,a5,a4;
        a1=new byte[2*_1MB];
        a2=new byte[2*_1MB];
        a3=new byte[2*_1MB];
//        a5=new byte[2*_1MB];
        a4=new byte[6*_1MB];
//          GcTest c=new GcTest();
//          GcTest d=new GcTest();
//          c.instance=d;
//          d.instance=c;
//          c=null;
//          d=null;
//          System.gc();

    }
}
