package javashen;

public class Test {
    public static void main(String[] args) {
        ClassLoader classLoader=Test.class.getClassLoader();
        System.out.println(classLoader);
        ClassLoader classLoader1=classLoader.getParent();
        System.out.println(classLoader1);
        ClassLoader classLoader2=classLoader1.getParent();
        System.out.println(classLoader2);
    }
}
