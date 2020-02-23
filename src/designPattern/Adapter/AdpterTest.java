package designPattern.Adapter;

/**
 * 将一个类的接口转换成客户想要的接口。可以使原本由于接口不兼容而不能一起工作的那些类可以一起工作。
 *
 *
 */
public class AdpterTest {
    public static void main(String[] args) {
        Player forwards=new Forwards("巴蒂尔");
        forwards.Attack();
        Player center=new Center("姚明");
        center.Attack();
        center.Defense();
        Player trans=new Translator("姚明");
        trans.Defense();
        trans.Attack();
    }
}
