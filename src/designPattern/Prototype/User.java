package designPattern.Prototype;

public class User implements Cloneable{
    private String name;
    private String age;
    private Address address;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }


    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Object clone() throws CloneNotSupportedException {
        Object object=super.clone();
        Address a=((User)object).getAddress();
        ((User) object).setAddress((Address) a.clone());
        return object;

    }

    public static void main(String[] args) throws CloneNotSupportedException {
        User user=new User();
        user.setAge("1");
        user.setName("sss");
        Address address=new Address();
        address.setLocation("2222");
        user.setAddress(address);
        User user1= (User) user.clone();
        System.out.println(user.getAge());
        user1.setName("3333");
        user1.getAddress().setLocation("1111");
        User user2= (User) user1.clone();
        System.out.println(user2.getName());
        System.out.println(user.getName());
        System.out.println(user1.getAddress().getLocation());
        System.out.println(user.getAddress().getLocation());
    }
}
