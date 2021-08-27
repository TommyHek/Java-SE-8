package pro_1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
public class c63 {
	public static void main(String[] args) {
		 Factory f=new FactoryImpl();
	        BookDAO book=f.createDAO();
	        System.out.println(f.getClass());
	        System.out.println((f.createDAO()).getClass());
	        
	        
	        
	}
}
abstract class a1{
	ff b1() {
		return new a2();
	}
	abstract void m2();
}
class bb{
	a1 aaa() {
		return new a3();
		
	}
	void printt() {
		aaa();
	}
}
class a2 extends a1 implements ff{
	
	void m2() {
		
	}
}
class a3 extends a2{
	void m() {
		System.out.println("a3's m");
	}
}
interface ff{
	
}
interface BookDAO {
    Collection<Book1> findAllBooks();
    Book1 findBookByIsbn(Book1 book);
     void create(Book1 book);
     void delete(Book1 book);
     void update(Book1 book);
}
class FactoryImpl extends Factory {
	public BookDAO createDAO(){
        return new BookDAOImpl();
    }
    
}
abstract class Factory {
    public  abstract BookDAO createDAO();
}
class BookDAOImpl implements BookDAO{
    
    private static Map<String , Book1> bookstore=new HashMap<String , Book1>();
    
    public Collection<Book1> findAllBooks(){
        return bookstore.values();
    }
    public Book1 findBookByIsbn(Book1 book){
        return bookstore.get(book.getIsbn());
    }
     public void create(Book1 book){
         //bookstore.put(book.getIsbn(), book);
     }
     public void delete(Book1 book){
         bookstore.remove(book.getIsbn());
     }
     public void update(Book1 book){
         
     }
	
    
}
class Book1{
    private String isbn;
    private String title;
    private String author;
    //setters and getters
     public String getIsbn(){
         return isbn;
     }
    
}