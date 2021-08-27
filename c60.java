package pro_1;
//very important
public class c60 {
	public static void main(String[] args) {
		new Outer().new Inner().seeOuter();
		Outer.Inner oi=new Outer().new Inner();
		oi.seeOuter();
	}
}
//inner class appliction
class Outer{
	private int d=65;
	class Inner{
		void seeOuter() {
			System.out.println("d:"+d);
		}
		class A{
			class B{
				
			}
		}
	}
}
class Inner{
	
	private class Outter{
		void m() {
			
		}
	}
	public static void main(String[] args) {
		System.out.println("wwe");
		Inner.Outter i=new Inner().new Outter();
		
	}
	class B{
		public  void m1(String[] args) {
			
			
		}
	}
}
