package pro_1;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
public class c37 {
	public static void main(String[] args) {
		float f=123.456F;
		NumberFormat[]	nf=new NumberFormat[10+2];
		nf[0]=NumberFormat.getInstance();
		nf[1]=NumberFormat.getInstance(Locale.TAIWAN);
		nf[2]=NumberFormat.getCurrencyInstance();
		nf[3]=NumberFormat.getCurrencyInstance(Locale.TAIWAN);
		nf[4]=NumberFormat.getInstance(Locale.FRANCE);
		nf[5]=NumberFormat.getCurrencyInstance(Locale.FRANCE);
		nf[6]=NumberFormat.getInstance(Locale.JAPAN);
		nf[7]=NumberFormat.getCurrencyInstance(Locale.JAPAN);
		nf[8]=NumberFormat.getInstance(Locale.CHINA);
		nf[9]=NumberFormat.getCurrencyInstance(Locale.CHINA);
		nf[10]=NumberFormat.getInstance(Locale.KOREA);
		nf[11]=NumberFormat.getCurrencyInstance(Locale.KOREA);
		
		for(NumberFormat n:nf) {
			System.out.println(n.format(f));
		}
		nf[0].setMaximumFractionDigits(2);
		nf[0].setMinimumFractionDigits(2);
		System.out.println(f+" "+nf[0].format(f));
		try {
			System.out.println(nf[0].parse("987.654321")+" ");
			nf[0].setParseIntegerOnly(true);
			System.out.println(nf[0].parse("987.654321")+" ");
		}catch(ParseException e) {
			System.out.println("parse exception");
		}
		int i=1_234;
		String s="1_234";
		
		//System.out.println(Integer.parseInt(s));
		NumberFormat nf4=NumberFormat.getIntegerInstance();
		System.out.println(nf4.format(f));
		NumberFormat nf5=DecimalFormat.getIntegerInstance();
		System.out.println(nf5.format(f));
		
		Integer int1=999999999;
		Double	double1=new Double("1.1");
		Number int2=999999999;//abstract class
		Number double2=0;
		System.out.println(int2.getClass()==int1.getClass());//true
		System.out.println(int1+double1);
		System.out.println(int2.intValue()+double2.intValue());
		
		int n=2;
		double cost=24.99;
		String color="brown";
		char sex='F';
		System.out.printf("I have %01d %s T-shirt each one cost $%.2f %n", n,color,cost);
		String s1=String.format("I have %1d %s T-shirt each one cost $%.2f %n",n,color,cost);
		System.out.println(s1);
		String ss="%4$s %4$s %b %4$s";
		String[] var={"2","13213215","33"};
		System.out.println(String.format(ss, var));
	}
}
