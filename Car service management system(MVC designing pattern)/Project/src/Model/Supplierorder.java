package Model;

public class Supplierorder {
  private  String orderID;
  private String supplierID;
  private String date;

    public Supplierorder() {
    }

    public Supplierorder(String orderID, String supplierID,String date) {
        this.orderID = orderID;
        this.supplierID = supplierID;
        this.date=date;
    }

    public String getOrderID() {
        return orderID;
    }

    public String getSupplierID() {
        return supplierID;
    }

    public String getDate() {
        return date;
    }
  
  
}
