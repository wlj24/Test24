package test;

public class Vtest {
    public static void main(String[] args) {
        byte a=-112,b=87;
        System.out.println(a&b);
//        System.out.println(ejz(4));\
        System.out.println(Integer.toBinaryString(-112));
        System.out.println(Integer.toBinaryString(-87));
        System.out.println(Integer.toBinaryString(16));
    }

    private static int ejz(int a){
        String b="";
        while (a>0){
         b+=a%2;
         a=a/2;
       }

       return Integer.parseInt(b);

    }
}
