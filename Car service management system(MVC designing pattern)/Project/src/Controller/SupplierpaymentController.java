package Controller;
import DBConnection.DBConnection;
import Model.Goodreceivenote;
import Model.Supplierpayment;
import java.sql.*;
import java.util.ArrayList;

public class SupplierpaymentController {
      public static boolean addSupplierpayment(Supplierpayment b1) throws SQLException,ClassNotFoundException{
            String sql="insert into supplierpayment values(?,?,?)";
            Connection con=DBConnection.getDBConnection().getConnection();
            PreparedStatement stm=con.prepareStatement(sql);
            stm.setObject(1, b1.getPaymentID());
            stm.setObject(2, b1.getDate());
            stm.setObject(3, b1.getAmount());
           
            int x=stm.executeUpdate();
            return x>0;
   }
    public static boolean Updatesupplierpayment(Supplierpayment b2) throws SQLException,ClassNotFoundException{
            String sql="Update supplierpayment set date=?,amount=? where PaymentID=?";
            Connection con1=DBConnection.getDBConnection().getConnection();
            PreparedStatement stm=con1.prepareStatement(sql);
            stm.setObject(3, b2.getPaymentID());
            stm.setObject(1, b2.getDate());
            stm.setObject(2, b2.getAmount());
            
            int y=stm.executeUpdate();
            return y>0;
    }
    public static Supplierpayment searchsupplierpayment(String no) throws SQLException,ClassNotFoundException{
            String sql="select * from supplierpayment where paymentID='"+no+"'";
            Connection con2=DBConnection.getDBConnection().getConnection();
            Statement stm=con2.createStatement();
            ResultSet rst=stm.executeQuery(sql);
            if(rst.next()){
            Supplierpayment b1=new Supplierpayment(no,rst.getString("date"),rst.getDouble("amount"));
            return b1;
            }
            return null;
    }
    public static boolean deletesupplierpayment(String batchno) throws SQLException,ClassNotFoundException{
            String sql="Delete from supplierpayment where paymentID='"+batchno+"'";
            Connection con3=DBConnection.getDBConnection().getConnection();
            PreparedStatement stm=con3.prepareStatement(sql);
            int z=stm.executeUpdate();
            return z>0;
    }
    public static Supplierpayment[] showSupplierpayment() throws SQLException,ClassNotFoundException{
            String sql="select * from batch";
            Connection con4=DBConnection.getDBConnection().getConnection();
            Statement stm=con4.createStatement();
            ResultSet rst=stm.executeQuery(sql);
            int count=0;
            while(rst.next()){
                count++;
            }
            Supplierpayment [] list=new Supplierpayment[count];
            rst.beforeFirst();
            for(int i=0;rst.next();i++){
            list [i]=new Supplierpayment(rst.getString("paymentID"),rst.getString("date"),rst.getDouble("amount"));
            
            }
            return list;
    }

    public static double gettotalpayment() throws SQLException,ClassNotFoundException {
        String sql="select sum(amount) AS T from supplierpayment where month(date)=month(curdate())";
        Connection connection=DBConnection.getDBConnection().getConnection();
        Statement stm=connection.createStatement();
        ResultSet rst=stm.executeQuery(sql);
        if(rst.next()){
            double total=rst.getDouble("T");
            return total;
        }
        return 0;
    }

    public static Supplierpayment[] searchandshow(String paymentid) throws SQLException,ClassNotFoundException {
       String sql="select * from supplierpayment where paymentID='"+paymentid+"'";
       Connection connection=DBConnection.getDBConnection().getConnection();
       Statement stm=connection.createStatement();
       ResultSet rst=stm.executeQuery(sql);
       int count=0;
       while(rst.next()){
       count++;
       }
       Supplierpayment [] supplierpayment=new Supplierpayment[count];
       rst.beforeFirst();
       for(int i=0;rst.next();i++){
       supplierpayment[i]=new Supplierpayment(rst.getString("paymentID"),rst.getString("date"),rst.getDouble("amount"));
       }
       return supplierpayment;
    }

    public static ArrayList<String> getpaymentid() throws SQLException,ClassNotFoundException {
       String sql="select paymentID from supplierpayment";
       Connection connection=DBConnection.getDBConnection().getConnection();
        Statement stm=connection.createStatement();
        ResultSet rst=stm.executeQuery(sql);
        ArrayList<String>paymentID=new ArrayList<>();
        while(rst.next()){
            paymentID.add(rst.getString("paymentID"));
        }
        return paymentID;
    }
}
