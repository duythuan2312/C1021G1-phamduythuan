package ss17_BinaryFileSerialization.baitap;

import java.io.Serializable;

public class ProductManagement implements Serializable {
    private int id;
    private String prodoctName;
    private String productionKhan;
    private double Price;
    private String description;

    public ProductManagement(int id, String prodoctName, String productionKhan, double price, String description) {
        this.id = id;
        this.prodoctName = prodoctName;
        this.productionKhan = productionKhan;
        Price = price;
        this.description = description;
    }

    public ProductManagement() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProdoctName() {
        return prodoctName;
    }

    public void setProdoctName(String prodoctName) {
        this.prodoctName = prodoctName;
    }

    public String getProductionKhan() {
        return productionKhan;
    }

    public void setProductionKhan(String productionKhan) {
        this.productionKhan = productionKhan;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "ProductManagement{" +
                "id=" + id +
                ", prodoctName='" + prodoctName + '\'' +
                ", productionKhan='" + productionKhan + '\'' +
                ", Price=" + Price +
                ", description='" + description + '\'' +
                '}';
    }
}
