package Model;

public class Product {

    String CategoryID, ProductID, ProductName, ProductImage;
    int ProductQuantity;
    double Price;

    public Product(String CategoryID, String ProductID, String ProductName, int ProductQuantity, double Price, String ProductImage) {
        this.CategoryID = CategoryID;
        this.ProductID = ProductID;
        this.ProductName = ProductName;
        this.ProductQuantity = ProductQuantity;
        this.Price = Price;
        this.ProductImage = ProductImage;
    }

    public Product(String CategoryID, String ProductID) {
        this.CategoryID = CategoryID;
        this.ProductID = ProductID;

    }

    public Product(String ProductID) {
        this.ProductID = ProductID;
    }

    public String getCategoryID() {
        return CategoryID;
    }

    public void setCategoryID(String CategoryID) {
        this.CategoryID = CategoryID;
    }

    public String getProductID() {
        return ProductID;
    }

    public void setProductID(String ProductID) {
        this.ProductID = ProductID;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    public String getProductImage() {
        return ProductImage;
    }

    public void setProductImage(String ProductImage) {
        this.ProductImage = ProductImage;
    }

    public int getProductQuantity() {
        return ProductQuantity;
    }

    public void setProductQuantity(int ProductQuantity) {
        this.ProductQuantity = ProductQuantity;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    @Override
    public String toString() {
        return "Product{" + "CategoryID=" + CategoryID + ", ProductID=" + ProductID + ", ProductName=" + ProductName + ", ProductQuantity="
                + ProductQuantity + ", ProductQuantity="
                + ProductQuantity + ", Price=" + Price + ", ProductImage=" + ProductImage + '}';
    }

}
