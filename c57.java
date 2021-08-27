package pro_1;
import java.util.HashSet;
import java.util.Set;

public class c57 {
//set using
	private Set<String> availSeats;
	c57(){
		this.availSeats=new HashSet<String>();
		this.availSeats.add("1A");
		this.availSeats.add("1A");
	}
	public static void main(String[] args) {
		ticketAgentBook("1A");
		ticketAgentBook("1A");
		}
	
	boolean  bookSeat(String seat) {
		return this.availSeats.remove(seat);
	}
	private static void ticketAgentBook(String seat) {
		c57 o=new c57();
		System.out.println(o.bookSeat(seat));
	}
}
