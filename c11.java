package pro_1;

public class c11 {
	public static void main(String[] args) {
		String s="JAVA";
		String ss=null;
		
		System.out.println(ss instanceof Object );
		Sun o=new Sun();
		Star o2=o;
		((Sun)o2).doStuff();
		((Star)o).doStuff();
		((Universe)o).doStuff();
		//testDrive(new Bike());
		testDrive(new RacingBike());
	}
	static void testDrive(Object o) {
		RoadBike b=(RacingBike)o;
		System.out.println(b.getClass());
		if(b instanceof RoadBike) {
			System.out.println("RoadBike");
		}
		if(b instanceof RacingBike) {
			System.out.println("RacingBike");
		}
	}
}
//extends practice
class Bike{
	int a=88;
	
}
class RoadBike extends Bike{
	void m() {
		super.a=0;
	}
}
class RacingBike extends RoadBike{
	int a=8;
}
interface Universe{
	public void doStuff();
}
class Star{
	public void doStuff(){
		System.out.println("Twingking Star");
	}
}
class Sun extends Star implements Universe{
	public void doStuff() {
		System.out.println("Shining Sun");
	}
}
class A{}
interface i{}
interface j{}
class B extends A implements i,j{}