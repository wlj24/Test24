package jihe;

public class Dy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     aa s=new aa();
     s.id=1;
     
     aa b=new aa();
     b.id=1;
   
     System.out.println(s==b);
     System.out.println(s.equals(b));
     String str1 = "回家了";
     String str2 = "回家了";
     String str3 = new String("回家了");
     String str4 = new String("回家了");
      
     System.out.println(str1==str2);
     System.out.println(str3.equals(str4));
	}

}
class aa{
	int id;
	String name;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		aa other = (aa) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}
