package pro_1;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.IOException;
public class c46 {
	public static void main(String[] args) throws IOException{
		//java readfile
		Myclass mc=new Myclass();
		mc.readFile("c42.txt");
		System.out.println("file: db.txt opened");
	}
}
class Myclass{
	public void readFile(String file) throws IOException{
		InputStream in=new FileInputStream(file);
	}
}
