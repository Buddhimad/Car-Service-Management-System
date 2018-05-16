package Model;

public class Item {
    private String itemcode;
    private String batchno;
    private String brandID;
    private String categoryID;
    private String name;
    private double qty;
    private double discount;
    private double price;
    public Item(){}

    public Item(String itemcode, String batchno, String brandID, String categoryID, String name, double qty, double discount, double price) {
        this.itemcode = itemcode;
        this.batchno = batchno;
        this.brandID = brandID;
        this.categoryID = categoryID;
        this.name = name;
        this.qty = qty;
        this.discount = discount;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getQty() {
        return qty;
    }

    public double getDiscount() {
        return discount;
    }

    public double getPrice() {
        return price;
    }
    

    public String getItemcode() {
        return itemcode;
    }

    public String getBatchno() {
        return batchno;
    }

    public String getBrandID() {
        return brandID;
    }

    public String getCategoryID() {
        return categoryID;
    }
    
    
}
