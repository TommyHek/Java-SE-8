package pro_1;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
public class c35 {
	public static void main(String[] args) {
		//Date with DateFormat
		Date d=new Date();
		DateFormat[] df=new DateFormat[6];
		df[0]=DateFormat.getInstance();
		df[1]=DateFormat.getDateInstance();
		df[2]=DateFormat.getDateInstance(DateFormat.SHORT);
		df[3]=DateFormat.getDateInstance(DateFormat.MEDIUM);
		df[4]=DateFormat.getDateInstance(DateFormat.LONG);
		df[5]=DateFormat.getDateInstance(DateFormat.FULL);
		for(DateFormat dd:df) {
			System.out.println(dd.format(d));
		}
		SimpleDateFormat sdfA=new SimpleDateFormat("mm",Locale.US);
		System.out.println(sdfA.format(d));
		SimpleDateFormat sdfB=new SimpleDateFormat("MM",Locale.US);
		System.out.println(sdfB.format(d));
		SimpleDateFormat sdfC=new SimpleDateFormat("MMM",Locale.US);
		System.out.println(sdfC.format(d));
		SimpleDateFormat sdfD=new SimpleDateFormat("MMMM",Locale.US);
		System.out.println(sdfD.format(d));
	}
}
