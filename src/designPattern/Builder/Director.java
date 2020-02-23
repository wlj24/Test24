package designPattern.Builder;

public class Director {
    public void Construct(Builder builder){
        builder.BuildPartA();
        builder.BuilderPartB();
    }
}
