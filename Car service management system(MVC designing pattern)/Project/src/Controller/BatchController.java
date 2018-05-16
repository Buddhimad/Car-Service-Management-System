package Controller;
import DBConnection.DBConnection;
import Model.Batch;
import java.sql.*;
import java.util.ArrayList;

public class BatchController {
    public static boolean addBatch(Batch b1) throws SQLException,ClassNotFoundException{
            String sql="insert into batch values(?,?,?,?)";
            Connection con=DBConnection.getDBConnection().getConnection();
            PreparedStatement stm=con.prepareStatement(sql);
            stm.setObject(1, b1.getBatchno());
            stm.setObject(2, b1.getInvoiceno());
            stm.setObject(3, b1.getAmount());
            stm.setObject(4, b1.getDate());
            int x=stm.executeUpdate();
            return x>0;
   }
    public static boolean Updatebatch(Batch b2) throws SQLException,ClassNotFoundException{
            String sql="Update batch set invoicenp=?,amount=?,date=? where batchno=?";
            Connection con1=DBConnection.getDBConnection().getConnection();
            PreparedStatement stm=con1.prepareStatement(sql);
            stm.setObject(4, b2.getBatchno());
            stm.setObject(1, b2.getInvoiceno());
            stm.setObject(2, b2.getAmount());
            stm.setObject(3, b2.getDate());
            int y=stm.executeUpdate();
            return y>0;
    }
    public static Batch searchbatch(String batchno) throws SQLException,ClassNotFoundException{
            String sql="select * from where batchno='"+batchno+"'";
            Connection con2=DBConnection.getDBConnection().getConnection();
            Statement stm=con2.createStatement();
            ResultSet rst=stm.executeQuery(sql);
            if(rst.next()){
            Batch b1=new Batch(rst.getString("batchno"),rst.getString("invoiceno"),rst.getDouble("amount"),rst.getString("date"));
            return b1;
            }
            return null;
    }
    public static boolean deletebatch(String batchno) throws SQLException,ClassNotFoundException{
            String sql="Delete from batch where batchno='"+batchno+"'";
            Connection con3=DBConnection.getDBConnection().getConnection();
            PreparedStatement stm=con3.prepareStatement(sql);
            int z=stm.executeUpdate();
            return z>0;
    }
    public static Batch[] showbatch() throws SQLException,ClassNotFoundException{
            String sql="select * from batch";
            Connection con4=DBConnection.getDBConnection().getConnection();
            Statement stm=con4.createStatement();
            ResultSet rst=stm.executeQuery(sql);
            int count=0;
            while(rst.next()){
                count++;
            }
            Batch [] list=new Batch[count];
            rst.beforeFirst();
            for(int i=0;rst.next();i++){
            list [i]=new Batch(rst.getString("batcno"),rst.getString("invoiceno"),rst.getDouble("amount"),rst.getString("date"));
            
            }
            return list;
    }

    public static ArrayList<String> showbatchno() throws SQLException,ClassNotFoundException {
      String sql="select * from batch";
      Connection con=DBConnection.getDBConnection().getConnection();
      Statement stm=con.createStatement();
      ResultSet rst=stm.executeQuery(sql);
      ArrayList<String>list=new ArrayList<>();
      while(rst.next()){
          list.add(rst.getString("batchno"));
      }
      return list;
    }
}
