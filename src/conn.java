import java.sql.*;

public class conn{

    public Connection c;
    public Statement s;

    public conn(){
        try{
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/javamain","root","Hauda@#$123a");
            s = c.createStatement();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
