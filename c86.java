package pro_1;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadLocalRandom;

public class c86 {
	public static void main(String[] args)throws InterruptedException ,ExecutionException {
		Runtime rt=Runtime.getRuntime();
		System.out.println("core: "+rt.availableProcessors());
		Callable<Integer> c=new MyCallable();
		ExecutorService ex=Executors.newCachedThreadPool();
		Future<Integer> f=ex.submit(c);
		
		try {
			Integer v=f.get();
			System.out.println(v+"");
		}catch(InterruptedException | ExecutionException e) {
			System.out.println("Failed");
		}
		Callable<Long> c2=new Sum(6);
		ExecutorService ex1=Executors.newCachedThreadPool();
		Future<Long> f1=ex1.submit(c2);
		System.out.println(f1.get()+"");
		ex.shutdown();
	}

}
class Sum implements Callable<Long>{
	long n;
	Sum(long n){
		this.n=n;
	}
	public Long call() throws Exception{
		long sum=0;
		for(long v=1;v<=n;v++) {
			sum+=v;
		}
		return sum;
	}
}
class MyCallable implements Callable<Integer>{
	public Integer call() {
		int count=ThreadLocalRandom.current().nextInt(1,9+1);
		return count;
	}
}
interface Information{
	void info();
}
interface Event extends Information{
	void details();
}
abstract class Quiz implements Event{
	abstract void profile();
	public void details() {
		
	}
}
class PracticeQuiz extends Quiz{
	public void info() {}
	void profile() {}
}