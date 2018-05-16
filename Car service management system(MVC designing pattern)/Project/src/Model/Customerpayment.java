package Model;
 
public class Customerpayment {
    private String PaymentID;
    private String invoiceno;
    private double amount;
    private String date;
    
    public Customerpayment(){}
    public Customerpayment(String PaymentID,String invoiceno,double amount,String date){
        this.PaymentID=PaymentID;
        this.invoiceno=invoiceno;
        this.amount=amount;
        this.date=date;
    
    }

    public String getPaymentID() {
        return PaymentID;
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
