package pro_1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class c59 {
	public static void main(String[] args) {
		// list Collections using to sort
		List<Integer> list=new ArrayList<Integer>();
		List<String> list2=new ArrayList<>();
		List<Long> list3=new ArrayList<Long>();
		list.add(new Integer(65));
		list.add(612);
		list.add(67);
		System.out.println("size:"+list.size()+"\t Unsorted:"+list);
		Collections.sort(list);
		System.out.println(list);
		list2.add("Taiwan");
		list2.add("Mom");
		list2.add("Dad");
		System.out.println("size:"+list2.size()+"\tlist2:"+list2);
		Collections.sort(list2);
		System.out.println("Sorted: "+list2);
		System.out.println(Collections.binarySearch(list2, "o"));
		String[] n= {"one","two","three"};
		Arrays.sort(n);
		for(String nn:n) {
			System.out.println(nn);
		}
		System.out.println(Arrays.binarySearch(n, "two"));
	}
}
class Dog{
	
}
