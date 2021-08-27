package pro_1;
import java.util.ArrayList;
import java.awt.List;
public class c20 {
	public static void main(String[] args) {
		
		//List using generics
	
		ArrayList list=new ArrayList();
		list.add("Tom");
		System.out.println(list);
		
		ArrayList<Integer> list3=new ArrayList<Integer>();
		list3.add(3);
		list3.add(4);
		System.out.println(list3);
		list.remove("Tom");
		list.add(404);
		list3.add(list3.size(),(Integer)list.get(0));
		System.out.println(list3);
		System.out.println(list3.size());
		ArrayList<NTUT> list4=new ArrayList<NTUT>();
		list3.remove(0);
		list.add("tom");
		list.remove("404");
		System.out.println(list.get(0).getClass());
		System.out.println(list3);
		
	}
}
class NTUT{
	
}
