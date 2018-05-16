package Model;


public class Supplierreturn {
    private String srID;
    private String supplierID;
    private String batchno;
    private String reson;
    private double qty;
    private String date;

    public Supplierreturn() {
    }

    public Supplierreturn(String srID, String supplierID, String batchno, String reson, double qty, String date) {
        this.srID = srID;
        this.supplierID = supplierID;
        this.batchno = batchno;
        this.reson = reson;
        this.qty = qty;
        this.date = date;
    }

    public String getSrID() {
        return srID;
    }

    public String getSupplierID() {
        return supplierID;
    }

    public String getBatchno() {
        return batchno;
    }

    public String getReson() {
        return reson;
    }

    public double getQty() {
        return qty;
    }

    public String getDate() {
        return date;
    }
    
    
}
