package pro_1;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.text.ParseException;
public class c36 {
	public static void main(String[] args) {
		
		Date d=new Date();
		DateFormat df=DateFormat.getInstance().getDateInstance(DateFormat.FULL);
		String s=df.format(d);
		System.out.println(s);
		try {
			d=df.parse(s);
			System.out.println(d);
		}catch(ParseException e) {
			System.out.println("parse exception");
		}
		//setting country
		Locale ITW=Locale.TAIWAN;
		Locale ICN=Locale.CHINA;
		Locale IFR=Locale.FRANCE;
		Locale IJP=Locale.JAPAN;
		Locale IUS=Locale.US;
		DateFormat dfTW=DateFormat.getDateInstance(DateFormat.FULL,ITW);
		DateFormat dfCN=DateFormat.getDateInstance(DateFormat.FULL,ICN);
		DateFormat dfFR=DateFormat.getDateInstance(DateFormat.FULL,IFR);
		DateFormat dfJP=DateFormat.getDateInstance(DateFormat.FULL,IJP);
		DateFormat dfUS=DateFormat.getDateInstance(DateFormat.FULL,IUS);
		System.out.println("Taiwan:"+dfTW.format(d));
		System.out.println("Japan:"+dfJP.format(d));
		System.out.println("France:"+dfFR.format(d));
		System.out.println("China:"+dfCN.format(d));
		System.out.println("United States:"+dfUS.format(d));
		Locale[] l1= {Locale.FRANCE,Locale.US,Locale.CANADA,Locale.GERMAN,Locale.CHINA};
		for(Locale l:l1) {
			dfTW=DateFormat.getDateInstance(DateFormat.FULL,l);
			System.out.println(dfTW.format(d));
		}
		Locale loc5=new Locale("ru","RU");
		Locale loc6=new Locale("tom","Handsome");
		dfTW=DateFormat.getDateInstance(DateFormat.FULL,loc5);
		System.out.println("Russia:"+dfTW.format(d));
		dfTW=DateFormat.getDateInstance(DateFormat.FULL,loc6);
		System.out.println("United States:"+dfTW.format(d));
		System.out.println(loc6.getCountry());
		Locale loc7=Locale.KOREA;
		dfTW=DateFormat.getDateInstance(DateFormat.FULL,loc7);
		System.out.println("Korea:"+dfTW.format(d));
		Locale IITW=Locale.TAIWAN;
		Locale LLCN=new Locale("zh","CN");
		Locale LLJP=new Locale("ja","JP");

		//Output
		System.out.println("Locale:"+IITW);
		System.out.println("Locale:"+LLCN);
		System.out.println("Locale:"+LLJP);
		System.out.println(loc6);//LOL
		System.out.println("Locale"+IITW.getCountry());
		System.out.println("Locale"+LLCN.getCountry());
		System.out.println("Locale"+LLJP.getCountry());
		System.out.println(IITW.getDisplayCountry(IITW));
		System.out.println(LLCN.getDisplayCountry(LLCN));
		System.out.println(LLJP.getDisplayCountry(LLJP));
		System.out.println(loc6.getDisplayCountry(loc6));
	}
}
