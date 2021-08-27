package pro_1;

public class c13 {
	public static void main(String[] args) {
		int a=-10;
		int b=17;
		int c=a++;
		int d=--b;// if the operation is at the back side then it will store first values

		d=--d;
		System.out.println(c+","+d);
		int i=10,j=20,k=(j+=i/5)+(j+=3);//i=10,j=25,k=47
		System.out.println(i+" "+j+" "+k);
	}
}
