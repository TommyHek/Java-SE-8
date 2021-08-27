package pro_1;
import java.util.Scanner;
public class c12 {
	public static void main(String[] args) {
		String[] s={"JAVA7","JAVA web","Java9"};
		for(int i=0;i<s.length;i++){
			System.out.println(s[i]+": "+s[i].length()+"Byte");
		}
		System.out.println(33.5F%3.3F);
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n>=0){
			System.out.println("Positive");
		}else {
			System.out.println("Negative");
		}
		System.out.println(n+((n>0)?"is positive":" is negative")+((n==0)?"LOL":"olo"));
		int i=(123>100)?123:123;
		i++;
		String a1="123456";
		String a2="123";
		String ss=(a1.length()>a2.length())?"yes":"no";
		System.out.println(ss+1);
		int i1=100,j1=200;
		if((i1==99)||(j1--==199)) {
			System.out.println("yes2");
		}else {
			System.out.println(j1);
		}
		//byte operation 
		int i2=100,j2=200;
		if((i2==99)&(--j2==199)) {
			System.out.println("both yes");
		}else {
			System.out.println("one is no");
		}
		boolean b1=true;
		boolean b2=false;
		System.out.println(b1&b2);
		Object c=123;

		
	}
}
