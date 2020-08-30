package jdbc;
import java.sql.*;
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Statement st=null;
		Connection mycon=null;
		try {
			System.out.println("Connecting to database....");
			mycon=DriverManager.getConnection("jdbc:mysql://localhost/student","root","root");
			/*System.out.println("Creating a  database....");
		    
		     String sql = "create database student";
		     st.executeUpdate(sql);
		     System.out.println("Database created successfully...");*/
			st=mycon.createStatement();
			/*String sql="create table student "+"( name varchar(50),"+" roll integer not null,"+"age integer,"+"cgpa float,"+"company varchar(10),"+"primary key (roll))";
			st.executeUpdate(sql);
			System.out.println("Table created");
			sql="insert into student "+"values ('Anna',157,19,8.5,'TCS')";
			st.executeUpdate(sql);
			sql="insert into student "+"values ('James',233,19,8.23,'TCS')";
			st.executeUpdate(sql);
			sql="insert into student "+"values ('Sia',342,20,7.5,'TCS')";
			st.executeUpdate(sql);
			sql="insert into student "+"values ('Abhi',214,20,8.05,'CTS')";
			st.executeUpdate(sql);
			sql="insert into student "+"values ('Prakash',315,20,7.98,'CTS')";
			st.executeUpdate(sql);
			sql="insert into student "+"values ('Susan',066,20,8.8,'CTS')";
			st.executeUpdate(sql);
			sql="insert into student "+"values ('Shyam',428,20,7.2,'Infosys')";
			st.executeUpdate(sql);
			sql="insert into student "+"values ('Bhavana',228,19,7.95,'Infosys')";
			st.executeUpdate(sql);
			sql="insert into student "+"values ('Roshan',109,20,8.6,'Infosys')";
			st.executeUpdate(sql);*/
			
			String sql="select name,roll from student where cgpa>8";
			ResultSet rs=st.executeQuery(sql);
			
			while(rs.next()) {
				int roll=rs.getInt("roll");
				String name=rs.getString("name");
				System.out.print("Name : "+name);
				System.out.print(", Rollno : "+roll);
				System.out.println();
			}
			
			
			sql="select roll from student where company like '%Infosys%'";
			rs=st.executeQuery(sql);
			while(rs.next()) {
				int roll=rs.getInt("roll");
				System.out.print("Rollno : "+roll);
				System.out.println();
			}
			
			sql="select * from student order by roll";
			rs=st.executeQuery(sql);
			while(rs.next()) {
				int roll=rs.getInt("roll");
				String name=rs.getString("name");
				String c=rs.getString("company");
				Double cgpa=rs.getDouble("cgpa");
				System.out.print("Name : "+name);
				System.out.print(", Rollno : "+roll);
				System.out.print(", Company : "+c);
				System.out.print(", CGPA : "+cgpa);
				System.out.println();
			}
			rs.close();
			System.out.println("Operations done");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(st!=null) {
					st.close();
				}
			}catch(SQLException e) {
				
			}
			try {
				if(mycon!=null)
					mycon.close();
			}
			catch(SQLException e) {
				e.getMessage();
			}
		}
	}

}
