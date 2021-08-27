package pro_1;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class c41 {
	public static void main(String[] args) {
		//regex=Regular Expressions
		String s="Long ago,in a galaxy far far aw11111ay0956988223";
		Pattern p=Pattern.compile("[a-zA-Z0-9]+");
		Matcher m=p.matcher(s);
		System.out.println(s);
		System.out.println("0123456789");
		
		while(m.find()) {
			System.out.print(m.group()+" ");
			
		}
		
	}
}
