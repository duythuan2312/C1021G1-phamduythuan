package ss2000_Demo.Model;

public abstract class Phone {
    private  int id;
    private static int idAuto = 0;
    private String phoneName;
    private double price;
    private int quantily;
    private String producer;

    public Phone() {
    }

    public Phone(String phoneName ,double price, int quantily, String producer) {
        idAuto++;
        this.id = idAuto;
        this.phoneName = phoneName;
        this.price = price;
        this.quantily = quantily;
        this.producer = producer;
    }

    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        return "id='" + id + '\'' +
                ",phoneName="+phoneName+
                ", price=" + price +
                ", quantily=" + quantily +
                ", producer='" + producer + '\'' +
                '}';
    }
}
