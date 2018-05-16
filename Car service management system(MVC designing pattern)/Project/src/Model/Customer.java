package Model;

public class Customer {
    private String CustomerID;
    private String name;
    private String address;
    private int telephoneno;
    private String date;
    
    public Customer(){}
    public Customer(String CustomerID,String name,String address,int telephoneno,String date){
        this.CustomerID=CustomerID;
        this.name=name;
        this.address=address;
        this.telephoneno=telephoneno;
        this.date=date;
    }

    public String getCustomerID() {
        return CustomerID;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getTelephoneno() {
        return telephoneno;
    }

    public String getDate() {
        return date;
    }
    
}
