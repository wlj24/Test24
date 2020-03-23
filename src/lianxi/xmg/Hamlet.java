package lianxi.xmg;

import java.util.Random;

public class Hamlet {
    public static void main(String[] args) {
        Random rnd = new Random();
        boolean toBe = rnd.nextBoolean();
        Number result = (toBe || !toBe) ?  new Float(1): new Integer(3) ;
        System.out.println(result);
    }
}