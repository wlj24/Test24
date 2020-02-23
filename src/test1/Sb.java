package test1;

public class Sb {
public static void main(String args[]){
	StringBuilder sb=new StringBuilder();
	sb.append("dd");
	sb.append("cc");
	System.out.println(sb);
	sb.insert(3, "aa");
	System.out.println(sb);
	sb.replace(1, 3,"2");
	System.out.println(sb);
	 String str1 = "ab" + "cd";  //1个对象  
     String str11 = "abcd";   
     System.out.println("str1 = str11 : "+ (str1 == str11)); 
     String str2 = "ab";  //1个对象  
     String str3 = "cd";  //1个对象                                         
     String str4 = str2+str3;                                        
     String str5 = "abcd";    
     System.out.println("str4 = str5 : " + (str4==str5));
     String str6 = "b";  
     String str7 = "a" + str6;  
     String str67 = "ab";  
     System.out.println("str7 = str67 : "+ (str7 == str67));
     final String str8 = "b";  
     String str9 = "a" + str8;  
     String str89 = "ab";  
     System.out.println("str9 = str89 : "+ (str9 == str89)); 
}
}
