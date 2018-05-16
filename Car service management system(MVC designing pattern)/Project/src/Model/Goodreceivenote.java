package Model;


public class Goodreceivenote {
    private String GRNno;
    private String batchno;
    private String orderID;
    private String paymentID;
    private double totaldiscount;
    private double totalamount;
    private double qty;
    public Goodreceivenote() {
    }
    public Goodreceivenote(String GRNno,String batchno,String orderID,String paymentID,double totaldiscount,double totalamount,double qty){
        this.GRNno=GRNno;
        this.batchno=batchno;
        this.orderID=orderID;
        this.paymentID=paymentID;
        this.totaldiscount=totaldiscount;
        this.totalamount=totalamount;
        this.qty=qty;
    
    } 

    public String getGRNno() {
        return GRNno;
    }

    public String getBatchno() {
        return batchno;
    }

    public String getOrderID() {
        return orderID;
    }

    public String getPaymentID() {
        return paymentID;
    }

    public double getTotaldiscount() {
        return totaldiscount;
    }

    public double getTotalamount() {
        return totalamount;
    }

    public double getQty() {
        return qty;
    }
    
    }

