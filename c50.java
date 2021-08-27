package pro_1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class c50 {
	public static void main(String[] args) {
	//java connecting Mysql lower version for mysql

		String url="jdbc:mysql://localhost:3306/cost";
        String userName="root";
        String password="1234";
        String s="SELECT * FROM t_cost";
        try{
            Connection cn=DriverManager.getConnection(url, userName, password);
            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery(s);
            
            if(rs.next()){
                //1
//                System.out.println(rs.getInt("no")+", "+
//                                    rs.getString("name")+", "+
//                                      rs.getInt("money")+", "+
//                                        rs.getInt("qty")+", "+
//                                            rs.getString("date"));
                //2
//                    int no=rs.getInt("no");
//                    String name=rs.getString("name");
//                    int money=rs.getInt("money");
//                    int qty=rs.getInt("qty");
//                    String date=rs.getString("date");
//                    System.out.println(no+", "+name+", "+money+", "+qty+", "+date);
                //3
                    System.out.println(rs.getInt(1)+", "+
                                         rs.getString(2)+","+
                                           rs.getInt(3)+", "+
                                             rs.getInt(4)+", "+
                                               rs.getString(5)+", "
                                               );
                //4
                
            }
            
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
	}
}
