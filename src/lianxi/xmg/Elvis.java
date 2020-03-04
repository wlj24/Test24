package lianxi.xmg;

public class Elvis {
    // Singleton pattern: there's only one Elvis
    private static final Boolean LIVING = true;
    public static final Elvis ELVIS = new Elvis();
    private Elvis() { }

    private final Boolean alive = LIVING;
    public final Boolean lives() { return alive; }
    public static void main(String[] args) {
        System.out.println(ELVIS.lives() ?
                "Hound Dog" : "Heartbreak Hotel");
    }
}
