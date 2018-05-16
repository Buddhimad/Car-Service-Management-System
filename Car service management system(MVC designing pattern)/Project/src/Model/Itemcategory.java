package Model;


public class Itemcategory {
    private String categoryID;
    private String category;
    private String country;

    public Itemcategory() {
    }

    public Itemcategory(String categoryID, String category, String country) {
        this.categoryID = categoryID;
        this.category = category;
        this.country = country;
    }

    public String getCategoryID() {
        return categoryID;
    }

    public String getCategory() {
        return category;
    }

    public String getCountry() {
        return country;
    }
    
    
}
