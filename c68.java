package pro_1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class c68 {
	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		List<Integer> list2=new ArrayList<>();
		list.add("June 12");
		list.add("Dragon Boat Festival");
		System.out.println("Unsorted: s"+list);
		Collections.sort(list);
		System.out.println("Sort "+list);
		//
		list2.add(2018);
		list2.add(612);
		list2.add(618);
		System.out.println("Unsorted: "+list2);
		Collections.sort(list2);
		System.out.println("Sort: "+list2);
		//
		
	}
	static class DESCInteger implements Comparator<Integer>{
		public int compare(Integer a,Integer b) {
			return b-a;
		}
	}
	static class DESCString implements Comparator<String>{
		public int compare(String a,String b) {
			return b.compareTo(a);
		}
	}
	
}
class Movie2 implements Comparable<Movie2>{
	private String title;
	private String genre;
	private String actor;
	Movie2(String title,String genre,String actor){
		this.actor=actor;
		this.genre=genre;
		this.title=title;
	}
	public int compareTo(Movie2 mm) {
		return title.compareTo(mm.title);
	}
	public String toString() {
		return this.title+", "+this.genre+", "+this.actor+"\n";
	}
	public String getTitle() {
		return this.title;
	}
}
class DESCMovie implements Comparator<Movie2>{
	public int compare(Movie2 m1,Movie2 m2) {
		return m2.getTitle().compareTo(m1.getTitle());
	}
}