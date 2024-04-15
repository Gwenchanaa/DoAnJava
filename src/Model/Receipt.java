package Model;

public class Receipt {

    String ReceiptID, ReceiptCompany, UserID, ReceiptDate;


    public Receipt(String ReceiptID, String ReceiptCompany, String UserID, String ReceiptDate) {
        this.ReceiptID = ReceiptID;
        this.ReceiptCompany = ReceiptCompany;
        this.UserID = UserID;
        this.ReceiptDate = ReceiptDate;
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

}
