package pro_1;

public class c74 {
	public static void main(String[] args){
		Thread t1=new Thread(new Runnable() {
			public void run() {
				for(int i=0;i<10000;i++) {
					count++;
				}
			}
		});
		Thread t2=new Thread(new Runnable() {
			public void run() {
				for(int i=0;i<10000;i++) {
					count--;
				}
			}
		});
		
		
			
			t1.start();
			t2.start();
			try {
				
				t1.join();
			}catch(InterruptedException e) {
			
			}
			
		
		
		
		System.out.println(count);
	}
	static int count;
}
