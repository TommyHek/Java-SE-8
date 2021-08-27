package pro_1;
import java.util.Date;
public class c64 {
	public static void main(String[] args) {
	//Thread using
		Thread1 t1=new Thread1();
		Thread t2=new Thread(new Thread2());
		t1.start();
		t2.start();
	}
}
class Thread1 extends Thread{
	public void run() {
		while(true) { 
			try {
			Thread.sleep(1000);
			System.out.println(new Date());
			}catch(InterruptedException e) {
				
			}
		}	
	}
}
class Thread2 implements Runnable{
	public void run() {
		while(true) {
			try {
				Thread.sleep(5*1000);
				System.out.println(new Date());
			}catch(InterruptedException e) {
				
			}
		}
	}
}