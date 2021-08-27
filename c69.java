package pro_1;

public class c69 {
	public static void main(String[] args) {
		Thread12 t1=new Thread12();
		Thread t2=new Thread(new Thread21());
		//t1.start();//thread cpu memory
		try {
			t1.join();
		}catch(InterruptedException e) {
			
		}
		//t2.start();
		Thread t22=new Thread(new Runnable() {
			public void run() {
				for(int i=1;i<=5;i+=2) {
					System.out.print(i+"");
				}
			}
		});
		t22.start();
		new Thread(new Runnable() {
			public void run() {
				for(int i=2;i<=6;i+=2) {
					System.out.print(i+"");
				}
			}
		}).start();
		
	}
}
class Thread12 extends Thread{
	public void run() {
		for(int a=0;a<=9;a++) {
			System.out.print(a+" ");
		}
	}
}
class Thread21 implements Runnable{
	public void run() {
		for(int a=0;a<26;a++) {
			System.out.print((char)(a+65)+"");
		}
	}
}