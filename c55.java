package pro_1;

public class c55 {
	public static void main(String[] args) {
		//implements extends application 

		Car o=new Car();
		o.start();
		if(o instanceof Car) {
			((Vehicle)o).stop();
		}
	}
}
interface Vehicle{
	public void start();
}
interface Motorized{
	public void stop();
	public void slow();
}
class Car implements Vehicle,Motorized{
	public void start() {
		System.out.print("Start");
	}
	public void slow() {
		System.out.print("slow");
	}
	public void stop() {
		System.out.print("Stop");
	}
}