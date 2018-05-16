package Controller;
import DBConnection.DBConnection;
import Model.Item;
import java.sql.*;
import java.util.ArrayList;
public class ItemController {
      public static boolean addItem(Item item) throws SQLException,ClassNotFoundException{
            String sql="insert into item values(?,?,?,?)";
            Connection con=DBConnection.getDBConnection().getConnection();
            PreparedStatement stm=con.prepareStatement(sql);
            stm.setObject(1,item.getItemcode() );
            stm.setObject(2,item.getBatchno() );
            stm.setObject(3, item.getBrandID());
            stm.setObject(4,item.getCategoryID() );
            int x=stm.executeUpdate();
            return x>0;
   }
    public static boolean Updateitem(Item item) throws SQLException,ClassNotFoundException{
            String sql="Update item set batchno=?,brandID=?,categoryID=?,name=?,qty=?,discount=?,price=? where itemcode=?";
            Connection con1=DBConnection.getDBConnection().getConnection();
            PreparedStatement stm=con1.prepareStatement(sql);
            stm.setObject(8, item.getItemcode());
            stm.setObject(1, item.getBatchno());
            stm.setObject(2, item.getBrandID());
            stm.setObject(3, item.getCategoryID());
            stm.setObject(4,item.getName());
            stm.setObject(5,item.getQty());
            stm.setObject(6,item.getDiscount());
            stm.setObject(7,item.getPrice());
            int y=stm.executeUpdate();
            return y>0;
    }
    public static Item searchitem(String itemno) throws SQLException,ClassNotFoundException{
            String sql="select * from item where itemcode='"+itemno+"'";
            Connection con2=DBConnection.getDBConnection().getConnection();
            Statement stm=con2.createStatement();
            ResultSet rst=stm.executeQuery(sql);
            if(rst.next()){
            Item item=new Item(rst.getString("itemcode"),rst.getString("batchno"),rst.getString("brandID"),rst.getString("categoryID"),rst.getString("name"),rst.getDouble("QTY"),rst.getDouble("discount"),rst.getDouble("price"));
            return item;
            }
            return null;
    }
    public static boolean deleteitem(String itemcode) throws SQLException,ClassNotFoundException{
            String sql="Delete from item where itemcode='"+itemcode+"'";
            Connection con3=DBConnection.getDBConnection().getConnection();
            PreparedStatement stm=con3.prepareStatement(sql);
            int z=stm.executeUpdate();
            return z>0;
    }
    public static Item[] showItem() throws SQLException,ClassNotFoundException{
            String sql="select * from item";
            Connection con4=DBConnection.getDBConnection().getConnection();
            Statement stm=con4.createStatement();
            ResultSet rst=stm.executeQuery(sql);
            int count=0;
            while(rst.next()){
                count++;
            }
            Item [] list=new Item[count];
            rst.beforeFirst();
            for(int i=0;rst.next();i++){
            list [i]=new Item(rst.getString("itemcode"),rst.getString("batchno"),rst.getString("brandID"),rst.getString("categoryID"),rst.getString("name"),rst.getDouble("QTY"),rst.getDouble("discount"),rst.getDouble("price"));
            
            }
            return list;
    }

    public static ArrayList<String> getItemcode(String name) throws SQLException,ClassNotFoundException {
        String sql="select * from item where name='"+name+"'";
        Connection con=DBConnection.getDBConnection().getConnection();
        Statement stm=con.createStatement();
        ResultSet rst=stm.executeQuery(sql);
        ArrayList<String>list=new ArrayList<>();
        while(rst.next()){
        list.add(rst.getString("itemcode"));
        }
        return list;
    }

    public static ArrayList<String> getAllitemcodes() throws SQLException,ClassNotFoundException {
        String sql="select * from item";
        Connection con=DBConnection.getDBConnection().getConnection();
        Statement stm=con.createStatement();
        ResultSet rst=stm.executeQuery(sql);
        ArrayList<String>lst=new ArrayList<>();
        while(rst.next()){
            lst.add(rst.getString("itemcode"));
        }
        return lst;
    }

    public static ArrayList<String> getItem(String batchno) throws SQLException,ClassNotFoundException {
        String sql="select * from item where batchno='"+batchno+"'";
        Connection con=DBConnection.getDBConnection().getConnection();
        Statement stm=con.createStatement();
        ResultSet rst=stm.executeQuery(sql);
        ArrayList<String>brandid=new ArrayList<>();
        while(rst.next()){
            brandid.add(rst.getString("brandid"));
        }
        return brandid;
    }

    public static ArrayList<String> getAllNames(ArrayList<String> brand) throws SQLException,ClassNotFoundException {
      String sql="select * from itembrand where brandID='"+brand+"' AND ";
      Connection con=DBConnection.getDBConnection().getConnection();
      Statement stm=con.createStatement();
      ResultSet rst=stm.executeQuery(sql);
      ArrayList<String>name=new ArrayList<>();
      while(rst.next()){
          name.add(rst.getString("brand"));
      }
      return name;
    }

    public static ArrayList<String> getCategory(String batchno, String brandid) throws SQLException,ClassNotFoundException {
      String sql="select * from item where batchno='"+batchno+"' AND brandID='"+brandid+"'";
      Connection con=DBConnection.getDBConnection().getConnection();
      Statement stm=con.createStatement();
      ResultSet rst=stm.executeQuery(sql);
      ArrayList<String>lst=new ArrayList<>();
      while(rst.next()){
          lst.add(rst.getString("categoryID"));
          return lst;
      }
      return lst;
    }

    public static ArrayList<String> getCountry( String categoryid) throws SQLException,ClassNotFoundException {
       String sql="select * from itemcategory where categoryID='"+categoryid+"'";
       Connection con=DBConnection.getDBConnection().getConnection();
       Statement stm=con.createStatement();
       ResultSet rst=stm.executeQuery(sql);
       ArrayList<String> list=new ArrayList<>();
       while(rst.next()){
           list.add(rst.getString("country"));
       }
       return list;
    }

    public static ArrayList<String> getName(String batchno, String brandid, String categoryid) throws SQLException,ClassNotFoundException {
        String sql="select * from item where batchno='"+batchno+"' AND brandID='"+brandid+"' AND categoryID='"+categoryid+"'";
        Connection con=DBConnection.getDBConnection().getConnection();
        Statement stm=con.createStatement();
        ResultSet rst=stm.executeQuery(sql);
        ArrayList<String>country=new ArrayList<>();
        while(rst.next()){
            country.add(rst.getString("Name"));
        }
        return country;
    }

    public static Item getItems(String batchno, String brandid, String categoryid)throws SQLException,ClassNotFoundException {
         String sql="select * from item where batchno='"+batchno+"' AND brandID='"+brandid+"' AND categoryID='"+categoryid+"'";
            Connection con2=DBConnection.getDBConnection().getConnection();
            Statement stm=con2.createStatement();
            ResultSet rst=stm.executeQuery(sql);
            if(rst.next()){
            Item item=new Item(rst.getString("itemcode"),rst.getString("batchno"),rst.getString("brandID"),rst.getString("categoryID"),rst.getString("name"),rst.getDouble("QTY"),rst.getDouble("discount"),rst.getDouble("price"));
            return item;
            }
            return null;
    }

 
    public static boolean  removeandadd(String item, double qty) throws SQLException,ClassNotFoundException{
        String sql="Update item set qty=qty+'"+qty+"' where itemcode='"+item+"'";
        Connection con=DBConnection.getDBConnection().getConnection();
        PreparedStatement stm=con.prepareStatement(sql);
        int x=stm.executeUpdate();
        
        return x>0;
    }

    public static boolean decrease(String itemcode, double qty) throws SQLException,ClassNotFoundException {
        String sql="Update item set qty=qty-'"+qty+"' where itemcode='"+itemcode+"'";
        Connection con=DBConnection.getDBConnection().getConnection();
        PreparedStatement stm=con.prepareStatement(sql);
        int y=stm.executeUpdate();
        return y>0;
    }

    public static Item[] showitemusingbatchno(String batchno) throws SQLException,ClassNotFoundException {
            String sql="select * from item where batchno='"+batchno+"'";
            Connection con4=DBConnection.getDBConnection().getConnection();
            Statement stm=con4.createStatement();
            ResultSet rst=stm.executeQuery(sql);
            int count=0;
            while(rst.next()){
                count++;
            }
            Item [] list=new Item[count];
            rst.beforeFirst();
            for(int i=0;rst.next();i++){
            list [i]=new Item(rst.getString("itemcode"),rst.getString("batchno"),rst.getString("brandID"),rst.getString("categoryID"),rst.getString("name"),rst.getDouble("QTY"),rst.getDouble("discount"),rst.getDouble("price"));
            
            }
            return list;
    }

    public static boolean addItems(String itemcode, double qty) throws SQLException,ClassNotFoundException {
        String sql="Update item set qty=qty+'"+qty+"' where itemcode='"+itemcode+"'";
        Connection con=DBConnection.getDBConnection().getConnection();
        PreparedStatement stm=con.prepareStatement(sql);
        return stm.executeUpdate()>0;
    }

    public static boolean removeitemqty(String itemcode, double qty1) throws SQLException,ClassNotFoundException {
        String sql="Update item set qty=qty-'"+qty1+"' where itemcode='"+itemcode+"'";
        Connection con=DBConnection.getDBConnection().getConnection();
        PreparedStatement stm=con.prepareStatement(sql);
        return stm.executeUpdate()>0;
    }

    public static Item searchbyitemcode(String itemcode)throws SQLException,ClassNotFoundException {
        String sql="select * from item where itemcode='"+itemcode+"'";
         Connection con2=DBConnection.getDBConnection().getConnection();
            Statement stm=con2.createStatement();
            ResultSet rst=stm.executeQuery(sql);
            if(rst.next()){
            Item item=new Item(rst.getString("itemcode"),rst.getString("batchno"),rst.getString("brandID"),rst.getString("categoryID"),rst.getString("name"),rst.getDouble("QTY"),rst.getDouble("discount"),rst.getDouble("price"));
            return item;
            }
            return null;
    }
    
}
