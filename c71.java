package pro_1;

public class c71 {
	public static void main(String[] args) {
		Doggy[]	dogs= {new Doggy()};
		Cat[]	cats= {new Cat(),new Cat(),new Cat()};
		Bird[]	birds= {new Bird(),new Bird()};
		checkAnimal(dogs);
		checkAnimal(cats);
		checkAnimal(birds);
		Animal[] ss= {new Cat(),new Doggy()};
		checkAnimal(ss);
		new Animal().checkup();
	}
	static void checkAnimal(Animal[] a) {
		for(Animal aa:a) {
			aa.checkup();
		}
	}
}
class Animal{
	int x=0;
	 void checkup() {
		 System.out.println(new Doggy().x);
	 }
}
class Doggy extends Animal{
	int x=1;
	void checkup() {
		System.out.println("Dog");
	}
}
class Cat extends Animal{
	void checkup(){
		System.out.println("Cat");
	}
}
class Bird extends Animal{
	void checkup() {
		System.out.println("Bird");
	}
}