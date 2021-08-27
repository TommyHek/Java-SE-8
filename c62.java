package pro_1;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardWatchEventKinds.ENTRY_CREATE;
import static java.nio.file.StandardWatchEventKinds.ENTRY_DELETE;
import static java.nio.file.StandardWatchEventKinds.ENTRY_MODIFY;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
public class c62 {
	public static void main(String[] args) throws IOException{
		//tracking events of the folder
		Path d=Paths.get("C:\\Users\\tommy\\Desktop\\NTUT");
		WatchService w=FileSystems.getDefault().newWatchService();
		d.register(w,ENTRY_DELETE);
		d.register(w, ENTRY_DELETE,ENTRY_CREATE);
		d.register(w,ENTRY_DELETE,ENTRY_CREATE,ENTRY_MODIFY);
		while(true) {
			WatchKey key;
			try {
				key=w.take();
			}catch(InterruptedException e) {
				return;
			}
			for(WatchEvent<?>e:key.pollEvents()) {
				WatchEvent.Kind<?> kind=e.kind();
				System.out.println(kind.name()+","+kind.type()+","+e.context());
			}
			key.reset();
		}
	}
}
