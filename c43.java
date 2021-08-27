package pro_1;

import java.util.Locale;
import java.util.ResourceBundle;

public class c43 {
	public static void main(String[] args) {
		//Locale l=Locale.FRANCE;
		Locale l=new Locale("zh","TW");
		//Locale l=new Locale("fr_FR");
		 
		ResourceBundle rb=ResourceBundle.getBundle("Messages",l);
		System.out.println(rb.getString("greet"));*/
		ResourceBundle res=ResourceBundle.getBundle("message",l);
		System.out.print(res.getString("cc.openhome.welcome")+"!");
		System.out.println(res.getString("cc.openhome.name")+"!");
	}
	
}
