
package Model;


public class Supplier {
        private String supplierID;
        private String name;
        private String address;
        private String company;
        private int contactno;
        private String date;

    public Supplier() {
    }

    public Supplier(String supplierID, String name, String address, String company, int contactno, String date) {
        this.supplierID = supplierID;
        this.name = name;
        this.address = address;
        this.company = company;
        this.contactno = contactno;
        this.date = date;
    }

    public String getSupplierID() {
        return supplierID;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getCompany() {
        return company;
    }

    public int getContactno() {
        return contactno;
    }

    public String getDate() {
        return date;
    }
        
        
}
