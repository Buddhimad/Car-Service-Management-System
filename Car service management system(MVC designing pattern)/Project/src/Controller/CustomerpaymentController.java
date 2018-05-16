package Controller;

import DBConnection.DBConnection;
import Model.Customerpayment;
import java.sql.SQLException;
import java.sql.*;
import java.util.ArrayList;
public class CustomerpaymentController {
    public static boolean addcustomerpayment(Customerpayment cp1) throws SQLException,ClassNotFoundException{
        String sql="insert into Customerpayment values(?,?,?,?)";
        Connection con=DBConnection.getDBConnection().getConnection();
        PreparedStatement stm=con.prepareStatement(sql);
        stm.setObject(1, cp1.getPaymentID());
        stm.setObject(2,cp1.getInvoiceno());
        stm.setObject(3, cp1.getAmount());
        stm.setObject(4, cp1.getDate());
        int x=stm.executeUpdate();
        return x>0;
    }
    public static boolean updatecustomerpayment(Customerpayment cp2) throws SQLException,ClassNotFoundException{
        String sql="update customerpayment set invoiceno=?,amount=?,date=? where PaymentID=?";
        Connection con1=DBConnection.getDBConnection().getConnection();
        PreparedStatement stm=con1.prepareStatement(sql);
        stm.setObject(4,cp2.getPaymentID());
        stm.setObject(1, cp2.getInvoiceno());
        stm.setObject(2,cp2.getAmount());
        stm.setObject(3,cp2.getDate());
        int y=stm.executeUpdate();
        return y>0;
    }
    public static Customerpayment searchcustomerpayment(String paymentid) throws SQLException,ClassNotFoundException{
        String sql="select * from customerpayment where PaymentID='"+paymentid+"'";
        Connection con2=DBConnection.getDBConnection().getConnection();
        Statement stm=con2.createStatement();
        ResultSet rst=stm.executeQuery(sql);
        if(rst.next()){
            Customerpayment cpp=new Customerpayment(rst.getString("PaymentID"),rst.getString("invoiceno"),rst.getDouble("amount"),rst.getString("date"));
            return cpp;
        }
        return null;
    }
    public static boolean deletecustomer(String id) throws SQLException,ClassNotFoundException{
        String sql="Delete from customerpayment where PaymentID='"+id+"'";
        Connection con3=DBConnection.getDBConnection().getConnection();
        PreparedStatement stm=con3.prepareStatement(sql);
        int z=stm.executeUpdate();
        return z>0;
    }

    public static Customerpayment[] searchbyinvoiceno(String invoiceno) throws SQLException,ClassNotFoundException {
        String sql="select * from customerpayment where invoiceno='"+invoiceno+"'";
        Connection connection=DBConnection.getDBConnection().getConnection();
        Statement stm=connection.createStatement();
        ResultSet rst=stm.executeQuery(sql);
        int count=0;
        while(rst.next()){
            count++;
        }
        Customerpayment [] payment=new Customerpayment[count];
        rst.beforeFirst();
        for(int i=0;rst.next();i++){
            payment[i]=new Customerpayment(rst.getString("PaymentID"),rst.getString("invoiceno"),rst.getDouble("amount"),rst.getString("date"));
        }
        return payment;
    }

    public static Customerpayment[] getAll() throws SQLException,ClassNotFoundException {
        String sql="select * from customerpayment";
        Connection connection=DBConnection.getDBConnection().getConnection();
        Statement stm=connection.createStatement();
        ResultSet rst=stm.executeQuery(sql);
        int count=0;
        while(rst.next()){
            count++;
        }
        Customerpayment [] payment=new Customerpayment[count];
        rst.beforeFirst();
        for(int i=0;rst.next();i++){
            payment[i]=new Customerpayment(rst.getString("PaymentID"),rst.getString("invoiceno"),rst.getDouble("amount"),rst.getString("date"));
        }
        return payment;
    }

    public static boolean deletepayment(String paymentID, String invoiceno) throws SQLException,ClassNotFoundException {
            Connection connection=DBConnection.getDBConnection().getConnection();
           
            try{
                 connection.setAutoCommit(false);
                String sql="Delete from customerpayment where PaymentID='"+paymentID+"'";
                PreparedStatement stm=connection.prepareStatement(sql);
                boolean IsDeletepayment=stm.executeUpdate()>0;
                if(IsDeletepayment){
                    String sql2="Delete from serviceinvoice where invoiceno='"+invoiceno+"'";
                    PreparedStatement stm1=connection.prepareStatement(sql2);
                    boolean IsInvoiceDeleted=stm1.executeUpdate()>0;
                    if(IsInvoiceDeleted){
                        String sql3="Delete from serviceitemdetails where invoiceno='"+invoiceno+"'";
                        PreparedStatement stm2=connection.prepareStatement(sql3);
                        boolean IsServiceitemdetailsDeleted=stm2.executeUpdate()>0;
                        if(IsServiceitemdetailsDeleted){
                        String sql4="Delete from servicedetails where invoiceno='"+invoiceno+"'";
                        PreparedStatement stm3=connection.prepareStatement(sql4);
                        boolean IsServicedetailsDeleted=stm3.executeUpdate()>0;
                        if(IsServicedetailsDeleted){
                            connection.commit();
                            return true;
                        }else{
                            connection.rollback();
                            return false;
                        }//4
                        }else{
                            connection.rollback();
                            return false;
                        }//3
                    }else{
                        connection.rollback();
                        return false;
                    }//2
                }else{
                    connection.rollback();
                    return false;
                }//1
            }finally{
                    connection.setAutoCommit(true);
    
        }
    }

    public static ArrayList<String> getlastpaymentid() throws SQLException,ClassNotFoundException {
          String sql="SELECT PaymentID FROM customerpayment ORDER BY PaymentID DESC LIMIT 1";
          Connection connection=DBConnection.getDBConnection().getConnection();
          Statement stm=connection.createStatement();
          ResultSet rst=stm.executeQuery(sql);
          ArrayList<String>paymentID=new ArrayList<>();
         while(rst.next()){
            paymentID.add(rst.getString("PaymentID"));
        }
        return paymentID;
    }
    
}
