package Controller;
import DBConnection.DBConnection;
import Model.Goodreceivenote;
import Model.Supplierpayment;
import java.sql.*;
import java.util.ArrayList;
public class GoodreceivenoteController {
      public static boolean addGoodrecievenote(Goodreceivenote goodreceivenote) throws SQLException,ClassNotFoundException{
            String sql="insert into  values(?,?,?,?,?,?,?,?)";
            Connection con=DBConnection.getDBConnection().getConnection();
            PreparedStatement stm=con.prepareStatement(sql);
             stm.setObject(1, goodreceivenote.getGRNno());
            stm.setObject(2, goodreceivenote.getBatchno());
            stm.setObject(3, goodreceivenote.getOrderID());
            stm.setObject(4, goodreceivenote.getPaymentID());
            stm.setObject(5, goodreceivenote.getBatchno());
            stm.setObject(6, goodreceivenote.getTotaldiscount());
            stm.setObject(7, goodreceivenote.getTotalamount());
            stm.setObject(8, goodreceivenote.getQty());
            int x=stm.executeUpdate();
            return x>0;
   }
    public static boolean UpdateGoodreceivenote(Goodreceivenote goodreceivenote) throws SQLException,ClassNotFoundException{
            String sql="Update goodreceivenote set GRNno=?,batchno=?,orderID=?,paymentID=?,totaldiscount=?,totalamount=?,qty=? where batchno=?";
            Connection con1=DBConnection.getDBConnection().getConnection();
            PreparedStatement stm=con1.prepareStatement(sql);
            stm.setObject(8, goodreceivenote.getGRNno());
            stm.setObject(1, goodreceivenote.getBatchno());
            stm.setObject(2, goodreceivenote.getOrderID());
            stm.setObject(3, goodreceivenote.getPaymentID());
            stm.setObject(4, goodreceivenote.getBatchno());
            stm.setObject(5, goodreceivenote.getTotaldiscount());
            stm.setObject(6, goodreceivenote.getTotalamount());
            stm.setObject(7, goodreceivenote.getQty());
            int y=stm.executeUpdate();
            return y>0;
    }
    public static Goodreceivenote searchGRN(String no) throws SQLException,ClassNotFoundException{
            String sql="select * from where batchno='"+no+"'";
            Connection con2=DBConnection.getDBConnection().getConnection();
            Statement stm=con2.createStatement();
            ResultSet rst=stm.executeQuery(sql);
            if(rst.next()){
            Goodreceivenote goodreceivenote=new Goodreceivenote(rst.getString("GRNno"),rst.getString("batchno"),rst.getString("orderID"),rst.getString("paymentID"),rst.getDouble("totaldiscount"),rst.getDouble("totalamount"),rst.getDouble("qty"));
            return goodreceivenote;
            }
            return null;
    }
    public static boolean deleteGRN(String no) throws SQLException,ClassNotFoundException{
            String sql="Delete from goodreceivenote where GRNno='"+no+"'";
            Connection con3=DBConnection.getDBConnection().getConnection();
            PreparedStatement stm=con3.prepareStatement(sql);
            int z=stm.executeUpdate();
            return z>0;
    }
    public static boolean deleteGRN1(String no) throws SQLException,ClassNotFoundException{
            String sql="Delete from goodreceivenote where orderID='"+no+"'";
            Connection con3=DBConnection.getDBConnection().getConnection();
            PreparedStatement stm=con3.prepareStatement(sql);
            int z=stm.executeUpdate();
            return z>0;
    }
    public static Goodreceivenote[] showGRN() throws SQLException,ClassNotFoundException{
            String sql="select * from goodreceivenote";
            Connection con4=DBConnection.getDBConnection().getConnection();
            Statement stm=con4.createStatement();
            ResultSet rst=stm.executeQuery(sql);
            int count=0;
            while(rst.next()){
                count++;
            }
            Goodreceivenote [] list=new Goodreceivenote[count];
            rst.beforeFirst();
            for(int i=0;rst.next();i++){
            list [i]=new Goodreceivenote(rst.getString("GRNno"),rst.getString("batchno"),rst.getString("orderID"),rst.getString("paymentID"),rst.getDouble("totaldiscount"),rst.getDouble("totalamount"),rst.getDouble("qty"));
            
            }
            return list;
    }

    public static Goodreceivenote searchgrnbyorderid(String orderidd) throws SQLException,ClassNotFoundException {
        String sql="select * from goodreceivenote where orderID='"+orderidd+"'";
        Connection con=DBConnection.getDBConnection().getConnection();
         Statement stm=con.createStatement();
            ResultSet rst=stm.executeQuery(sql);
            if(rst.next()){
            Goodreceivenote goodreceivenote=new Goodreceivenote(rst.getString("GRNno"),rst.getString("batchno"),rst.getString("orderID"),rst.getString("paymentID"),rst.getDouble("totaldiscount"),rst.getDouble("totalamount"),rst.getDouble("qty"));
            return goodreceivenote;
            }
            return null;
    }

//    public static Goodreceivenote gettotalpayment() {
//        String sql="select sum()";
//    }

    

    public static boolean addpaymentdetails(Goodreceivenote goodreceivenote, Supplierpayment supplierpayment) throws SQLException,ClassNotFoundException {
      Connection connection=DBConnection.getDBConnection().getConnection();
      try{
          connection.setAutoCommit(false);
          String sql="Insert into goodreceivenote values(?,?,?,?,?,?,?)";
          PreparedStatement stm=connection.prepareStatement(sql);
          stm.setObject(1,goodreceivenote.getGRNno());
          stm.setObject(2,goodreceivenote.getBatchno());
          stm.setObject(3,goodreceivenote.getOrderID());
          stm.setObject(4,goodreceivenote.getPaymentID());
          stm.setObject(5,goodreceivenote.getTotaldiscount());
          stm.setObject(6,goodreceivenote.getTotalamount());
          stm.setObject(7,goodreceivenote.getQty());
          boolean Isgoodreceivenoteadded=stm.executeUpdate()>0;
          if(Isgoodreceivenoteadded){
               String sql2="Insert into supplierpayment values(?,?,?)";
               PreparedStatement stm2=connection.prepareStatement(sql2);
                stm2.setObject(1,supplierpayment.getPaymentID());
                stm2.setObject(2,supplierpayment.getDate());
                stm2.setObject(3,supplierpayment.getAmount());
                boolean Ispaymentadded=stm2.executeUpdate()>0;
                if(Ispaymentadded){
                        connection.commit();
                        return true;
                }else{
                        connection.rollback();
                        return false;
                }
          }else{
                        connection.rollback();
                        return false;
          }//1
      }finally{
                        connection.setAutoCommit(true);
      }
    }

    public static boolean allUpdate(Goodreceivenote goodreceivenote, Supplierpayment supplierpayment) throws SQLException,ClassNotFoundException {
         Connection connection=DBConnection.getDBConnection().getConnection();
      try{
          connection.setAutoCommit(false);
          String sql="Update goodreceivenote set batchno=?,orderID=?,paymentID=?,totaldiscount=?,totalamount=?,qty=? where GRNno=?";
          PreparedStatement stm=connection.prepareStatement(sql);
          stm.setObject(7,goodreceivenote.getGRNno());
          stm.setObject(1,goodreceivenote.getBatchno());
          stm.setObject(2,goodreceivenote.getOrderID());
          stm.setObject(3,goodreceivenote.getPaymentID());
          stm.setObject(4,goodreceivenote.getTotaldiscount());
          stm.setObject(5,goodreceivenote.getTotalamount());
          stm.setObject(6,goodreceivenote.getQty());
          boolean Isgoodreceivenoteupdated=stm.executeUpdate()>0;
          if(Isgoodreceivenoteupdated){
//              boolean isupdate=SupplierpaymentController.Updatesupplierpayment(supplierpayment);
               String sql2="Update supplierpayment set date=?,amount=? where PaymentID=?";
               PreparedStatement stm2=connection.prepareStatement(sql2);
                stm2.setObject(3,supplierpayment.getPaymentID());
                stm2.setObject(1,supplierpayment.getDate());
                stm2.setObject(2,supplierpayment.getAmount());
                boolean Ispaymentupdated=stm2.executeUpdate()>0;
                if(Ispaymentupdated){
                        connection.commit();
                        return true;
                }else{
                        connection.rollback();
                        return false;
                }
          }else{
                        connection.rollback();
                        return false;
          }//1
      }finally{
                        connection.setAutoCommit(true);
      }
    }

    public static ArrayList<String> getgrnno() throws SQLException,ClassNotFoundException {
        String sql="select GRNno from goodreceivenote";
        Connection connection=DBConnection.getDBConnection().getConnection();
        Statement stm=connection.createStatement();
        ResultSet rst=stm.executeQuery(sql);
        ArrayList<String>grnno=new ArrayList<>();
        while(rst.next()){
            grnno.add(rst.getString("GRNno"));
        }
        return grnno;
    }

    public static boolean deleteall(String grnno, String paymentid) throws SQLException,ClassNotFoundException {
        Connection connection=DBConnection.getDBConnection().getConnection();
        try{
            connection.setAutoCommit(false);
        String sql="Delete from goodreceivenote where GRNno='"+grnno+"'";
        PreparedStatement stm=connection.prepareStatement(sql);
        boolean isdeletedgrn=stm.executeUpdate()>0;
        if(isdeletedgrn){
        String sql2="Delete from supplierpayment where paymentID='"+paymentid+"'";
        PreparedStatement stm1=connection.prepareStatement(sql2);
        boolean isdeletepayment=stm1.executeUpdate()>0;
        if(isdeletepayment){
                connection.commit();
                return true;
        }else{
                connection.rollback();
                return false;
        }
        }else{
                connection.rollback();
                return false;
        }
        }finally{
                connection.setAutoCommit(true);
        }
    }
}
