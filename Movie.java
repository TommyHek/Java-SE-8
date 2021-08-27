package pro_1;
import java.util.Date;
public class Movie{
	private String name;
	private Date date;
	private String actor;
	
	void setName(String name) {
		this.name=name;
	}
	void setDate(Date date) {
		this.date=date;
	}
	void setActor(String actor) {
		this.actor=actor;
	}
	
	String getName() {
		return this.name;
	}
	Date getDate() {
		return this.date;
	}
	String getActor() {
		return this.actor;
	}
	
	
	
	
}
