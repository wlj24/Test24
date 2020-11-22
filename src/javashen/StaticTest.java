package javashen;

public class StaticTest {
    static {
        x=30;
    }
    private static int x=10;
    public static int y=x*2;


    public static void main(String[] args) {
        System.out.println(y);

    }




}
