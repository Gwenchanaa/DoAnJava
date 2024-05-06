package Model;

public class Company {
    String CompanyID, CompanyName;

    public Company(String CompanyID, String CompanyName) {
        this.CompanyID = CompanyID;
        this.CompanyName = CompanyName;
    }

    public String getCompanyID() {
        return CompanyID;
    }

    public void setCompanyID(String CompanyID) {
        this.CompanyID = CompanyID;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String CompanyName) {
        this.CompanyName = CompanyName;
    }

    @Override
    public String toString() {
        return "Company{" + "CompanyID=" + CompanyID + ", CompanyName=" + CompanyName + '}';
    }
    
}
