package pro_1;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
public class c76 {
	public static void main(String[] args) {
		USPresident usp1=new USPresident("Barack Obama","2009 to...","56th term");
	    System.out.println(usp1);
	    //Serializable
	    try (ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("USPresident.data"))){
	    	oos.writeObject(usp1);
	    }catch(FileNotFoundException e) {
	    	System.out.println("Cannot creat a file with the given file name");
	    }catch(IOException e) {
	    	System.out.println("An I/O error occurred while processing the file"); 
	    }
	    //DeSerializable
	    try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("USPresident.data"))){
	    	Object o=ois.readObject();
	    	
	    	if(o !=null && o instanceof USPresident) {
	    		USPresident usp2=(USPresident)o;
	    		System.out.println(usp2);
	    	}
	    }catch(FileNotFoundException e) {
	    	System.out.println("Cannot create a file with the given file name");
	    }catch(IOException e) {
	    	
	    }catch(ClassNotFoundException e) {
	    	
	    }
	    
	}
}
class USPresident implements Serializable{
	private  String name;
	private  String period;
	private  String term;
	public USPresident(String name,String period,String term) {
		this.name=name;
		this.period=period;
		this.term=term;
		
	}
	public String toString() {
		return "US President [name "+name+", period "+period+", term "+term+"]";
	}
}