package Controller;
import DBConnection.DBConnection;
import Model.Servicecategory;
import java.sql.*;
import java.util.ArrayList;

public class ServicecategoryController {
      public static boolean addServicecategory(Servicecategory servicecategory) throws SQLException,ClassNotFoundException{
            String sql="insert into servicecategory values(?,?,?,?)";
            Connection con=DBConnection.getDBConnection().getConnection();
            PreparedStatement stm=con.prepareStatement(sql);
            stm.setObject(1,servicecategory.getCategoryID());
            stm.setObject(2, servicecategory.getVehicletype());
            stm.setObject(3, servicecategory.getDescription());
            stm.setObject(4,servicecategory.getCharge());
            int x=stm.executeUpdate();
            return x>0;
   }
    public static boolean Updateservicecategory(Servicecategory servicecategory) throws SQLException,ClassNotFoundException{
            String sql="Update servicecategory set vehicletype=?,description=?,charge=? where CategoryID=?";
            Connection con1=DBConnection.getDBConnection().getConnection();
            PreparedStatement stm=con1.prepareStatement(sql);
            stm.setObject(4, servicecategory.getCategoryID());
            stm.setObject(1, servicecategory.getVehicletype());
            stm.setObject(2, servicecategory.getDescription());
            stm.setObject(3, servicecategory.getCharge());
            int y=stm.executeUpdate();
            return y>0;
    }
    public static Servicecategory searchservicecategory(String no) throws SQLException,ClassNotFoundException{
            String sql="select * from servicecategory where CategoryID='"+no+"'";
            Connection con2=DBConnection.getDBConnection().getConnection();
            Statement stm=con2.createStatement();
            ResultSet rst=stm.executeQuery(sql);
            if(rst.next()){
            Servicecategory servicecategory=new Servicecategory(rst.getString("CategoryID"),rst.getString("vehicletype"),rst.getString("description"),rst.getInt("charge"));
            return servicecategory;
            }
            return null;
    }
    public static boolean deleteservicecategory(String no) throws SQLException,ClassNotFoundException{
            String sql="Delete from servicecategory where CategoryID='"+no+"'";
            Connection con3=DBConnection.getDBConnection().getConnection();
            PreparedStatement stm=con3.prepareStatement(sql);
            int z=stm.executeUpdate();
            return z>0;
    }
    public static Servicecategory[] showservicecategory() throws SQLException,ClassNotFoundException{
            String sql="select * from servicecategory";
            Connection con4=DBConnection.getDBConnection().getConnection();
            Statement stm=con4.createStatement();
            ResultSet rst=stm.executeQuery(sql);
            int count=0;
            while(rst.next()){
                count++;
            }
            Servicecategory [] list=new Servicecategory[count];
            rst.beforeFirst();
            for(int i=0;rst.next();i++){
            list [i]=new Servicecategory(rst.getString("CategoryID"),rst.getString("vehicletype"),rst.getString("description"),rst.getInt("charge"));
            
            }
            return list;
    }
    public static ArrayList<String> getservicetypes() throws SQLException,ClassNotFoundException{
        String sql="select * from servicecategory";
        Connection con=DBConnection.getDBConnection().getConnection();
        Statement stm=con.createStatement();
        ResultSet rst=stm.executeQuery(sql);
        ArrayList<String>lst=new ArrayList<>();
        while(rst.next()){
        lst.add(rst.getString("vehicletype"));
        }
        return lst;
    } 

    public static Servicecategory[] getshow(String st) throws SQLException,ClassNotFoundException {
        String sql="select * from servicecategory where vehicletype='"+st+"'";
        Connection con=DBConnection.getDBConnection().getConnection();
        Statement stm=con.createStatement();
        ResultSet rst=stm.executeQuery(sql);
        int count=0;
        while(rst.next()){
        count++;
        }
        Servicecategory [] sct=new Servicecategory[count];
        rst.beforeFirst();
        for(int i=0;rst.next();i++){
        sct [i]=new Servicecategory(rst.getString("CategoryID"),rst.getString("vehicletype"),rst.getString("description"),rst.getInt("charge"));
        
        }
        return sct;
    }
     public static Servicecategory searchservicedetails1(String type) throws SQLException,ClassNotFoundException{
            String sql="select * from servicecategory where vehicletype='"+type+"'";
            Connection con2=DBConnection.getDBConnection().getConnection();
            Statement stm=con2.createStatement();
            ResultSet rst=stm.executeQuery(sql);
            if(rst.next()){
            Servicecategory servicedetails=new Servicecategory(rst.getString("CategoryID"),rst.getString("Vehicletype"),rst.getString("description"), (int) rst.getDouble("charge"));
            return servicedetails;
            }
            return null;
    }

    

    public static Servicecategory serchservicedetails(String servicetype) throws SQLException,ClassNotFoundException {
       String sql="select * from servicecategory where vehicletype='"+servicetype+"'";
       Connection con=DBConnection.getDBConnection().getConnection();
       Statement stm=con.createStatement();
       ResultSet rst=stm.executeQuery(sql);
       if(rst.next()){
       Servicecategory sc=new Servicecategory(rst.getString("CategoryID"),rst.getString("Vehicletype"),rst.getString("description"), (int) rst.getDouble("charge"));
       return sc;
       }
       return null;
    }

    public static ArrayList<String> getlastservicecategory()throws SQLException,ClassNotFoundException {
      String sql="SELECT CategoryID FROM servicecategory ORDER BY CategoryID DESC LIMIT 1";  
      Connection con=DBConnection.getDBConnection().getConnection();
      Statement stm=con.createStatement();
      ResultSet rst=stm.executeQuery(sql);
      ArrayList<String>cid=new ArrayList<>();
      while(rst.next()){
          cid.add(rst.getString("CategoryID"));
      }
      return cid;
    }
}
