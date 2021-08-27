package pro_1;

public class c7 {
	private int num;
	public static void main(String[] args) {
		int x=1;
		Integer[] ar= {1,2};
		dolt(x);
		
		
		
		
	}
//	overload test

	static void mm(){
		System.out.println("SS");
	}
	static String s=" ";
	static void dolt(Long x){s+="LL ";}
	static void dolt(long x){s+="L ";}
	static void dolt(Integer x){s+="I ";}
	static void dolt(Object x) {s+="O ";}
	
	static void display(long var) {
		System.out.println(var);
	}
	static void display(Integer var){
		System.out.println(var*var);
	}
	
}
