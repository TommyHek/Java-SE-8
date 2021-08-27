package pro_1;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
public class c78 {
	int check=0;
	
	
	public static void main(String[] args) {
		
		
		
		Lock lock=new ReentrantLock();
		
		Thread t1=new Thread(new Runnable() {
			public void run() {
				System.out.println("lock1");
			}
		});
		
		Thread t3=new Thread(new Runnable() {
			public void run() {
				System.out.println("lock3");
			}
		});
		Thread t2=new Thread(new Runnable() {
			public void run() {
				System.out.println("lock2");
			}
		});
		
		lock.lock();
		try {
		
			t1.start();
		}finally {
			lock.unlock();
		}
		//
		Lock lock2=new ReentrantLock();
		boolean locked2=lock2.tryLock();
		lock.lock();
		try {
			t2.start();
		}finally {
			lock.unlock();
		}
		//
		Lock lock3=new ReentrantLock();
		
		try {
			lock.lock();
			
			boolean locked3=lock3.tryLock(3,TimeUnit.SECONDS);// take lock in 3 seconds? Y or N
			if(locked3) {
				try {
					t3.start();
				}finally {
					lock.unlock();
				}
			}
		}catch(InterruptedException e) {
			
		}
	}
	 void s1() {
		Thread s1=new Thread(new Runnable(){
			public void run() {
				for(int i=0;i<100;i++)
				System.out.println("S1");
			}
		});
		s1.start();
	}
	 void s2() {
		Thread s2=new Thread(new Runnable() {
			public void run() {
				System.out.println("S000");
			}
		});
		s2.start();
	}
	
}
