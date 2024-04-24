package Model;

public class OrderDetail {

    String OrderID,
            ProductID;
    double OrderPrice;
    int OrderQuantity;

    public OrderDetail(String OrderID, String ProductID, double OrderPrice, int OrderQuantity) {
        this.OrderID = OrderID;
        this.ProductID = ProductID;
        this.OrderPrice = OrderPrice;
        this.OrderQuantity = OrderQuantity;
    }

    public String getOrderID() {
        return OrderID;
    }

    public void setOrderID(String OrderID) {
        this.OrderID = OrderID;
    }

    public String getProductID() {
        return ProductID;
    }

    public void setProductID(String ProductID) {
        this.ProductID = ProductID;
    }

    public double getOrderPrice() {
        return OrderPrice;
    }

    public void setOrderPrice(double OrderPrice) {
        this.OrderPrice = OrderPrice;
    }

    public int getOrderQuantity() {
        return OrderQuantity;
    }

    public void setOrderQuantity(int OrderQuantity) {
        this.OrderQuantity = OrderQuantity;
    }

    @Override
    public String toString() {
        return "OrderDetail{" + "OrderID=" + OrderID + ", ProductID=" + ProductID + ", OrderPrice=" + OrderPrice + ", OrderQuantity=" + OrderQuantity + '}';
    }
    
}
