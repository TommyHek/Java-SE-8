package pro_1;

public  class c4 {
	public static void main(String args[]) {
		A a=new A();
		B b=new B();
		C c=new C();
		D d=new D();
		System.out.println(( d instanceof I ));
		//test whether x instanceof y
	}
}
class A{}
class B extends A{}
interface I{}
interface J{}
class C extends B implements I,J{}
class D implements I,J{}
interface K extends I,J{}
