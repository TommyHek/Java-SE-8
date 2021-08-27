package pro_1;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;
import java.util.concurrent.ExecutionException;
public class c83 {
	public static void main(String[] args)throws ExecutionException,InterruptedException {
		F o=new F(6);
		ForkJoinPool.commonPool().execute(o);
		System.out.println(o.get());
	}
}
class FF extends RecursiveTask<Long>{
	final int n;
	FF(int n){
		this.n=n;
	}
	protected Long compute() {
		if(n<=1) return 1L;
		FF f1=new FF(n-1);
		f1.fork();
		return f1.join()*n;
	}
}
class F extends RecursiveTask<Integer>{
	final int n;
	F(int n){
		this.n=n;
	}
	protected Integer compute() {
		if(n<=1) return n;
		F f1=new F(n-1);
		f1.fork();
		F f2=new F(n-2);
		
		return f1.join()+f2.compute();
		
	}
}