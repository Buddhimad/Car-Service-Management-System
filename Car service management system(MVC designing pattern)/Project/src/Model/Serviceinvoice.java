package Model;


public class Serviceinvoice {
    private String invoiceno;
    private String vehicleno;
    private double milage;
    private String date;

    public Serviceinvoice() {
    }

    public Serviceinvoice(String invoiceno, String vehicleno, double milage, String date) {
        this.invoiceno = invoiceno;
        this.vehicleno = vehicleno;
        this.milage = milage;
        this.date = date;
    }

    public String getInvoiceno() {
        return invoiceno;
    }

    public String getVehicleno() {
        return vehicleno;
    }

    public double getMilage() {
        return milage;
    }

    public String getDate() {
        return date;
    }
    
    
}
