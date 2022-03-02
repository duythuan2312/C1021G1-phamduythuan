package ss30000_Dethimodule2.model;

public class ExportProducts extends Product {
    private double exportPrice;
    private String nationProducts;


    public ExportProducts() {
    }

    public ExportProducts(String productCode, String nameProduct, double price, int quantily, String producer, double exportPrice, String nationProducts) {
        super(productCode, nameProduct, price, quantily, producer);
        this.exportPrice = exportPrice;
        this.nationProducts = nationProducts;
    }

    public double getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(double exportPrice) {
        this.exportPrice = exportPrice;
    }

    public String getNationProducts() {
        return nationProducts;
    }

    public void setNationProducts(String nationProducts) {
        this.nationProducts = nationProducts;
    }

    @Override
    public String toString() {
        return "ExportProducts{" +
                super.toString()+
                "exportPrice=" + exportPrice +
                ", nationProducts='" + nationProducts + '\'' +
                '}';
    }
}
