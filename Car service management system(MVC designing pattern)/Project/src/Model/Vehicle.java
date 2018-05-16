package Model;


public class Vehicle {
   private String vehicleno;
   private String CustomerID;
   private String brand;
   private String model;
   private String enginetype;
   private String vehicletype;

    public Vehicle() {
    }

    public Vehicle(String vehicleno, String CustomerID, String brand, String model, String enginetype, String vehicletype) {
        this.vehicleno = vehicleno;
        this.CustomerID = CustomerID;
        this.brand = brand;
        this.model = model;
        this.enginetype = enginetype;
        this.vehicletype = vehicletype;
    }

    public String getVehicleno() {
        return vehicleno;
    }

    public String getCustomerID() {
        return CustomerID;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getEnginetype() {
        return enginetype;
    }

    public String getVehicletype() {
        return vehicletype;
    }
   
   
}
