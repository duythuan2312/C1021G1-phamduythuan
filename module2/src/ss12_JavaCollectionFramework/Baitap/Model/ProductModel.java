package ss12_JavaCollectionFramework.Baitap.Model;

public  class ProductModel implements Comparable<ProductModel> {
    public int id;
    public String productName;
    private double price;

    public ProductModel() {
    }

    public ProductModel(int id, String productName,double price) {
        this.id = id;
        this.productName = productName;
        this.price = price;
    }

    public ProductModel(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ProductModel(int id) {
        this.id = id;
    }

    public ProductModel(String productName) {
        this.productName = productName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "ProductModel{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ",price=" +price+
                '}';
    }

    @Override
    public int compareTo(ProductModel price) {
        return (int) (this.price - price.getPrice());
    }
}
