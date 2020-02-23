package designPattern.Builder;

public class CreateBuilder2 extends Builder{
    Product product=new Product();
    @Override
    public void BuildPartA() {
        product.add("X");
    }

    @Override
    public void BuilderPartB() {
        product.add("Y");
    }

    @Override
    public Product GetResult() {
        return product;
    }
}
