package ss30000_Dethimodule2.model;

public class ImportedProducts extends  Product{
    private double importPrices;
    private String importProvince;
    private double importTax;



    public ImportedProducts() {
    }

    public ImportedProducts(String productCode, String nameProduct, double price, int quantily, String producer, double importPrices, String importProvince, double importTax) {
        super(productCode, nameProduct, price, quantily, producer);
        this.importPrices = importPrices;
        this.importProvince = importProvince;
        this.importTax = importTax;
    }

    public double getImportPrices() {
        return importPrices;
    }

    public void setImportPrices(double importPrices) {
        this.importPrices = importPrices;
    }

    public String getImportProvince() {
        return importProvince;
    }

    public void setImportProvince(String importProvince) {
        this.importProvince = importProvince;
    }

    public double getImportTax() {
        return importTax;
    }

    public void setImportTax(double importTax) {
        this.importTax = importTax;
    }

    @Override
    public String toString() {
        return "ImportedProducts{" +
                super.toString()+
                "importPrices=" + importPrices +
                ", importProvince='" + importProvince + '\'' +
                ", importTax=" + importTax +
                '}';
    }
}
