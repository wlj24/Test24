package Algorithms;

public class Test {
    public static void main(String[] args) {
        System.out.println( exR1(6));
        System.out.println(exR2(2,25));
    }

    public static String exR1(int n){
        if(n<=0) return "";
        return exR1(n-3)+n+exR1(n-4)+n;
    }

    public static int exR2(int a,int b){
        if(b==0) return 0;
        if(b%2==0) return exR2(a+a,b/2);
        return exR2(a+a,b/2)+a;
    }
}

