package Controller;
import DBConnection.DBConnection;
import Model.Customer;
import java.sql.*;
import java.util.ArrayList;
public class CustomerController {
    public static boolean addcustomer(Customer c) throws SQLException,ClassNotFoundException{
        String sql="insert into customer values(?,?,?,?,?)";
        Connection con=DBConnection.getDBConnection().getConnection();
        PreparedStatement stm=con.prepareStatement(sql);
        stm.setObject(1,c.getCustomerID());
        stm.setObject(2,c.getName());
        stm.setObject(3, c.getAddress());
        stm.setObject(4,c.getTelephoneno());
        stm.setObject(5, c.getDate());
        int x=stm.executeUpdate();
        return x>0;
    }
    public static boolean updatecustomer(Customer c1) throws SQLException,ClassNotFoundException{
        String sql="Update Customer set name=?,address=?,telephoneno=?,date=? where CustomerID=?";
        Connection con2=DBConnection.getDBConnection().getConnection();
        PreparedStatement stm=con2.prepareStatement(sql);
        stm.setObject(5, c1.getCustomerID());
        stm.setObject(1, c1.getName());
        stm.setObject(2, c1.getAddress());
        stm.setObject(3,c1.getTelephoneno());
        stm.setObject(4, c1.getDate());
        int y=stm.executeUpdate();
        return y>0;
    }
    public static boolean deletecustomer(String CustomerID) throws SQLException,ClassNotFoundException{
            String sql="Delete from Customer where CustomerID='"+CustomerID+"'";
            Connection con3=DBConnection.getDBConnection().getConnection();
            PreparedStatement stm=con3.prepareStatement(sql);
            int z=stm.executeUpdate();
            return z>0;
    }
    public static Customer [] searchcustomer(String name) throws SQLException,ClassNotFoundException{
            String sql="select * from Customer where name='"+name+"'";
            Connection con4=DBConnection.getDBConnection().getConnection();
            Statement stm=con4.createStatement();
            ResultSet rst=stm.executeQuery(sql);
//            if(rst.next()){
//            Customer c4=new Customer(rst.getString("CustomerID"),rst.getString("name"),rst.getString("address"),rst.getInt("telephoneno"),rst.getString("date"));
//            return c4;
//            }
//            return null;
            int count=0;
            while(rst.next()){
                count++;
            }
            Customer [] list=new Customer[count];
            rst.beforeFirst();
            for(int i=0;rst.next();i++){
                list [i]=new Customer(rst.getString("CustomerID"),rst.getString("name"),rst.getString("address"),rst.getInt("telephoneno"),rst.getString("date"));
                
            }
            return list;
    }
    public static Customer[] viewcustomer() throws SQLException,ClassNotFoundException{
            String sql="select * from Customer";
            Connection con5=DBConnection.getDBConnection().getConnection();
            Statement stm=con5.createStatement();
            ResultSet rst=stm.executeQuery(sql);
            int count=0;
            while(rst.next()){
                count++;
            }
            Customer [] list=new Customer[count];
            rst.beforeFirst();
            for(int i=0;rst.next();i++){
                list [i]=new Customer(rst.getString("CustomerID"),rst.getString("name"),rst.getString("address"),rst.getInt("telephoneno"),rst.getString("date"));
                
            }
            return list;
    }
    public static ArrayList<String> getCustomerName() throws SQLException,ClassNotFoundException{
        String sql="select name from Customer";
        Connection con=DBConnection.getDBConnection().getConnection();
        Statement stm=con.createStatement();
        ResultSet rst=stm.executeQuery(sql);
        ArrayList<String>customername=new ArrayList<>();
        while(rst.next()){
            customername.add(rst.getString("name"));
        }
        return customername;
    }
    public static Customer getCustomer(String id) throws SQLException,ClassNotFoundException{
         String sql="select * from Customer where CustomerID='"+id+"'";
        Connection con=DBConnection.getDBConnection().getConnection();
        Statement stm=con.createStatement();
        ResultSet rst=stm.executeQuery(sql);
        if(rst.next()){
        Customer customerlist=new Customer(rst.getString("CustomerID"),rst.getString("name"),rst.getString("address"),rst.getInt("telephoneno"),rst.getString("date"));
        return customerlist;
        }
        return null;
    }

    

    public static Customer getName(String customerID) throws SQLException,ClassNotFoundException {
        String sql="select * from customer where CustomerID='"+customerID+"'";
        Connection con=DBConnection.getDBConnection().getConnection();
        Statement stm=con.createStatement();
        ResultSet rst=stm.executeQuery(sql);
        if(rst.next()){
        Customer customerlist=new Customer(rst.getString("CustomerID"),rst.getString("name"),rst.getString("address"),rst.getInt("telephoneno"),rst.getString("date"));
        return customerlist;
        }
            return null;
}
    public static ArrayList<String> gettest() throws SQLException,ClassNotFoundException{
        String sql="select * from customer c,vehicle v where c.CustomerID=v.CustomerID";
        Connection con=DBConnection.getDBConnection().getConnection();
        Statement stm=con.createStatement();
        ResultSet rst=stm.executeQuery(sql);
        ArrayList<String>list=new ArrayList<>();
        while(rst.next()){
           // list.add(rst.getString("CustomerID"),rst.getString("name"),rst.getString("address"),rst.getInt("telephoneno"),rst.getString("date"),rst.getString("vehicle no"),rst.getString("brand"),rst.getString("model"));
        }
        return list;
    }

    public static ArrayList<String> getlastcustomerid() throws SQLException,ClassNotFoundException {
        String sql="SELECT * FROM customer ORDER BY customerID DESC LIMIT 1";
        Connection connection=DBConnection.getDBConnection().getConnection();
        Statement stm=connection.createStatement();
        ResultSet rst=stm.executeQuery(sql);
        ArrayList<String>customerid=new ArrayList<>();
        while(rst.next()){
        customerid.add(rst.getString("customerID"));
        }
        return customerid;
    }
}