import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class GetData 
{
	public static Connection getCon() throws ClassNotFoundException, SQLException
	{
		Connection con=null;
		Class.forName("com.mysql.jdbc.cj.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost/mysql", "root", "root");
		return con;
	}
	public static ArrayList getNames(String qName)
	{	
		ArrayList<String> list = new ArrayList<>();
		Connection con=null;
		try
		{
			con=getCon();
			Statement stt = con.createStatement();
			ResultSet rs = stt.executeQuery("select * from batch4 where name like '"+qName+"';");
			while(rs.next())
			{
				list.add(rs.getString("name"));
			}
		}catch(ClassNotFoundException|SQLException ex)
		{
			System.out.println(ex.getMessage());
		}
		return list;
	}
}
