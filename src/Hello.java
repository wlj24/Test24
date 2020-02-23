
public class Hello {
	public static void main (String args[]){
		System.out.println("´ó¼ÒºÃ£¡");
		System.out.println("nice to meet you");
		Student s=new Student();
		s.speak("hello");
		
		
	}

}
class Student{
	public void speak(String s){
		System.out.println(s);
	}
}
