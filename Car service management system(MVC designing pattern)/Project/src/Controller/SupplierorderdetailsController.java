package Controller;
import DBConnection.DBConnection;
import Model.Supplierorderdetail;
import Model.Supplierorderdetails;
import java.sql.*;
public class SupplierorderdetailsController {
      public static boolean addSupplierorderdetails(Supplierorderdetails b1) throws SQLException,ClassNotFoundException{
            String sql="insert into supplierorderdetails values(?,?,?)";
            Connection con=DBConnection.getDBConnection().getConnection();
            PreparedStatement stm=con.prepareStatement(sql);
            stm.setObject(1, b1.getOrderID());
            stm.setObject(2, b1.getItemcode());
            stm.setObject(3, b1.getQty());
          
            int x=stm.executeUpdate();
            return x>0;
   }
    public static boolean Updatesupplierorderdetails(Supplierorderdetails b2) throws SQLException,ClassNotFoundException{
            String sql="Update supplierorderdetails set itemcode=?,qty=? where orderID=?";
            Connection con1=DBConnection.getDBConnection().getConnection();
            PreparedStatement stm=con1.prepareStatement(sql);
            stm.setObject(3, b2.getOrderID());
            stm.setObject(1, b2.getItemcode());
            stm.setObject(2, b2.getQty());
            
            int y=stm.executeUpdate();
            return y>0;
    }
    public static Supplierorderdetails searchsupplierorderdetails(String no) throws SQLException,ClassNotFoundException{
            String sql="select * from supplierorderdetails where batchno='"+no+"'";
            Connection con2=DBConnection.getDBConnection().getConnection();
            Statement stm=con2.createStatement();
            ResultSet rst=stm.executeQuery(sql);
            if(rst.next()){
          Supplierorderdetails b1=new Supplierorderdetails(no,rst.getString("itemcode"),rst.getDouble("qty"));
            return b1;
            }
            return null;
    }
    public static boolean deletesupplierorderdetail(String batchno) throws SQLException,ClassNotFoundException{
            String sql="Delete from supplierorderdetails where orderID='"+batchno+"'";
            Connection con3=DBConnection.getDBConnection().getConnection();
            PreparedStatement stm=con3.prepareStatement(sql);
            int z=stm.executeUpdate();
            return z>0;
    }
    public static Supplierorderdetails[] showsupplierorderdetails() throws SQLException,ClassNotFoundException{
            String sql="select * from supplierorderdetails";
            Connection con4=DBConnection.getDBConnection().getConnection();
            Statement stm=con4.createStatement();
            ResultSet rst=stm.executeQuery(sql);
            int count=0;
            while(rst.next()){
                count++;
            }
            Supplierorderdetails [] list=new Supplierorderdetails[count];
            rst.beforeFirst();
            for(int i=0;rst.next();i++){
            list [i]=new Supplierorderdetails(rst.getString("orderID"),rst.getString("itemcode"),rst.getDouble("qty"));
            
            }
            return list;
    }

    public static boolean addlist(Supplierorderdetail srd) throws SQLException,ClassNotFoundException {
       String sql="Insert into supplierorderdetails values(?,?,?)";
       Connection con=DBConnection.getDBConnection().getConnection();
       PreparedStatement stm=con.prepareStatement(sql);
       stm.setObject(1,srd.getOrderid());
       stm.setObject(2,srd.getItemcode() );
       stm.setObject(3, srd.getQty());
       return stm.executeUpdate()>0;
    }

    


    public static Supplierorderdetail[] searchdetails(String orderid)throws SQLException,ClassNotFoundException {
        String sql="select * from supplierorderdetails where orderID='"+orderid+"'";
         Connection con=DBConnection.getDBConnection().getConnection();
        Statement stm=con.createStatement();
        ResultSet rst=stm.executeQuery(sql);
        int count=0;
            while(rst.next()){
                count++;
            }
            Supplierorderdetail [] list=new Supplierorderdetail[count];
            rst.beforeFirst();
            for(int i=0;rst.next();i++){
            list [i]=new Supplierorderdetail(rst.getString("orderID"),rst.getString("itemcode"),rst.getDouble("qty"));
            
            }
            return list;
    }

    public static boolean deleteorder(String orderid, String itemcode) throws SQLException,ClassNotFoundException {
        String sql="Delete from supplierorderdetails where orderID='"+orderid+"' AND itemcode='"+itemcode+"'";
        Connection connection=DBConnection.getDBConnection().getConnection();
        PreparedStatement stm=connection.prepareStatement(sql);
        return stm.executeUpdate()>0;
    }

   
    

   
}
