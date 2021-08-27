package pro_1;
import java.util.Date;
import java.util.Calendar;
public class c34 {
	public static void main(String[] args) {
		//Date Calendar application
		Date d=new Date();
		System.out.println(d);
		d.setTime(d.getTime()+2*24*60*60*1000);
		System.out.println(d);
		//Calendar
		Calendar c=Calendar.getInstance();
		System.out.println(c.get(Calendar.YEAR)+"/"+
						c.get(Calendar.MONTH)+"/"+
						c.get(Calendar.DAY_OF_MONTH)+" "+
						c.get(Calendar.HOUR_OF_DAY)+":"+
						c.get(Calendar.MINUTE)+":"+
						c.get(Calendar.SECOND)+":"+
						c.get(Calendar.MILLISECOND));
		c.setTime(d);
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		if(Calendar.SUNDAY==c.getFirstDayOfWeek()) {
			System.out.println("Sunday is the first fay of week	");
		}
		c.add(Calendar.HOUR,3);
		d=c.getTime();
		System.out.println(d);
		c.add(Calendar.MONTH, -1);
		d=c.getTime();
		System.out.println(d);
		c.add(Calendar.YEAR, 1);
		d=c.getTime();
		System.out.println(d);
		c.add(Calendar.HOUR, 2*24);
		d=c.getTime();
		System.out.println(d);
	}
}
