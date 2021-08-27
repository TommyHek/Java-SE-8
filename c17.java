package pro_1;

public class c17 {
	public static void main(String[] args) {'
		//StringBuilder using (very useful!!)
		
		StringBuilder sb=new StringBuilder();
		sb.append("2018");
		System.out.println(sb);
		sb.insert(4, ",07,05");
		System.out.println(sb);
		sb.append("Tom").append("my").insert(15, "LAI");//start at 15
		System.out.println(sb);
		
	}
	
}
