package model;

public class Product {
    private int id;
    private String nameProduct;
    private double price;
    private int quantily;
    private String color;
    private String description;

    private int idCategory;
    private String category;

    public Product(int id, String nameProduct, double price, int quantily, String color, String description, int idCategory) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.price = price;
        this.quantily = quantily;
        this.color = color;
        this.description = description;
        this.idCategory = idCategory;
    }

    public Product() {
    }

    public Product(String nameProduct, double price, int quantily, String color, String description, int idCategory) {
        this.nameProduct = nameProduct;
        this.price = price;
        this.quantily = quantily;
        this.color = color;
        this.description = description;
        this.idCategory = idCategory;
    }

    public Product(int id, String nameProduct, double price, int quantily, String color, String description, String category) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.price = price;
        this.quantily = quantily;
        this.color = color;
        this.description = description;
        this.category = category;
    }

    public Product(int id, String nameProduct, double price, int quantily, String color, String description) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.price = price;
        this.quantily = quantily;
        this.color = color;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
