package Model;


public class serviceitemdetails {
    private String invoiceno;
    private String batchno;
    private double qty;
    private double totaldiscount;
    private double totalamount;

    public serviceitemdetails() {
    }

    public serviceitemdetails(String invoiceno, String batchno, double qty, double totaldiscount, double totalamount) {
        this.invoiceno = invoiceno;
        this.batchno = batchno;
        this.qty = qty;
        this.totaldiscount = totaldiscount;
        this.totalamount = totalamount;
    }

    public String getInvoiceno() {
        return invoiceno;
    }

    public String getBatchno() {
        return batchno;
    }

    public double getQty() {
        return qty;
    }

    public double getTotaldiscount() {
        return totaldiscount;
    }

    public double getTotalamount() {
        return totalamount;
    }
    
    
}
