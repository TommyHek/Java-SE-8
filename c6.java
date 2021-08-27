package pro_1;

public class c6 {
		
	public static void main(String[] args) {
		
		
		/*System.out.println(doMsg(1));
		System.out.println(doMsg('1'));*/
		new B_("Tom");
		
	}
	
	/*static String doMsg(char x) {  type is not different
		return "Good Day";
	}
	static String doMsg(int y) {
		return "Good Luck";
	}
	int someMethod(int x,int y) {
		return 1;
	}*/
}
class A_{
	int x;
	int y;
	A_(){
		System.out.print("");
	}
	A_(int x ,int x1 ,int x2){
		System.out.println("A "+x);
	}
}
class B_ extends A_{
	B_(){
		x++;
		super.x=this.x;//super is dad's class variables
		System.out.println("B "+x);
	}
	B_(int x,int x2){
		System.out.println("x+y= "+x*x2);
;	}
	B_(int y){
		this();
		this.x=y;
		System.out.println("B2 "+x);
	}
	B_(String s){
		System.out.println("Name: "+s);
	}
	
}
