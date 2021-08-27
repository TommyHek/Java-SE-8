package pro_1;

public class c26 {
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("hello java");
		//String applications
		int pos=0;
		try {
			for(pos=0;pos<12;pos++) {
				switch(sb.charAt(pos)) {
				case 'J':
				case 'A':
				case 'V':
					String uc=
						Character.toString(sb.charAt(pos)).toLowerCase();
					sb.replace(pos,pos+1,uc);
					break;
				}
			}
		}catch(Exception e) {
			System.out.println("out of limits");
		}
		System.out.println(sb);
		/*int[] x=null;
		for(int a:x) {
			System.out.println(a);
		}*/
		String[] names=new String[3];
		names[0]="Marry Brown";
		names[1]="Timothy";
		names[2]="Frances";
		try{
			for(String a:names) {
				String pwd=a.substring(0,3);
				System.out.println(pwd);
			}
		}catch(StringIndexOutOfBoundsException b) {
				System.out.println("String out of Bounds");
		}
		int[] ar= {1,2,3};
		for(int a:ar) {
			int b=0;
			System.out.print(a);
		}
	}
}
