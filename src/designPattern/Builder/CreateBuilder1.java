package designPattern.Builder;

public class CreateBuilder1 extends Builder{
    Product product=new Product();
    @Override
    public void BuildPartA() {
        product.add("A");
    }

    @Override
    public void BuilderPartB() {
        product.add("B");
    }

    @Override
    public Product GetResult() {
        return product;
    }
}
