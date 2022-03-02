package ss30000_Dethimodule2.model;

public abstract class Product {
    private int id;
    private static int idAuto = 0;
    private String productCode;
    private String nameProduct;
    private double price;
    private int quantily;
    private String producer;

    public Product() {
    }

    public Product(String productCode, String nameProduct, double price, int quantily, String producer) {
        idAuto++;
        this.id = idAuto;
        this.productCode = productCode;
        this.nameProduct = nameProduct;
        this.price = price;
        this.quantily = quantily;
        this.producer = producer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getIdAuto() {
        return idAuto;
    }

    public static void setIdAuto(int idAuto) {
        Product.idAuto = idAuto;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantily() {
        return quantily;
    }

    public void setQuantily(int quantily) {
        this.quantily = quantily;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", productCode='" + productCode + '\'' +
                ", nameProduct='" + nameProduct + '\'' +
                ", price=" + price +
                ", quantily=" + quantily +
                ", producer='" + producer + '\'' +
                '}';
    }
}
