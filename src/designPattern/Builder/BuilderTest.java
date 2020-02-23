package designPattern.Builder;

public class BuilderTest {
    public static void main(String[] args) {
        Director director=new Director();
        Builder builder1=new CreateBuilder1();
        Builder builder2=new CreateBuilder2();
        director.Construct(builder1);
        director.Construct(builder2);
        Product product=builder1.GetResult();
        product.show();
        product=builder2.GetResult();
        product.show();
    }
}
