package designPattern.Prototype;

public class Address implements Cloneable{
    private String location;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Object clone() throws CloneNotSupportedException {
            return super.clone();
    }
}
