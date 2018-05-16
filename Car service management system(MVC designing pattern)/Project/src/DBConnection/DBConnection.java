package DBConnection;
import java.sql.*;
public class DBConnection {
    private static DBConnection dbconnection;
    private Connection con;
    
    private DBConnection()throws SQLException,ClassNotFoundException{
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost/Abenayakeservice","root","mysql");
    }
    public static DBConnection getDBConnection() throws SQLException,ClassNotFoundException{
    if(dbconnection==null){
        dbconnection=new DBConnection();
    }
    return dbconnection;
    }
    public Connection getConnection(){
        return con;
    }
}
