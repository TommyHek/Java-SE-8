package pro_1;

public class Book {
	private String name;
	private int price;
	private boolean cd;
	Book(String name,int price,boolean cd){
		this.name=name;
		this.price=price;
		this.cd=cd;
	}
	public String toString(){
		return "-----------------\n|Book name: "+this.name+"|\n|price: "+this.price+"\t|\n|cd: "+this.cd+"\t|\n-----------------";
	}
}
