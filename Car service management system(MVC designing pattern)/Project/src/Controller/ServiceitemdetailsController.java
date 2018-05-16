package Controller;
import DBConnection.DBConnection;
import Model.serviceitemdetails;
import java.sql.*;

public class ServiceitemdetailsController {
      public static boolean addserviceitemdetails(serviceitemdetails s1) throws SQLException,ClassNotFoundException{
            String sql="insert into serviceitemdetails values(?,?,?,?,?)";
            Connection con=DBConnection.getDBConnection().getConnection();
            PreparedStatement stm=con.prepareStatement(sql);
            stm.setObject(1, s1.getInvoiceno());
            stm.setObject(2, s1.getBatchno());
            stm.setObject(3, s1.getQty());
            stm.setObject(4, s1.getTotaldiscount());
            stm.setObject(5, s1.getTotalamount());
            int x=stm.executeUpdate();
            return x>0;
   }
    public static boolean Updateserviceitems(serviceitemdetails s2) throws SQLException,ClassNotFoundException{
            String sql="Update serviceitemdetails set batchno=?,qty=?,totaldiscount=?,totalamount=? where invoiceno=?";
            Connection con1=DBConnection.getDBConnection().getConnection();
            PreparedStatement stm=con1.prepareStatement(sql);
            stm.setObject(5, s2.getInvoiceno());
            stm.setObject(1, s2.getBatchno());
            stm.setObject(2, s2.getQty());
            stm.setObject(3, s2.getTotaldiscount());
             stm.setObject(4, s2.getTotalamount());
            int y=stm.executeUpdate();
            return y>0;
    }
    public static serviceitemdetails searchserviceitems(String no) throws SQLException,ClassNotFoundException{
            String sql="select * from serviceitemdetails where batchno='"+no+"'";
            Connection con2=DBConnection.getDBConnection().getConnection();
            Statement stm=con2.createStatement();
            ResultSet rst=stm.executeQuery(sql);
            if(rst.next()){
            serviceitemdetails b1=new serviceitemdetails(rst.getString("invoiceno"),rst.getString("batchno"),rst.getDouble("qty"),rst.getDouble("totaldiscount"),rst.getDouble("totalamount"));
            return b1;
            }
            return null;
    }
    public static boolean deleteserviceitem(String no) throws SQLException,ClassNotFoundException{
            String sql="Delete from serviceitemdetails where invoiceno='"+no+"'";
            Connection con3=DBConnection.getDBConnection().getConnection();
            PreparedStatement stm=con3.prepareStatement(sql);
            int z=stm.executeUpdate();
            return z>0;
    }
    public static serviceitemdetails[] showserviceitem() throws SQLException,ClassNotFoundException{
            String sql="select * from serviceitemdetails";
            Connection con4=DBConnection.getDBConnection().getConnection();
            Statement stm=con4.createStatement();
            ResultSet rst=stm.executeQuery(sql);
            int count=0;
            while(rst.next()){
                count++;
            }
            serviceitemdetails [] list=new serviceitemdetails[count];
            rst.beforeFirst();
            for(int i=0;rst.next();i++){
            list [i]=new serviceitemdetails(rst.getString("invoiceno"),rst.getString("batchno"),rst.getDouble("qty"),rst.getDouble("totaldiscount"),rst.getDouble("totalamount"));
            
            }
            return list;
    }

    public static serviceitemdetails[] searchitemdetails(String invoiceno) throws SQLException,ClassNotFoundException {
        String sql="select * from serviceitemdetails where invoiceno='"+invoiceno+"'";
            Connection con4=DBConnection.getDBConnection().getConnection();
            Statement stm=con4.createStatement();
            ResultSet rst=stm.executeQuery(sql);
            int count=0;
            while(rst.next()){
                count++;
            }
            serviceitemdetails [] list=new serviceitemdetails[count];
            rst.beforeFirst();
            for(int i=0;rst.next();i++){
            list [i]=new serviceitemdetails(rst.getString("invoiceno"),rst.getString("batchno"),rst.getDouble("qty"),rst.getDouble("totaldiscount"),rst.getDouble("totalamount"));
            
            }
            return list;
    }
}
