package Model;

public class Receipt {

    String ReceiptID, ReceiptCompany, UserID, ReceiptDate;
    int ReceiptQuantity;
    double ReceiptPrice;

    public Receipt(String ReceiptID, String ReceiptCompany, String UserID, String ReceiptDate, int ReceiptQuantity, double ReceiptPrice) {
        this.ReceiptID = ReceiptID;
        this.ReceiptCompany = ReceiptCompany;
        this.UserID = UserID;
        this.ReceiptDate = ReceiptDate;
        this.ReceiptQuantity = ReceiptQuantity;
        this.ReceiptPrice = ReceiptPrice;
    }

  

    @Override
    public String toString() {
        return "Receipt{" + "ReceiptID=" + ReceiptID + ", ReceiptCompany=" + ReceiptCompany + ", UserID=" + UserID + ", ReceiptDate=" + ReceiptDate + ", ReceiptQuantity=" + ReceiptQuantity + ", ReceiptPrice=" + ReceiptPrice + '}';
    }

    public String getReceiptID() {
        return ReceiptID;
    }

    public void setReceiptID(String ReceiptID) {
        this.ReceiptID = ReceiptID;
    }

    public String getReceiptCompany() {
        return ReceiptCompany;
    }

    public void setReceiptCompany(String ReceiptCompany) {
        this.ReceiptCompany = ReceiptCompany;
    }

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String UserID) {
        this.UserID = UserID;
    }

    public String getReceiptDate() {
        return ReceiptDate;
    }

    public void setReceiptDate(String ReceiptDate) {
        this.ReceiptDate = ReceiptDate;
    }

    public int getReceiptQuantity() {
        return ReceiptQuantity;
    }

    public void setReceiptQuantity(int ReceiptQuantity) {
        this.ReceiptQuantity = ReceiptQuantity;
    }

    public double getReceiptPrice() {
        return ReceiptPrice;
    }

    public void setReceiptPrice(double ReceiptPrice) {
        this.ReceiptPrice = ReceiptPrice;
    }

    
}
