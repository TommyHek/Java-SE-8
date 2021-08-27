package pro_1;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class c51 {
	public static void main(String[] args) {
		 String pattern="glob:*???_*1?";
	        Path p=Paths.get("C:\\Users\\tommy\\Desktop");
	        try{
	            Files.walkFileTree(p, new MyFileVisitor(pattern));
	            
	        }catch(IOException e){
	            System.out.println("error");
	        }
	}
}
class MyFileVisitor	extends SimpleFileVisitor<Path>{
	private PathMatcher m;
	
	public MyFileVisitor(String p) {
		m=FileSystems.getDefault().getPathMatcher(p);
	}
	
	public FileVisitResult visitFile(Path path,BasicFileAttributes a) {
		Path name=path.getFileName();
		if(m.matches(name)) {
			System.out.println(path.getFileName());
		}
		return FileVisitResult.CONTINUE;
	}
}
