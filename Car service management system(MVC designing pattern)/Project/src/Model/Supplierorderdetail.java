
package Model;

public class Supplierorderdetail {
   private String orderid;
   private String itemcode;
   private double qty;

    public Supplierorderdetail() {
    }

    public Supplierorderdetail(String orderid, String itemcode, double qty) {
        this.orderid = orderid;
        this.itemcode = itemcode;
        this.qty = qty;
    }

    public String getOrderid() {
        return orderid;
    }

    public String getItemcode() {
        return itemcode;
    }

    public double getQty() {
        return qty;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public void setItemcode(String itemcode) {
        this.itemcode = itemcode;
    }

    public void setQty(double qty) {
        this.qty = qty;
    }

   
   
   
}
