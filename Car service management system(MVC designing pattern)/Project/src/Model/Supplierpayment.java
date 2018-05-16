package Model;


public class Supplierpayment {
    private String paymentID;
    private String date;
    private double amount;

    public Supplierpayment() {
    }

    public Supplierpayment(String paymentID, String date, double amount) {
        this.paymentID = paymentID;
        this.date = date;
        this.amount = amount;
    }

    public String getPaymentID() {
        return paymentID;
    }

    public String getDate() {
        return date;
    }

    public double getAmount() {
        return amount;
    }
    
    
}
