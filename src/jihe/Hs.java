package jihe;

import java.util.HashMap;

public class Hs {
public static void main(String args[]){
	HashMap hs=new HashMap();
	hs.put(null, "a");
	hs.put(null, "b");
	hs.put("a", "b");
	System.out.println(hs);
}
}
