package pro_1;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
public class c44 {
	public static void main(String[] args) {
		//java io application
		File f=new File("t.txt");
		System.out.println(f.exists());
		try {
			f.createNewFile();
			System.out.println(f.exists());
		}catch(Throwable e) {
			
		}
		char[] in=new char[50];
		int size=0;
		try {
			File f2=new File("t2.txt");
			FileWriter fw=new FileWriter(f2);
			fw.write("Java 7\n");
			fw.write("Java 98\n");
			fw.flush();
			fw.close();
			FileReader fr=new FileReader(f2);
			size=fr.read(in);
			System.out.println("size: "+size);
			for(char c:in) {
				System.out.print(c+" ");
			}
			System.out.println();
			fr.close();
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		File f3=new File("t3.txt");
		try {
			//write
			FileWriter fw=new FileWriter(f3);
			PrintWriter pw=new PrintWriter(fw);
			pw.println("Java 7");
			pw.println("Java 8");
			pw.flush();
			pw.close();
			System.out.println(f3.isFile());
			//read
			FileReader fr=new FileReader(f3);
			BufferedReader br=new BufferedReader(fr);
			String data="";
			while((data=br.readLine())!=null) {
				System.out.println(data);
			}
			br.close();
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		File d2=new File("C:\\Users\\tommy\\Desktop");
		File d3=new File(d2,"Greetings.txt");
		System.out.println(d2.isDirectory());
		System.out.println(d3.isFile());
		try {
			d3.createNewFile();
			
			FileWriter fw=new FileWriter(d3);
			PrintWriter pw=new PrintWriter(fw);
			FileReader fr=new FileReader(d3);
			BufferedReader br=new BufferedReader(fr);
			String s="";
			pw.println("Hello World!");
			pw.flush();
			pw.close();
			
			
			String data="";
			while((data=br.readLine())!=null){
				System.out.print(data);
			}
			
			System.out.println();
		}catch(IOException e){
			
		}
		System.out.println(d3.isFile());
	}
}
