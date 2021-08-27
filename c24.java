package pro_1;

public class c24 {
	
	public static void main(String[] args){
		//try catch application
		String s="Hello";
		try {
			System.out.println(s.charAt(11));
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}catch(RuntimeException e) {
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Finally");
		}
		
		int ar[]= {1,2,3};
		
		try {
			System.out.println(ar[3]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}catch(RuntimeException e) {
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}catch(Throwable e) {
			System.out.println(e.getMessage());
		}
		
		try {
			int a=1/0;
		}catch(ArithmeticException e){
			System.out.println(e.getMessage());
		}catch(RuntimeException e) {
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}catch(Throwable e) {
			System.out.println("Finally");
		}
	}
	
	
	
}
