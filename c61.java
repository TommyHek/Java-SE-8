package pro_1;

public class c61 {
	public static void main(String[] args) {
	//Thread using
		T1 t1=new T1();
		Thread t2=new Thread(new T2());
		//t1.start();
		//t2.start();
		char c=(char)33;
		//System.out.println("\n"+c);
		t1.run();
		t2.run();
	}
}
class T1 extends Thread{
	public void run() {
		for(int i=0;i<=9;i++) {
			System.out.print(i);
		}
	}
}
class T2 implements Runnable{
	public void run() {
		for(int i=65;i<=90;i++) {
			System.out.print((char)i);
		}
	}
}