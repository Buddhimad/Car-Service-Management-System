package Controller;
import DBConnection.DBConnection;
import Model.Supplierorder;
import Model.Supplierorderdetail;
import java.sql.*;
import java.util.ArrayList;

public class SupplierorderController {
      public static boolean addsupplierorder(Supplierorder b1) throws SQLException,ClassNotFoundException{
            String sql="insert into supplierorder values(?,?,?)";
            Connection con=DBConnection.getDBConnection().getConnection();
            PreparedStatement stm=con.prepareStatement(sql);
            stm.setObject(1, b1.getOrderID());
            stm.setObject(2, b1.getSupplierID());
            stm.setObject(3, b1.getDate());
            int x=stm.executeUpdate();
            return x>0;
   }
    public static boolean Updatesupplierorder(Supplierorder b2) throws SQLException,ClassNotFoundException{
            String sql="Update supplierorder set supplierID=?,date=? where orderID=?";
            Connection con1=DBConnection.getDBConnection().getConnection();
            PreparedStatement stm=con1.prepareStatement(sql);
            stm.setObject(3, b2.getOrderID());
            stm.setObject(1, b2.getSupplierID());
           stm.setObject(2, b2.getDate());
            int y=stm.executeUpdate();
            return y>0;
    }
    public static Supplierorder searchsupplierorder(String no) throws SQLException,ClassNotFoundException{
            String sql="select * from supplierorder where batchno='"+no+"'";
            Connection con2=DBConnection.getDBConnection().getConnection();
            Statement stm=con2.createStatement();
            ResultSet rst=stm.executeQuery(sql);
            if(rst.next()){
            Supplierorder b1=new Supplierorder(no,rst.getString("supplierID"),rst.getString("date"));
            return b1;
            }
            return null;
    }
    public static boolean deletesupplierorder(String no) throws SQLException,ClassNotFoundException{
            String sql="Delete from supplierorder where orderID='"+no+"'";
            Connection con3=DBConnection.getDBConnection().getConnection();
            PreparedStatement stm=con3.prepareStatement(sql);
            int z=stm.executeUpdate();
            return z>0;
    }
    public static Supplierorder[] showsupplierorder() throws SQLException,ClassNotFoundException{
            String sql="select * from supplierorder";
            Connection con4=DBConnection.getDBConnection().getConnection();
            Statement stm=con4.createStatement();
            ResultSet rst=stm.executeQuery(sql);
            int count=0;
            while(rst.next()){
                count++;
            }
            Supplierorder [] list=new Supplierorder[count];
            rst.beforeFirst();
            for(int i=0;rst.next();i++){
            list [i]=new Supplierorder(rst.getString("orderID"),rst.getString("supplierID"),rst.getString("date"));
            
            }
            return list;
    }

    public static ArrayList<String> getallorderid() throws SQLException,ClassNotFoundException {
        String sql="SELECT orderID FROM supplierorder ORDER BY orderID DESC LIMIT 1";
        Connection con=DBConnection.getDBConnection().getConnection();
        Statement stm=con.createStatement();
        ResultSet rst=stm.executeQuery(sql);
        ArrayList<String>list=new ArrayList<>();
        while(rst.next()){
            list.add(rst.getString("orderID"));
        }
        return list;
    }

    

    public static Supplierorder[] searchbyname(String sid) throws SQLException,ClassNotFoundException {
        String sql="select * from supplierorder where supplierId='"+sid+"'";
            Connection con4=DBConnection.getDBConnection().getConnection();
            Statement stm=con4.createStatement();
            ResultSet rst=stm.executeQuery(sql);
            int count=0;
            while(rst.next()){
                count++;
            }
            Supplierorder [] list=new Supplierorder[count];
            rst.beforeFirst();
            for(int i=0;rst.next();i++){
            list [i]=new Supplierorder(rst.getString("orderID"),rst.getString("supplierID"),rst.getString("date"));
            
            }
            return list;
    }

    public static boolean deleteholeorder(String orderid)throws SQLException,ClassNotFoundException {
        Connection con=DBConnection.getDBConnection().getConnection();
        try{
        con.setAutoCommit(false);
        String sql="Delete from supplierorder where orderID='"+orderid+"'";
        PreparedStatement stm=con.prepareStatement(sql);
        boolean Isorderdeleted=stm.executeUpdate()>0;
        if(Isorderdeleted){
            String sql2="Delete from supplierorderdetails where orderID='"+orderid+"'";
            PreparedStatement stm2=con.prepareStatement(sql2);
            boolean IsorderdetailsDeleted=stm2.executeUpdate()>0;
            if(IsorderdetailsDeleted){
            String sql3="Delete from goodreceivenote where orderID='"+orderid+"'";
            PreparedStatement stm3=con.prepareStatement(sql3);
            boolean Isgoodreceivenotedeleted=stm3.executeUpdate()>0;
            if(Isgoodreceivenotedeleted){
                con.commit();
                return true;
            }else{
                con.rollback();
                return false;
                
            }
            }else{
            con.rollback();
            return false;
            }//2
        }else{
        con.rollback();
        return false;
        }//1
        }finally{
        con.setAutoCommit(true);
        }
    }

    public static boolean updateorder(Supplierorder supplierorder, Supplierorderdetail supplierorderdetails)throws SQLException,ClassNotFoundException {
        Connection connection=DBConnection.getDBConnection().getConnection();
        try{
            connection.setAutoCommit(false);
            String sql="Update supplierorder set supplierID=?,date=? where orderID=?";
            PreparedStatement stm=connection.prepareStatement(sql);
            stm.setObject(3,supplierorder.getOrderID());
            stm.setObject(1,supplierorder.getSupplierID());
            stm.setObject(2,supplierorder.getDate());
            boolean IsorderUpdated=stm.executeUpdate()>0;
            if(IsorderUpdated){
            String sql2="Update supplierorderdetails set itemcode=?,qty=? where orderID=?";
            PreparedStatement stm2=connection.prepareStatement(sql2);
            stm2.setObject(3,supplierorderdetails.getOrderid());
            stm2.setObject(1,supplierorderdetails.getItemcode());
            stm2.setObject(2,supplierorderdetails.getQty());
            boolean IsorderdetailUpdate=stm2.executeUpdate()>0;
            if(IsorderdetailUpdate){
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

    public static ArrayList<String> getmonthorderid(String supplierid) throws SQLException,ClassNotFoundException {
        String sql="select distinct orderID from supplierorder where month(date)=month(curdate())";
        Connection connection=DBConnection.getDBConnection().getConnection();
        Statement stm=connection.createStatement();
        ResultSet rst=stm.executeQuery(sql);
        ArrayList<String>orderid=new ArrayList<>();
        while(rst.next()){
            orderid.add(rst.getString("orderID"));
        }
        return orderid;
    }
public static ArrayList<String> getorderid() throws SQLException,ClassNotFoundException {
        String sql="SELECT orderID FROM supplierorder";
        Connection con=DBConnection.getDBConnection().getConnection();
        Statement stm=con.createStatement();
        ResultSet rst=stm.executeQuery(sql);
        ArrayList<String>list=new ArrayList<>();
        while(rst.next()){
            list.add(rst.getString("orderID"));
        }
        return list;
    }
    
}
