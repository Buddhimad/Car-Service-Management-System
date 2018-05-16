
package Model;

public class Batch {
    private String batchno;
    private String invoiceno;
    private double amount;
    private String date;
    
    public Batch(){}
    public Batch(String batchno,String invoiceno,double amount,String date){
        this.batchno=batchno;
        this.invoiceno=invoiceno;
        this.amount=amount;
        this.date=date;
    }

    public String getBatchno() {
        return batchno;
    }

    public String getInvoiceno() {
        return invoiceno;
    }

    public double getAmount() {
        return amount;
    }

    public String getDate() {
        return date;
    }
    
}
