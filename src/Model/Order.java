package Model;


public class Order {
    
        String OrderID,UserID,CustomerID,OrderDate;

    public Order(String OrderID, String UserID, String CustomerID, String OrderDate) {
        this.OrderID = OrderID;
        this.UserID = UserID;
        this.CustomerID = CustomerID;
        this.OrderDate = OrderDate;
    }

    public String getOrderID() {
        return OrderID;
    }

    public void setOrderID(String OrderID) {
        this.OrderID = OrderID;
    }

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String UserID) {
        this.UserID = UserID;
    }

    public String getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(String CustomerID) {
        this.CustomerID = CustomerID;
    }

    public String getOrderDate() {
        return OrderDate;
    }

    public void setOrderDate(String OrderDate) {
        this.OrderDate = OrderDate;
    }

    @Override
    public String toString() {
        return "Order{" + "OrderID=" + OrderID + ", UserID=" + UserID + ", CustomerID=" + CustomerID + ", OrderDate=" + OrderDate + '}';
    }
        
}
