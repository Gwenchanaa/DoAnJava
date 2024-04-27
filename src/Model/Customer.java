package model;

/**
 *
 * @author CUONG
 */

public class Customer {

    String CustomerID, CustomerName,CustomerPhone,CustomerAddress;

    public Customer() {
    }

    public Customer(String CustomerID, String CustomerName, String CustomerPhone, String CustomerAddress) {
        this.CustomerID = CustomerID;
        this.CustomerName = CustomerName;
        this.CustomerPhone = CustomerPhone;
        this.CustomerAddress = CustomerAddress;
    }

    public String getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(String CustomerID) {
        this.CustomerID = CustomerID;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

    public String getCustomerPhone() {
        return CustomerPhone;
    }

    public void setCustomerPhone(String CustomerPhone) {
        this.CustomerPhone = CustomerPhone;
    }

    public String getCustomerAddress() {
        return CustomerAddress;
    }

    public void setCustomerAddress(String CustomerAddress) {
        this.CustomerAddress = CustomerAddress;
    }

    @Override
    public String toString() {
        return "Customer{" + "CustomerID=" + CustomerID + ", CustomerName=" + CustomerName + ", CustomerPhone=" + CustomerPhone + ", CustomerAddress=" + CustomerAddress + '}';
    }
    
}
