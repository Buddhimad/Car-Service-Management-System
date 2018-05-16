package Controller;
import DBConnection.DBConnection;
import Model.Vehicle;
import java.sql.*;
import java.util.ArrayList;

public class VehicleController {
    public static boolean addvehicle(Vehicle vehicle) throws SQLException,ClassNotFoundException{
        String sql="Insert into vehicle values(?,?,?,?,?,?)";
        Connection con=DBConnection.getDBConnection().getConnection();
        PreparedStatement stm=con.prepareStatement(sql);
        stm.setObject(1,vehicle.getVehicleno());
        stm.setObject(2, vehicle.getCustomerID());
        stm.setObject(3, vehicle.getBrand());
        stm.setObject(4, vehicle.getModel());
        stm.setObject(5, vehicle.getEnginetype());
        stm.setObject(6, vehicle.getVehicletype());
        return stm.executeUpdate()>0;
    }
    public static Vehicle getVehicleno(String id) throws SQLException,ClassNotFoundException{
            String sql="select * from vehicle where CustomerID='"+id+"'";
            Connection con=DBConnection.getDBConnection().getConnection();
            Statement stm=con.createStatement();
            ResultSet rst=stm.executeQuery(sql);
           if(rst.next()){
               Vehicle vehicle=new Vehicle(rst.getString("vehicleno"),rst.getString("CustomerID"),rst.getString("brand"),rst.getString("model"),rst.getString("enginetype"),rst.getString("vehicletype"));
               return vehicle;
           }
           return null;
    }
    public static boolean updatevehicle(Vehicle vehicle) throws SQLException,ClassNotFoundException{
        String sql="update vehicle set vehicleno=?,brand=?,model=?,enginetype=?,vehicletype=? where CustomerID=?";
        Connection con=DBConnection.getDBConnection().getConnection();
        PreparedStatement stm=con.prepareStatement(sql);
        stm.setObject(6, vehicle.getCustomerID());
        stm.setObject(1, vehicle.getVehicleno());
        stm.setObject(2, vehicle.getBrand());
        stm.setObject(3,vehicle.getModel());
        stm.setObject(4,vehicle.getEnginetype());
        stm.setObject(5,vehicle.getVehicletype());
        return stm.executeUpdate()>0;
    }
    public static Vehicle [] viewVehicle() throws SQLException,ClassNotFoundException{
        String sql="select * from vehicle";
        Connection con=DBConnection.getDBConnection().getConnection();
        Statement stm=con.createStatement();
        ResultSet rst=stm.executeQuery(sql);
        int count=0;
        while(rst.next()){
        count++;
        }
        Vehicle [] vehicle=new Vehicle[count];
        rst.beforeFirst();
        for(int i=0;rst.next();i++){
        vehicle [i]=new Vehicle(rst.getString("vehicleno"),rst.getString("CustomerID"),rst.getString("brand"),rst.getString("model"),rst.getString("enginetype"),rst.getString("vehicletype"));
        }
        return vehicle;
    }
    public static Vehicle[] searchVehicle(String vehicleno) throws SQLException,ClassNotFoundException{
        String sql="select * from vehicle where vehicleno='"+vehicleno+"'";
        Connection con=DBConnection.getDBConnection().getConnection();
        Statement stm=con.createStatement();
        ResultSet rst=stm.executeQuery(sql);
        int count=0;
        while(rst.next()){
        count++;
        }
        Vehicle [] vehicle=new Vehicle[count];
        rst.beforeFirst();
        for(int i=0;rst.next();i++){
        vehicle [i]=new Vehicle(rst.getString("vehicleno"),rst.getString("CustomerID"),rst.getString("brand"),rst.getString("model"),rst.getString("enginetype"),rst.getString("vehicletype"));
        }
        return vehicle;
    }
    public static boolean deletevehicle(String customerid) throws SQLException,ClassNotFoundException{
        String sql="Delete from vehicle where CustomerID='"+customerid+"'";
        Connection con=DBConnection.getDBConnection().getConnection();
        PreparedStatement stm=con.prepareStatement(sql);
        return stm.executeUpdate()>0;
    }

    public static ArrayList<String> getVehiclenum2() throws SQLException,ClassNotFoundException {
       String sql="select vehicleno from vehicle v,customer c where v.CustomerID=c.CustomerID AND DATE(date)=DATE(curdate())";
       Connection con=DBConnection.getDBConnection().getConnection();
       Statement stm=con.createStatement();
       ResultSet rst=stm.executeQuery(sql);
       ArrayList<String>vehicleno=new ArrayList<>();
       while(rst.next()){
           vehicleno.add(rst.getString("vehicleno"));
       }
       return vehicleno;
    }

    public static Vehicle getCustomerid(String vehicleno) throws SQLException,ClassNotFoundException{
        String sql="select * from vehicle where vehicleno='"+vehicleno+"'";
        Connection con=DBConnection.getDBConnection().getConnection();
        Statement stm=con.createStatement();
        ResultSet rst=stm.executeQuery(sql);
        if(rst.next()){
            Vehicle vehicle=new Vehicle(rst.getString("vehicleno"),rst.getString("CustomerID"),rst.getString("brand"),rst.getString("model"),rst.getString("enginetype"),rst.getString("vehicletype"));
            return vehicle;
        }
        return null;
    }
}
