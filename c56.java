package pro_1;

public class c56 {
	public static void main(String[] args) {
		int x=1;
		Integer[] i={1,2};
		doit(x);
		doit(i[0]);
		System.out.println(s);
	}
	static String s="";
	//overload
	static void doit(Long x) {s+="L";}
	static void doit(Integer x) {s+="I";}
	static void doit(Object x) {s+="O";}
}
