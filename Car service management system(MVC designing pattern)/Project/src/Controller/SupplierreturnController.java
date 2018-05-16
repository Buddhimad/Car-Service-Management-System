package Controller;
import DBConnection.DBConnection;
import Model.Supplierreturn;
import java.sql.*;
import java.util.ArrayList;

public class SupplierreturnController {
      public static boolean addsupplierreturn(Supplierreturn b1) throws SQLException,ClassNotFoundException{
            String sql="insert into supplierreturn values(?,?,?,?,?,?)";
            Connection con=DBConnection.getDBConnection().getConnection();
            PreparedStatement stm=con.prepareStatement(sql);
            stm.setObject(1, b1.getSrID());
            stm.setObject(2, b1.getSupplierID());
            stm.setObject(3, b1.getBatchno());
            stm.setObject(4, b1.getReson());
            stm.setObject(5, b1.getQty());
            stm.setObject(6, b1.getDate());
            int x=stm.executeUpdate();
            return x>0;
   }
    public static boolean Updatesupplierreturn(Supplierreturn b2) throws SQLException,ClassNotFoundException{
            String sql="Update supplierreturn set supplierID=?,batchno=?,reason=?,qty=?,date=? where srID=?";
            Connection con1=DBConnection.getDBConnection().getConnection();
            PreparedStatement stm=con1.prepareStatement(sql);
            stm.setObject(6, b2.getSrID());
            stm.setObject(1, b2.getSupplierID());
            stm.setObject(2, b2.getBatchno());
            stm.setObject(3, b2.getReson());
            stm.setObject(4, b2.getQty());
            stm.setObject(5, b2.getDate());
            int y=stm.executeUpdate();
            return y>0;
    }
    public static Supplierreturn searchsupplierreturn(String no) throws SQLException,ClassNotFoundException{
            String sql="select * from supplierreturn where batchno='"+no+"'";
            Connection con2=DBConnection.getDBConnection().getConnection();
            Statement stm=con2.createStatement();
            ResultSet rst=stm.executeQuery(sql);
            if(rst.next()){
            Supplierreturn b1=new Supplierreturn(no,rst.getString("supplierID"),rst.getString("batchno"),rst.getString("reason"),rst.getDouble("qty"),rst.getString("date"));
            return b1;
            }
            return null;
    }
    public static boolean deletesupplierreturn(String batchno) throws SQLException,ClassNotFoundException{
            String sql="Delete from supplierreturn where supplierID='"+batchno+"'";
            Connection con3=DBConnection.getDBConnection().getConnection();
            PreparedStatement stm=con3.prepareStatement(sql);
            int z=stm.executeUpdate();
            return z>0;
    }
    public static Supplierreturn[] showsupplierreturn() throws SQLException,ClassNotFoundException{
            String sql="select * from supplierreturn";
            Connection con4=DBConnection.getDBConnection().getConnection();
            Statement stm=con4.createStatement();
            ResultSet rst=stm.executeQuery(sql);
            int count=0;
            while(rst.next()){
                count++;
            }
            Supplierreturn [] list=new Supplierreturn[count];
            rst.beforeFirst();
            for(int i=0;rst.next();i++){
            list [i]=new Supplierreturn(rst.getString("srID"),rst.getString("supplierID"),rst.getString("batchno"),rst.getString("reason"),rst.getDouble("qty"),rst.getString("date"));
            
            }
            return list;
    }

    public static ArrayList<String> showreturnid() throws SQLException,ClassNotFoundException {
       String sql="SELECT * FROM supplierreturn ORDER BY srID DESC LIMIT 1";
       Connection connection=DBConnection.getDBConnection().getConnection();
       Statement stm=connection.createStatement();
       ResultSet rst=stm.executeQuery(sql);
       ArrayList<String>srid=new ArrayList<>();
       while(rst.next()){
       srid.add(rst.getString("srID"));
       }
       return srid;
    }
}
