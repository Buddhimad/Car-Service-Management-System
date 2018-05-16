package Controller;
import DBConnection.DBConnection;
import Model.Itembrand;
import java.sql.*;
import java.util.ArrayList;
public class ItembrandController {
      public static boolean addItemBrand(Itembrand itembrand) throws SQLException,ClassNotFoundException{
            String sql="insert into itembrand values(?,?)";
            Connection con=DBConnection.getDBConnection().getConnection();
            PreparedStatement stm=con.prepareStatement(sql);
            stm.setObject(1, itembrand.getBrandID());
            stm.setObject(2, itembrand.getBrand());
            int x=stm.executeUpdate();
            return x>0;
   }
    public static boolean UpdateitemBrand(Itembrand itembrand) throws SQLException,ClassNotFoundException{
            String sql="Update batch set brand=? where brandID=?";
            Connection con1=DBConnection.getDBConnection().getConnection();
            PreparedStatement stm=con1.prepareStatement(sql);
            stm.setObject(2, itembrand.getBrandID());
            stm.setObject(1, itembrand.getBrand());
           
            int y=stm.executeUpdate();
            return y>0;
    }
    public static Itembrand searchitemBrand(String brandno) throws SQLException,ClassNotFoundException{
            String sql="select * from itembrand where brandID='"+brandno+"'";
            Connection con2=DBConnection.getDBConnection().getConnection();
            Statement stm=con2.createStatement();
            ResultSet rst=stm.executeQuery(sql);
            if(rst.next()){
            Itembrand itembrand=new Itembrand(rst.getString("brandID"),rst.getString("brand"));
            return itembrand;
            }
            return null;
    }
    public static boolean deleteitemBrand(String brandno) throws SQLException,ClassNotFoundException{
            String sql="Delete from itembrand where brandID='"+brandno+"'";
            Connection con3=DBConnection.getDBConnection().getConnection();
            PreparedStatement stm=con3.prepareStatement(sql);
            int z=stm.executeUpdate();
            return z>0;
    }
    public static Itembrand[] showbatch() throws SQLException,ClassNotFoundException{
            String sql="select * from itembrand";
            Connection con4=DBConnection.getDBConnection().getConnection();
            Statement stm=con4.createStatement();
            ResultSet rst=stm.executeQuery(sql);
            int count=0;
            while(rst.next()){
                count++;
            }
            Itembrand [] list=new Itembrand[count];
            rst.beforeFirst();
            for(int i=0;rst.next();i++){
            list [i]=new Itembrand(rst.getString("brandID"),rst.getString("brand"));
            
            }
            return list;
    }

    public static ArrayList<String> getItembrandid() throws SQLException,ClassNotFoundException {
       String sql="select * from itembrand";
       Connection con=DBConnection.getDBConnection().getConnection();
       Statement stm=con.createStatement();
       ResultSet rst=stm.executeQuery(sql);
       ArrayList<String>list=new ArrayList<>();
       while(rst.next()){
       list.add(rst.getString("brandID"));
       }
       return list;
    }
}
