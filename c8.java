package pro_1;

public class c8 {
	static int i=1_000;
	public static void main(String[] args) {
		//Array test

		int[] n=new int[2];
		n[0]=10;
		n[1]=20;
		for(int i:n) {
			System.out.println(i+" ");
		}
		n=new int[4];
		n[2]=20;
		n[3]=30;
		for(int a=0;a<n.length;a++) {
			System.out.println(n[a]+" ");
		}
		int[] ar1= {2,4,6,8};
		int[] ar2= {1,3,5,7,9};
		ar2=ar1;
		for(int a:ar2) {
			System.out.print(a+" ");
		}
		System.out.println();
		int a=9;
		System.out.println(++a<10);
		
		System.out.println(25+5<35-5);
		
		/*
		try {
			String str="1";
			Byte a=Byte.parseByte(str);
			System.out.println(a);
		}catch(NumberFormatException e) {
			System.err.println("parse byte error!!"+e);
		}
		*/
		System.out.println(isAvailable);
		new c8("wwe").a(5);//chainning 
		System.out.println(doStuff());
		int [][] ar4= new int[4][4];
		int [][] ar5={{1,2,3},{3,4,5}};
		
		ar5[0]=new int[1];//[0]d are being new
		ar5[1]=new int[2];//[1]d are being new
		System.out.println(ar5[1][1]);
		
		int [][] ar6=new int[2][];
		
		
		m(new int [] {1,2,3});
	}
	static void m(int[] ar) {
		System.out.println();
	}
	 String str="default";
	c8(String str){
		this.str=str;
	}
	void print(){
		System.out.print(this.str);
	}
	void a(int i) {
		System.out.println(i^3);
	}
	static boolean isAvailable=false;
	static boolean doStuff() {
		return !isAvailable;
	}
	
	
}
