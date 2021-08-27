package pro_1;
import java.util.HashSet;
import java.util.Set;
public class c58 {
	public static void main(String[] args) {
		ticketAgentBook("1A");
		ticketAgentBook("1A");
	}
	private static final c58 INSTANCE=new c58();
	public static c58 getINSTANCE() {
		return INSTANCE;
	}
	private Set<String> availSeats;
	c58(){
		this.availSeats=new HashSet<String>();
		this.availSeats.add("1A");
		this.availSeats.add("1B");
	}
	boolean bookSet(String seat) {
		return this.availSeats.remove(seat);
	}
	private static void ticketAgentBook(String seat) {
		c58 o=c58.getINSTANCE();
		System.out.println(o.bookSet(seat));
	}
}
