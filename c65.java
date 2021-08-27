package pro_1;

public class c65 {
	public static void main(String[] args) {
		new O().makel();
	}
}
class O{
	//inner class using
	private int x=67;
	void makel() {
		I i=new I();
		i.seeO();
	}
	class I{
		void seeO() {
			System.out.println("O x=: "+x);
			System.out.println("I: "+this);
			System.out.println("O: "+(O.this).toString());
		}
	}
}
