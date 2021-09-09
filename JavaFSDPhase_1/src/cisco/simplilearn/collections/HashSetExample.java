package cisco.simplilearn.collections;

import java.util.LinkedHashSet;

public class HashSetExample {

	public static void main(String[] args) {
		
		LinkedHashSet<String> hs = new LinkedHashSet<String>();
		
		hs.add("d");
		hs.add("c");
		hs.add("true");
		hs.add("45");
		hs.add("b");
		hs.add("a");
		hs.add("c");
		hs.add("i");
		hs.add("l");
		
		System.out.println("HashSet is: " + hs);
		System.out.println("size of Hashset is " + hs.size());
		
		System.out.println("Does hashset contains this 'u' element " + hs.contains("u"));
		System.out.println("is hashset empty " + hs.isEmpty());
		System.out.println("remove the element " + hs.remove("i"));
		System.out.println("Hashset is " + hs);
		
		hs.clear();
		System.out.println("get class " + hs.getClass());
		
		System.out.println("is hashset empty " + hs.isEmpty());
		
	}
}
