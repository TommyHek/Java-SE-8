package pro_1;
import java.util.ArrayList;
import java.util.List;
public class c72 {
	public static void main(String[] args) {
		List<Doggg> dogs=new ArrayList<Doggg>();
		dogs.add(new Doggg());
		dogs.add(new Doggg());
		List<Catt> 	cats=new ArrayList<Catt>();
		cats.add(new Catt());
		cats.add(new Catt());
		List<Birdd>	birds=new ArrayList<Birdd>();
		birds.add(new Birdd());
		checkAnimal(dogs);
		checkAnimal(cats);
		checkAnimal(birds);
	}
	static void checkAnimal(List<? extends Animals> a) {
		for(Animals aa:a) {
			aa.checkup();
		}
	}
}
abstract class Animals{
	abstract void checkup();
}
class Doggg extends Animals{
	void checkup() {
		System.out.println("Dog");
	}
}
class Catt extends Animals{
	void checkup() {
		System.out.println("Cat");
	}
}
class Birdd extends Animals{
	void checkup() {
		System.out.println("Bird");
	}
}
