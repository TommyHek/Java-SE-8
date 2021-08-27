package pro_1;

public class c87 {
	public static void main(String[] args) {
		System.out.println();
		c87 c1=new c87();
		c87 c2=new c87();
		c87 c3=new c87();
		c1.a++;
		c2.b++;
		System.out.println(c1.a+" "+c2.a);
		System.out.println(c1.b+" "+c2.b);
		System.out.println(c3.a+" "+c3.b);
	}
	
	String graphics;
	int a;
	static int b;
	//static initial block
	static {
		
	}
	//ininial block
	{
		a=5;
	}
	
}
class D2{
	public void m() {
		System.out.println("2D");
	}
}
class D3 extends D2{
	public void m() {
		System.out.println("3D");
	}
}