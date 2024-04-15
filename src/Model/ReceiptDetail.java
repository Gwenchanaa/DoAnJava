package Model;

public class ReceiptDetail {

    String ReceiptID,
            ProductID;
    double ReceiptPrice;
    int ReceiptQuantity;

    public ReceiptDetail(String ReceiptID, String ProductID, int ReceiptQuantity, double ReceiptPrice) {
        this.ReceiptID = ReceiptID;
        this.ProductID = ProductID;
        this.ReceiptPrice = ReceiptPrice;
        this.ReceiptQuantity = ReceiptQuantity;
    }

    public String getReceiptID() {
        return ReceiptID;
    }

    public void setReceiptID(String ReceiptID) {
        this.ReceiptID = ReceiptID;
    }

    public String getProductID() {
        return ProductID;
    }

    public void setProductID(String ProductID) {
        this.ProductID = ProductID;
    }

    public double getReceiptPrice() {
        return ReceiptPrice;
    }

    public void setReceiptPrice(Double ReceiptPrice) {
        this.ReceiptPrice = ReceiptPrice;
    }

    public int getReceiptQuantity() {
        return ReceiptQuantity;
    }

    public void setReceiptQuantity(int ReceiptQuantity) {
        this.ReceiptQuantity = ReceiptQuantity;
    }

    @Override
    public String toString() {
        return "ReceiptDetail{" + "ReceiptID=" + ReceiptID + ", ProductID=" + ProductID + ", ReceiptPrice=" + ReceiptPrice + ", ReceiptQuantity=" + ReceiptQuantity + '}';
    }
    
}
