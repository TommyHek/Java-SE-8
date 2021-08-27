package pro_1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
public class c73 {
	public static void main(String[] args) {
		ArrayList<String> l=new ArrayList<String>();
		l.add("A");
		l.add("B");
		ArrayList<String> l2=new ArrayList<String>();
		l2.add("A");
		l2.add("D");
		ar.addAll(l);
		ar.addAll(l2);
		System.out.println(ar);
		m();
		System.out.println(ar);
		for(String s:ar) {
			System.out.print(s+" ");
		}
	}
	static CopyOnWriteArraySet<String> ar=new CopyOnWriteArraySet<String>();
	static void m() {
		String s="";
		Iterator<String> it=ar.iterator();
		while(it.hasNext()) {
			s=it.next();
			if(s.equals("A"))
			ar.remove(s);
		}
	}
}
