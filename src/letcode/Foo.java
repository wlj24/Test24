package letcode;

public class Foo {

    public Foo(){

    }

    public void first(Runnable first){
            first.run();
    }

    public void second(Runnable second){
           second.run();
    }

    public void  third(Runnable third){
            third.run();
    }

    public static void main(String[] args) {
        Foo foo=new Foo();
      //  foo.first();
    }
}
