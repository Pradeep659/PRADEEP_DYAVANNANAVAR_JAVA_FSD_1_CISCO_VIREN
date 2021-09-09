package cisco.simplilearn.fifthdayassignment;

public class StringDemo {
     public static void main(String[] args) {
	String t = "delhi";
	String o = "Mumbai";
	String k = "delhi";
	String y = new String("Mumbai");
	String l = new String("delhi");
	String p = new String("Hello");
	
	System.out.println(o.equals(l));
	System.out.println(y.equals(p));
	System.out.println(t.equals(o));
	System.out.println(k.equals(y));
	System.out.println(p.equals(y));
	
	System.out.println(o==l);
	System.out.println(y==p);
	System.out.println(t==o);
	System.out.println(k==y);
	System.out.println(p==y);
     }
}
