package ss17_BinaryFileSerialization.baitap.module;

import java.io.Serializable;

public class Product implements Serializable {
    private String id;
    private String prodoctName;
    private String productionKhan;
    private double Price;
    private String description;

    public Product(String id, String prodoctName, String productionKhan, double price, String description) {
        this.id = id;
        this.prodoctName = prodoctName;
        this.productionKhan = productionKhan;
        Price = price;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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
        return "Product{" +
                "id=" + id +
                ", prodoctName='" + prodoctName + '\'' +
                ", productionKhan='" + productionKhan + '\'' +
                ", Price=" + Price +
                ", description='" + description + '\'' +
                '}';
    }
}
