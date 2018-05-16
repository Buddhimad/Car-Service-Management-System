package Model;

public class Servicecategory {
    private String CategoryID;
    private String vehicletype;
    private String description;
    private int charge;

    public Servicecategory() {
    }

    public Servicecategory(String CategoryID, String vehicletype, String description, int charge) {
        this.CategoryID = CategoryID;
        this.vehicletype = vehicletype;
        this.description = description;
        this.charge = charge;
    }

    public String getCategoryID() {
        return CategoryID;
    }

    public String getVehicletype() {
        return vehicletype;
    }

    public String getDescription() {
        return description;
    }

    public int getCharge() {
        return charge;
    }
    
    
}
