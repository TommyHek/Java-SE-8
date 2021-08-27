package pro_1;
import java.util.ArrayList;
import java.awt.List;
import java.util.LinkedList;
public class c21 {
	
	public static void main(String[] args) {
		//list application
		String s1=new String("Java");
		String s2="Java";
		s2=s2.concat(" 7");
		s1+=" 9";
		
		System.out.println(s1+" "+s2);
		//StringBuilder 
		StringBuilder s3=new StringBuilder("Duke");
		StringBuilder s4=new StringBuilder();
		s3.append("Java");
		s4.append(" Logo");
		s3.delete(0,s3.length());
		System.out.println(s3);
		//List ArrayList
		LinkedList l2=new LinkedList();
	
		l2.add("wwe");
		l2.add(" 777");
		System.out.println(l2);
		//genertic
		ArrayList<Integer> List3=new ArrayList<Integer>();
		ArrayList<String> list4=new ArrayList<String>();
		List3.add(424);
		List3.remove((Integer)424);
		System.out.println(List3);
		List3.add(42323424);
		System.out.println(List3);
		List3.clear();
		System.out.println(List3);
		Object List5=new Object();
		List3.add(424);
		List5=List3.clone();
		System.out.println(List5.equals(List3));
		final int a=1;
		final int b=2;
		int x=0;
		switch(x){
			case a:
				System.out.println("1");
				break;
			case b:
				System.out.println("2");
				break;
			default:
				x+=1;
		}
		System.out.println(x);
	}
}
