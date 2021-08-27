package pro_1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
public class c70 {
	public static void main(String[] args) {
		boolean[] b=new boolean[5];
		Set s=new HashSet();
		b[0]=s.add("a");
		b[1]=s.add(new Integer(614));
		b[2]=s.add("b");
		b[3]=s.add("ab");
		b[4]=s.add(new Object());
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+" ");
		}
		System.out.print(s);
		Set a=new TreeSet();
		b[0]=a.add("a");
		b[1]=a.add("b");
		b[2]=a.add("b");
		b[3]=a.add("a");
		b[4]=a.add("c");
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+" ");
		}
		System.out.println("\n"+a);
		Map<String,String> m=new HashMap<String,String>();//key value
		m.put("TW", "Taiwan");
		m.put("CN","China");
		m.put("JP","Japan");
		System.out.println(m);
		Map<String,String> mp=new TreeMap<String,String>();
		mp.put("01","Shoes");
		mp.put("04", "Shirt");
		mp.put("03", "Pants");
		
		System.out.println(mp);
		System.out.println(m.get("TW"));
		Set<String> set=m.keySet();
		for(String ss:set) {
			System.out.println(ss+" "+m.get(ss));
		}
		List<Dogg> list=new ArrayList<Dogg>();
		list.add(new Dogg("A"));
		list.add(new Dogg("B"));
		list.add(new Dogg("C"));
		System.out.println(list);
		System.out.println(list.getClass());
		Iterator it=list.iterator();
		while(it.hasNext()) {
			Dogg d=(Dogg)it.next();
			System.out.println(d);
		}
		System.out.println(list.getClass());
	}
}
class Dogg{
	private String name;
	Dogg(String name){
		this.name=name;
	}
	public String toString() {
		return this.name;
	}
}
