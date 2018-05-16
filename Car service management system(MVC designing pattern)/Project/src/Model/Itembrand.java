package Model;


public class Itembrand {
  private String brandID;
  private String brand;

    public Itembrand() {
    }

    public Itembrand(String brandID, String brand) {
        this.brandID = brandID;
        this.brand = brand;
    }

    public String getBrandID() {
        return brandID;
    }

    public String getBrand() {
        return brand;
    }

  
}
