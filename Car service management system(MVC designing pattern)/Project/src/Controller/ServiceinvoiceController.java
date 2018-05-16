package Controller;
import DBConnection.DBConnection;
import Model.Batch;
import Model.Customerpayment;
import Model.Servicedetails;
import Model.Serviceinvoice;
import Model.serviceitemdetails;
import java.sql.*;
import java.util.ArrayList;

public class ServiceinvoiceController {
      public static boolean addserviceinvoice(Serviceinvoice serviceinvoice) throws SQLException,ClassNotFoundException{
            String sql="insert into serviceinvoice values(?,?,?,?)";
            Connection con=DBConnection.getDBConnection().getConnection();
            PreparedStatement stm=con.prepareStatement(sql);
            stm.setObject(1, serviceinvoice.getInvoiceno());
            stm.setObject(2, serviceinvoice.getVehicleno());
            stm.setObject(3,serviceinvoice.getMilage());
            stm.setObject(4, serviceinvoice.getDate());
            int x=stm.executeUpdate();
            return x>0;
   }
    public static boolean Updateserviceinvoice(Serviceinvoice serviceinvoice) throws SQLException,ClassNotFoundException{
            String sql="Update serviceinvoice set vehicleno=?,milage=?,date=? where invoiceno=?";
            Connection con1=DBConnection.getDBConnection().getConnection();
            PreparedStatement stm=con1.prepareStatement(sql);
            stm.setObject(4, serviceinvoice.getInvoiceno());
            stm.setObject(1, serviceinvoice.getVehicleno());
            stm.setObject(2, serviceinvoice.getMilage());
            stm.setObject(3, serviceinvoice.getDate());
            int y=stm.executeUpdate();
            return y>0;
    }
    public static Serviceinvoice searchserviceinvoice(String no) throws SQLException,ClassNotFoundException{
            String sql="select * from serviceinvoice where invoiceno='"+no+"'";
            Connection con2=DBConnection.getDBConnection().getConnection();
            Statement stm=con2.createStatement();
            ResultSet rst=stm.executeQuery(sql);
            if(rst.next()){
            Serviceinvoice serviceinvoice=new Serviceinvoice(rst.getString("invoiceno"),rst.getString("vehicleno"),rst.getDouble("milage"),rst.getString("date"));
            return serviceinvoice;
            }
            return null;
    }
    public static boolean deleteserviceinvoice(String no) throws SQLException,ClassNotFoundException{
            String sql="Delete from serviceinvoice where invoiceno='"+no+"'";
            Connection con3=DBConnection.getDBConnection().getConnection();
            PreparedStatement stm=con3.prepareStatement(sql);
            int z=stm.executeUpdate();
            return z>0;
    }
    public static Serviceinvoice[] showserviceinvoice() throws SQLException,ClassNotFoundException{
            String sql="select * from serviceinvoice";
            Connection con4=DBConnection.getDBConnection().getConnection();
            Statement stm=con4.createStatement();
            ResultSet rst=stm.executeQuery(sql);
            int count=0;
            while(rst.next()){
                count++;
            }
            Serviceinvoice [] list=new Serviceinvoice[count];
            rst.beforeFirst();
            for(int i=0;rst.next();i++){
            list [i]=new Serviceinvoice(rst.getString("invoiceno"),rst.getString("vehicleno"),rst.getDouble("milage"),rst.getString("date"));
            
            }
            return list;
    }

    

    

    public static boolean addInvoice(Serviceinvoice serviceinvoice, Servicedetails servicedetails, serviceitemdetails serviceitemdetails, Customerpayment customerpayment)throws SQLException,ClassNotFoundException  {
        Connection connection=DBConnection.getDBConnection().getConnection();
        try{
            connection.setAutoCommit(false);
            String sql="Insert into serviceinvoice values(?,?,?,?)";
            PreparedStatement stm=connection.prepareStatement(sql);
            stm.setObject(1,serviceinvoice.getInvoiceno());
            stm.setObject(2,serviceinvoice.getVehicleno());
            stm.setObject(3,serviceinvoice.getMilage());
            stm.setObject(4,serviceinvoice.getDate());
            boolean IsserviceinvoiceAdded=stm.executeUpdate()>0;
            
            if(IsserviceinvoiceAdded){
                String sql1="Insert into servicedetails values(?,?)";
                PreparedStatement stm1=connection.prepareStatement(sql1);
                stm1.setObject(1,servicedetails.getInvoiceno());
                stm1.setObject(2,servicedetails.getCategoryID());
                boolean IsservicedetailsAdded=stm1.executeUpdate()>0;
                
                if(IsservicedetailsAdded){
                    String sql2="Insert into serviceitemdetails values(?,?,?,?,?)";
                    PreparedStatement stm2=connection.prepareStatement(sql2);
                    stm2.setObject(1,serviceitemdetails.getInvoiceno());
                    stm2.setObject(2,serviceitemdetails.getBatchno());
                    stm2.setObject(3,serviceitemdetails.getQty());
                    stm2.setObject(4,serviceitemdetails.getTotalamount());
                    stm2.setObject(5,serviceitemdetails.getTotaldiscount());
                    boolean IsitemdetailsAdded=stm2.executeUpdate()>0;
                    
                    if(IsitemdetailsAdded){
                        String sql4="Insert into customerpayment values(?,?,?,?)";
                         PreparedStatement stm4=connection.prepareStatement(sql4);
                         stm4.setObject(1,customerpayment.getPaymentID());
                         stm4.setObject(2,customerpayment.getInvoiceno());
                         stm4.setObject(3,customerpayment.getAmount());
                         stm4.setObject(4,customerpayment.getDate());
                         boolean IspaymentAdded=stm4.executeUpdate()>0;
                         
                         if(IspaymentAdded){
                             connection.commit();
                             return true;
                             
                         }else{
                             connection.rollback();
                             return false;
                         }//5
                    
                    }else{
                        connection.rollback();
                        return false;
                    }//3
                }else{
                        connection.rollback();
                        return false;
                }//2
            }else{
                    connection.rollback();
                    return false;
            }//1
        }finally{
            connection.setAutoCommit(true);
        }
    }

    public static ArrayList<String> getInvoiceno() throws SQLException,ClassNotFoundException{
        String sql="SELECT invoiceno FROM serviceinvoice ORDER BY invoiceno DESC LIMIT 1";
        Connection connection=DBConnection.getDBConnection().getConnection();
        Statement stm=connection.createStatement();
        ResultSet rst=stm.executeQuery(sql);
        ArrayList<String>invoiceno=new ArrayList<>();
        while(rst.next()){
            invoiceno.add(rst.getString("invoiceno"));
        }
        return invoiceno;
    }

    public static Serviceinvoice[] searchinvoicedetails(String invoiceno) throws SQLException,ClassNotFoundException {
       String sql="select * from serviceinvoice where invoiceno='"+invoiceno+"'";
        Connection connection=DBConnection.getDBConnection().getConnection();
        Statement stm=connection.createStatement();
        ResultSet rst=stm.executeQuery(sql);
        int count=0;
        while(rst.next()){
            count++;
        }
        Serviceinvoice [] payment=new Serviceinvoice[count];
        rst.beforeFirst();
        for(int i=0;rst.next();i++){
            payment[i]=new Serviceinvoice(rst.getString("invoiceno"),rst.getString("vehicleno"),rst.getDouble("milage"),rst.getString("date"));
        }
        return payment;
    
    }
}
