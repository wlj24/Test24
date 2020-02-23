package seriable;

import java.io.Serializable;

/**
 *
 * 测试序列化和反序列化
 * @author crazyandcoder
 * @date [2015-8-5 上午11:14:32]
 */
public class Person implements Serializable  {
    private static final long serialVersionUID = 1L;
    private int age;
//	private String sex;
	private String name;
//	private String hobby;
    //序列化ID
//	private static final long serialVersionUID = -5809782578272943999L;

//	public String getHobby() {
//		return hobby;
//	}
//
//	public void setHobby(String hobby) {
//		this.hobby = hobby;
//	}

    public Person() {}

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//	public String getSex() {
//		return sex;
//	}
//
//	public void setSex(String sex) {
//		this.sex = sex;
//	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}

