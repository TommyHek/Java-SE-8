package pro_1;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
public class c23 {
	public static void main(String[] args) {	
		//create a File
		File f=new File("f.txt");
		try {
			f.createNewFile();
			System.out.println("CreatFile");
		}catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}catch(Throwable e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Finally");
		}
	}
}
