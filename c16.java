package pro_1;

public class c16 {
	public static void main(String[] args) {
		//String application:replace concat substring
		
		String p="Pen";
		p.toLowerCase();
		p=p.concat("Box".toLowerCase());
		System.out.println(p.substring(4,6));//>=4 <6
		
		String s="hello world";
		System.out.println(s.length());
		System.out.println(s.charAt(10));
		String ss="abcdefg";
		//ss=ss.replace("abc", "123");
		System.out.println(ss);
		ss+="xyz";
		System.out.println(ss);
		ss=ss.replace("abc","123").concat("789").concat("xyz");
		System.out.println(ss);
		ss=ss.substring(8);
		System.out.println(ss);
		ss=ss.substring(0, 1);//substring = open loop lowwer<=x<upper
		System.out.println(ss);
		
		
	}
}
