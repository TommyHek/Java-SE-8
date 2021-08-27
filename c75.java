package pro_1;

public class c75 {
	public static void main(String[] args) {
		System.out.println("Name: "+Thread.currentThread().getName()+" ID: "+Thread.currentThread().getId());
		Thread_1 t1=new Thread_1();
		Thread t2=new Thread(new Thread_2());
		Thread t3=new Thread_2();
		try {
			t1.setName("A");
			t2.setName("B");
			t1.start();
			t2.start();
		}catch(Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
class Thread_1 extends Thread{
	public void run() {
		for(int i=1;i<=3;i++) {
			System.out.println("Name: "+Thread.currentThread().getName()+" "+i);
		}
		System.out.println("Name: "+Thread.currentThread().getName()+" ID:" +Thread.currentThread().getId());
	}
}
class Thread_2 extends Thread{
	public void run() {
		for(int i=1;i<=3;i++) {
			System.out.println("Name: "+Thread.currentThread().getName()+" "+i);
		}
		System.out.println("Name: "+Thread.currentThread().getName()+" ID: "+Thread.currentThread().getId());	
	}
}