package Model;

public class Supplierorderdetails {
    private String orderID;
    private String itemcode;
    private double qty;

    public Supplierorderdetails() {
    }
    public Supplierorderdetails(String orderID, String itemcode, double qty) {
        this.orderID = orderID;
        this.itemcode = itemcode;
        this.qty = qty;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getItemcode() {
        return itemcode;
    }

    public void setItemcode(String itemcode) {
        this.itemcode = itemcode;
    }

    public double getQty() {
        return qty;
    }

    public void setQty(double qty) {
        this.qty = qty;
    }
}
