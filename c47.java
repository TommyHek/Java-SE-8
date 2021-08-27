package pro_1;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class c47 {
	public static void main(String[] args) {
		String fileName="t3.txt";
		try(BufferedReader buffln=new BufferedReader(new FileReader(fileName))){
			String line="";
			int count=1;
			
			do {
				line=buffln.readLine();
				System.out.println(count+":"+line);
				count++;
			}while(line!=null);
		}catch(IOException e) {
			System.out.println("Exception:"+e.getMessage());
		}
	}
}
