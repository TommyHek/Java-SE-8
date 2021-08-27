package pro_1;
import java.util.StringTokenizer;
public class c38 {
	public static void main(String[] args) {
		//String tokenizer
		StringTokenizer st1=new StringTokenizer("a b c d e");
		System.out.println(st1.countTokens());
		while(st1.hasMoreTokens()) {
			System.out.print("["+st1.nextToken()+"]");
		}
		System.out.println(st1.countTokens());
		StringTokenizer st2=new StringTokenizer("adde dab abc ddad ae","a");
		System.out.println(st2.countTokens());
		while(st2.hasMoreElements()) {
			System.out.print("["+st2.nextToken()+"]");
		}
		System.out.println();
		System.out.println(st2.countTokens());
		System.out.printf("%d+%d",123,321);
	}
}
