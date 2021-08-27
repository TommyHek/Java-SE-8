package pro_1;

public class c77 {
	public static void main(String[] args) {
		c77 c=new c77();
		 
	     
	     c.run();
	     
	}
	private  Account a=new Account();
	public synchronized void run() {
		for(int i=0;i<5;i++) {
			m(10);
			if(a.getBalance()<=0) {
				System.out.println("Account is overdrawn ??");
			}
		}
	}
	private  synchronized void m(int am) {
		if(a.getBalance()>=am) {
			System.out.println(Thread.currentThread().getName()+" is going to withdraw");
			
			try {
				Thread.sleep(1500);
			}catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
			a.withdraw(am);
			System.out.println(Thread.currentThread().getName()+" completes withdraw");
		}else {
			System.out.println("No enough for "+Thread.currentThread().getName()+" to withdraw");
		}
	}
}
class Account{
	private int balance=50;
	int getBalance() {
		return balance;
	}
	void withdraw(int a) {
		balance -=a;
	}
}