package Controller;
import DBConnection.DBConnection;
import Model.Servicecategory;
import Model.Servicedetails;
import java.sql.*;

public class ServicedetailsController {
      public static boolean addServicedetails(Servicedetails servicedetails) throws SQLException,ClassNotFoundException{
            String sql="insert into servicedetails values(?,?)";
            Connection con=DBConnection.getDBConnection().getConnection();
            PreparedStatement stm=con.prepareStatement(sql);
            stm.setObject(1, servicedetails.getCategoryID());
            stm.setObject(2, servicedetails.getInvoiceno());
             int x=stm.executeUpdate();
            return x>0;
   }
    public static boolean Updateservicedetails(Servicedetails servicedetails) throws SQLException,ClassNotFoundException{
            String sql="Update servicedetails set invoiceno=?where invoiceno=?";
            Connection con1=DBConnection.getDBConnection().getConnection();
            PreparedStatement stm=con1.prepareStatement(sql);
            stm.setObject(2, servicedetails.getCategoryID());
            stm.setObject(1, servicedetails.getInvoiceno());
            int y=stm.executeUpdate();
            return y>0;
    }
    public static Servicedetails searchservicedetails(String no) throws SQLException,ClassNotFoundException{
            String sql="select * from servicedetails where CategoryID='"+no+"'";
            Connection con2=DBConnection.getDBConnection().getConnection();
            Statement stm=con2.createStatement();
            ResultSet rst=stm.executeQuery(sql);
            if(rst.next()){
            Servicedetails servicedetails=new Servicedetails(rst.getString("CategoryID"),rst.getString("invoiceno"));
            return servicedetails;
            }
            return null;
    }
    public static boolean deleteservicedetails(String no) throws SQLException,ClassNotFoundException{
            String sql="Delete from servicedetails where CategoryID='"+no+"'";
            Connection con3=DBConnection.getDBConnection().getConnection();
            PreparedStatement stm=con3.prepareStatement(sql);
            int z=stm.executeUpdate();
            return z>0;
    }
    public static Servicedetails[] showbatch() throws SQLException,ClassNotFoundException{
            String sql="select * from servicedetails";
            Connection con4=DBConnection.getDBConnection().getConnection();
            Statement stm=con4.createStatement();
            ResultSet rst=stm.executeQuery(sql);
            int count=0;
            while(rst.next()){
                count++;
            }
            Servicedetails [] list=new Servicedetails[count];
            rst.beforeFirst();
            for(int i=0;rst.next();i++){
            list [i]=new Servicedetails(rst.getString("CategoryID"),rst.getString("invoiceno"));
            
            }
            return list;
    }
    

    public static int getServicecount(String id) throws SQLException,ClassNotFoundException{
        String sql="select count(*) AS C from servicedetails where CategoryID='"+id+"'";
        Connection con=DBConnection.getDBConnection().getConnection();
        Statement stm=con.createStatement();
        ResultSet rst=stm.executeQuery(sql);
        if(rst.next()){
            int num=rst.getInt("C");
            return num;
        }
       return 0;
    }

   

    public static double getmonthlyfullpayment(String month) throws SQLException,ClassNotFoundException {
        String sql="select sum(charge) AS T from servicedetails s,servicecategory c,serviceinvoice i where s.CategoryID=c.CategoryID AND s.invoiceno=i.invoiceno";
        Connection con=DBConnection.getDBConnection().getConnection();
        Statement stm=con.createStatement();
        ResultSet rst=stm.executeQuery(sql);
        if(rst.next()){
            double t=rst.getDouble("T");
            return t;
        }
        return 0;
    }
       // " select sum(charge) AS T from servicedetails natural join servicecategory natural join serviceinvoice where month(date)=month(curdate())"
    public static int getmonthservicecount() throws SQLException,ClassNotFoundException{
       String sql="select count(invoiceno) AS C from serviceinvoice where month(date)=month(curdate()) ";
       Connection con=DBConnection.getDBConnection().getConnection();
       Statement stm=con.createStatement();
       ResultSet rst=stm.executeQuery(sql);
       if(rst.next()){
           int count =rst.getInt("C");
           return count;
       }
       return 0;
    }

    public static int getyearservicecount() throws SQLException,ClassNotFoundException{
         String sql="select count(invoiceno) AS C from serviceinvoice where year(date)=year(curdate()) ";
       Connection con=DBConnection.getDBConnection().getConnection();
       Statement stm=con.createStatement();
       ResultSet rst=stm.executeQuery(sql);
       if(rst.next()){
           int count =rst.getInt("C");
           return count;
       }
       return 0;
    }

    public static double getyearfullpayment(String month) throws SQLException,ClassNotFoundException{
         String sql="select sum(charge) AS T from servicedetails s,servicecategory c,serviceinvoice i where s.CategoryID=c.CategoryID AND s.invoiceno=i.invoiceno AND year(date)=year(curdate())";
        Connection con=DBConnection.getDBConnection().getConnection();
        Statement stm=con.createStatement();
        ResultSet rst=stm.executeQuery(sql);
        if(rst.next()){
            double t=rst.getDouble("T");
            return t;
        }
        return 0;
    }

    public static Servicedetails[] searchservice(String invoiceno) throws SQLException,ClassNotFoundException {
       String sql="select * from servicedetails where invoiceno='"+invoiceno+"'";
       Connection connection=DBConnection.getDBConnection().getConnection();
        Statement stm=connection.createStatement();
            ResultSet rst=stm.executeQuery(sql);
            int count=0;
            while(rst.next()){
                count++;
            }
            Servicedetails [] list=new Servicedetails[count];
            rst.beforeFirst();
            for(int i=0;rst.next();i++){
            list [i]=new Servicedetails(rst.getString("CategoryID"),rst.getString("invoiceno"));
            
            }
            return list;
    }
}
