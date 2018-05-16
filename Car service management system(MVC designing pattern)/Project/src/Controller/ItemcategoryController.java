package Controller;
import DBConnection.DBConnection;
import Model.Itemcategory;
import java.sql.*;
import java.util.ArrayList;

public class ItemcategoryController {
      public static boolean addItemcategory(Itemcategory itemcategory) throws SQLException,ClassNotFoundException{
            String sql="insert into itemcategory values(?,?,?)";
            Connection con=DBConnection.getDBConnection().getConnection();
            PreparedStatement stm=con.prepareStatement(sql);
            stm.setObject(1, itemcategory.getCategoryID());
            stm.setObject(2, itemcategory.getCategory());
            stm.setObject(3,itemcategory.getCountry() );
            
            int x=stm.executeUpdate();
            return x>0;
   }
    public static boolean UpdateItemcategory(Itemcategory itemcategory) throws SQLException,ClassNotFoundException{
            String sql="Update itemcategory set category=?,country=? where CategoryID=?";
            Connection con1=DBConnection.getDBConnection().getConnection();
            PreparedStatement stm=con1.prepareStatement(sql);
            stm.setObject(3,itemcategory.getCategoryID());
            stm.setObject(1, itemcategory.getCategory());
            stm.setObject(2,itemcategory.getCountry());
            int y=stm.executeUpdate();
            return y>0;
    }
    public static Itemcategory searchItemcategory(String id) throws SQLException,ClassNotFoundException{
            String sql="select * from itemcategory where categoryID='"+id+"'";
            Connection con2=DBConnection.getDBConnection().getConnection();
            Statement stm=con2.createStatement();
            ResultSet rst=stm.executeQuery(sql);
            if(rst.next()){
            Itemcategory item=new Itemcategory(rst.getString("categoryID"),rst.getString("category"),rst.getString("country"));
            return item;
            }
            return null;
    }
    public static boolean deleteItemcategory(String id) throws SQLException,ClassNotFoundException{
            String sql="Delete from itemcategory where categoryID='"+id+"'";
            Connection con3=DBConnection.getDBConnection().getConnection();
            PreparedStatement stm=con3.prepareStatement(sql);
            int z=stm.executeUpdate();
            return z>0;
    }
    public static Itemcategory[] showitemcategory() throws SQLException,ClassNotFoundException{
            String sql="select * from itemcategory";
            Connection con4=DBConnection.getDBConnection().getConnection();
            Statement stm=con4.createStatement();
            ResultSet rst=stm.executeQuery(sql);
            int count=0;
            while(rst.next()){
                count++;
            }
            Itemcategory [] list=new Itemcategory[count];
            rst.beforeFirst();
            for(int i=0;rst.next();i++){
            list [i]=new Itemcategory(rst.getString("categoryID"),rst.getString("category"),rst.getString("country"));
            
            }
            return list;
    }

    public static ArrayList<String> getItemcid() throws SQLException,ClassNotFoundException {
       String sql="select * from itemcategory"; 
       Connection con=DBConnection.getDBConnection().getConnection();
       Statement stm=con.createStatement();
       ResultSet rst=stm.executeQuery(sql);
       ArrayList<String>list=new ArrayList<>();
       while(rst.next()){
           list.add(rst.getString("categoryID"));
       }
       return list;
    }
}
