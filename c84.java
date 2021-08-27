package pro_1;

public class c84 {
	
	
	
	public static void main(String[] args) {
		final Cc o1=new Cc();
		final Cc o2=new Cc();
		
		new Thread(new Runnable() {
			public void run() {
				o1.m(o2);
			}
		}).start();
		new Thread(new Runnable() {
			public void run() {
				o2.m(o1);
			}
		}).start();
	}
	
}
class Cc extends Thread{
	int i=10;
	public void run() {
		
	}
	synchronized void m(Cc o) {
		try {
			Thread.sleep(5);
			new Cc().inc(o);
			}catch(InterruptedException e) {
			
		}
	}
	synchronized void inc(Cc o) {
		i++;
	}
}