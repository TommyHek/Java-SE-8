package pro_1;

public class c3 extends E implements i{
	public static void main(String[] args) {
		B2 b2=new B2();
		b2.a1();
		c3 c=new c3();
		
	}
	void m(){
		
	}
	public  void a(int i){
		 int a4=5*i;
		 System.out.print(a4);
	}
	void a2(){
		
	}
}

class B1{
	private int a=0;
	int b=a;
}
class B2 extends B1{
	 void a1(){
		 System.out.print(b);
	 }
}
abstract class E2 extends B1{
	
}
//abstract use in additional main funtion
abstract class E{
	abstract void m();
	void m1(){
		System.out.println("Tommy is Legend");
	}
}
//additional funtion
/*interface i{
	void a(int i);
}
interface j {
	void a2(int i);
}*/
