package pro_1;

public class c2 {
		public static void main(String args[]) {
			
			float f=1.2F;
			long l=1235;
			Color c=Color.Yellow;
			
			CoffeeSize d=CoffeeSize.a;
			System.out.print("I like color is "+c+" and coffee size is "+d);
		}
		
		enum CoffeeSize{
			Small,a,b
		}
		static void m(long l) {
			System.out.print(l*2);
		}
		
}
class A1{
	
	private int a=1;
	private String b="JAVA 7";
}
enum Color{
	Green,Black,Yellow
}
