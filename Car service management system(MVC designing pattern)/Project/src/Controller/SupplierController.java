package Controller;
import DBConnection.DBConnection;
import Model.Supplier;
import java.sql.*;
import java.util.ArrayList;

public class SupplierController {
      public static boolean addsupplier(Supplier b1) throws SQLException,ClassNotFoundException{
            String sql="insert into supplier values(?,?,?,?,?,?)";
            Connection con=DBConnection.getDBConnection().getConnection();
            PreparedStatement stm=con.prepareStatement(sql);
            stm.setObject(1, b1.getSupplierID());
            stm.setObject(2, b1.getName());
            stm.setObject(3, b1.getAddress());
            stm.setObject(4, b1.getCompany());
              stm.setObject(5, b1.getContactno());
               stm.setObject(6, b1.getDate());
            int x=stm.executeUpdate();
            return x>0;
   }
    public static boolean Updatesupplier(Supplier b2) throws SQLException,ClassNotFoundException{
            String sql="Update supplier set invoicenp=?,amount=?,date=? where batchno=?";
            Connection con1=DBConnection.getDBConnection().getConnection();
            PreparedStatement stm=con1.prepareStatement(sql);
            stm.setObject(6, b2.getSupplierID());
            stm.setObject(1, b2.getName());
            stm.setObject(2, b2.getAddress());
            stm.setObject(3, b2.getCompany());
              stm.setObject(4, b2.getContactno());
                stm.setObject(5, b2.getDate());
            int y=stm.executeUpdate();
            return y>0;
    }
    public static Supplier searchsupplier(String batchno) throws SQLException,ClassNotFoundException{
            String sql="select * from supplier where supplierID='"+batchno+"'";
            Connection con2=DBConnection.getDBConnection().getConnection();
            Statement stm=con2.createStatement();
            ResultSet rst=stm.executeQuery(sql);
            if(rst.next()){
            Supplier b1=new Supplier(rst.getString("supplierID"),rst.getString("name"),rst.getString("address"),rst.getString("company"),rst.getInt("contactno"),rst.getString("date"));
            return b1;
            }
            return null;
    }
    public static boolean deletesupplier(String no) throws SQLException,ClassNotFoundException{
            String sql="Delete from supplier where batchno='"+no+"'";
            Connection con3=DBConnection.getDBConnection().getConnection();
            PreparedStatement stm=con3.prepareStatement(sql);
            int z=stm.executeUpdate();
            return z>0;
    }
    public static Supplier[] showbatch() throws SQLException,ClassNotFoundException{
            String sql="select * from supplier";
            Connection con4=DBConnection.getDBConnection().getConnection();
            Statement stm=con4.createStatement();
            ResultSet rst=stm.executeQuery(sql);
            int count=0;
            while(rst.next()){
                count++;
            }
            Supplier [] list=new Supplier[count];
            rst.beforeFirst();
            for(int i=0;rst.next();i++){
            list [i]=new Supplier(rst.getString("supplierID"),rst.getString("name"),rst.getString("address"),rst.getString("company"),rst.getInt("contactno"),rst.getString("date"));
            
            }
            return list;
    }

    public static ArrayList<String> getSupplierid() throws SQLException,ClassNotFoundException {
            String sql="SELECT supplierID FROM supplier ORDER BY supplierID DESC LIMIT 1";
            Connection con4=DBConnection.getDBConnection().getConnection();
            Statement stm=con4.createStatement();
            ResultSet rst=stm.executeQuery(sql);
            ArrayList<String>lst=new ArrayList<>();
            while(rst.next()){
            lst.add(rst.getString("supplierID"));
            }
            return lst;
    }

    public static ArrayList<String> getSuppliername() throws SQLException,ClassNotFoundException {
       String sql="select distinct name from supplier";
       Connection con=DBConnection.getDBConnection().getConnection();
       Statement stm=con.createStatement();
       ResultSet rst=stm.executeQuery(sql);
       ArrayList<String>suppliername=new ArrayList<>();
       while(rst.next()){
           suppliername.add(rst.getString("name"));
       }
       return suppliername;
    }

    public static Supplier getsupplieridbyname(String Suppliername) throws SQLException,ClassNotFoundException {
       String sql="select * from supplier where name='"+Suppliername+"' ";
       Connection con=DBConnection.getDBConnection().getConnection();
       Statement stm=con.createStatement();
       ResultSet rst=stm.executeQuery(sql);
       if(rst.next()){
            Supplier b1=new Supplier(rst.getString("supplierID"),rst.getString("name"),rst.getString("address"),rst.getString("company"),rst.getInt("contactno"),rst.getString("date"));
            return b1;
            }
            return null;
    }
}
