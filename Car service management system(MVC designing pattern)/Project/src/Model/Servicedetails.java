package Model;

public class Servicedetails {
    private String CategoryID;
    private String invoiceno;

    public Servicedetails() {
    }

    public Servicedetails(String CategoryID, String invoiceno) {
        this.CategoryID = CategoryID;
        this.invoiceno = invoiceno;
    }

    public String getCategoryID() {
        return CategoryID;
    }

    public String getInvoiceno() {
        return invoiceno;
    }
    
    
}
