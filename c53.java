package pro_1;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.AclFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.NoSuchFileException;
public class c53 {
	public static void main(String[] args) throws IOException{
		/*Path p=Paths.get("a","b","c","d","e","f.txt");
		int sp=1;
		for(Path pp:p) {
			System.out.printf("%"+sp+"s|-%s","",pp);
			sp+=2;
		}*/
		
		/*Path pp=Paths.get("a\\.\\b\\.\\c\\.\\d\\.\\e\\.\\f.txt");//current directory
		System.out.println(pp.normalize());
		Path ppp=Paths.get("a\\..\\b\\..\\c\\..\\d\\..\\e\\..\\f.txt");//up-level directory
		System.out.println(ppp.normalize());
		Path p4=Paths.get("\\sales\\quarter\\..\\f.txt");
		p4.relativize(Paths.get("\\sales\\f2.txt"));
		System.out.println(p4);*/
		
		Path p5=Paths.get("f.txt");
		BasicFileAttributes b=Files.readAttributes(p5,BasicFileAttributes.class);
		System.out.println("Create:"+b.creationTime());
		System.out.println("Access:"+b.lastAccessTime());
		System.out.println("Modify:"+b.lastModifiedTime());
		System.out.println("Directory:"+b.isDirectory());
		
		//Files.setAttribute(p5, "dos:hidden", true);
		//Files.setAttribute(p5,"dos:readonly",true);
		Files.setAttribute(p5, "dos:hidden",false);
		Files.setAttribute(p5, "dos:readonly",false);
		DosFileAttributes dfa=Files.readAttributes(p5, DosFileAttributes.class);
		System.out.println(dfa.isHidden());
		System.out.println(dfa.isReadOnly());
		
		//
		AclFileAttributeView attr=Files.getFileAttributeView(p5, AclFileAttributeView.class);
		System.out.println(attr.getOwner());
		
 	}
}
