package pro_1;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
public class c48 {
	public static void main(String[] args) {
//		create folder file path using



		File d1=new File("a");
		File d2=new File("a\\b");
		d2.mkdirs();
		Path p=Paths.get("f2.txt");
		System.out.println(Files.exists(p));
			try {
			Files.createFile(p);
			}catch(IOException e) {
			System.out.println(e.getMessage());
			}
		System.out.println(Files.exists(p));
		
		Path p1=Paths.get("x");
		Path p2=Paths.get("x\\z");
		Path f=Paths.get("x\\z\\f.txt");
			try {
			Files.createDirectory(p1);
			Files.createDirectory(p2);
			Files.createFile(f);
			Files.createDirectories(p2);
			Files.createFile(f);
			}catch(IOException e) {
			Path source=Paths.get("f2.txt");
			Path target=Paths.get("f4.txt");
			try {
				Files.copy(source, target);
				Files.delete(target);
				Files.move(source, target);
				
			}catch(IOException e1) {
				System.out.println(e1.getMessage());
			}
			Path one=Paths.get("f1.txt");
			Path two=Paths.get("f2.txt");
			Path three=Paths.get("f3.txt");
			
			try {
				Files.copy(one, two);
				Files.copy(two, three,StandardCopyOption.REPLACE_EXISTING);
			}catch(IOException e2) {
				System.out.println(e2.getClass());
			}
			String pp="project/doc/index.html";
			String r=disPlayName(pp,2);
			System.out.println(r);
		}
	}
	static String disPlayName(String p,int l){
		Path pa=new File(p).toPath();
		String name=pa.getName(l).toString();
		return name;
	}
}
