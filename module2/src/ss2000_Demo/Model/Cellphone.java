package ss2000_Demo.Model;

public class Cellphone extends Phone {
    private String portableCountry;
    private String status;

    public Cellphone() {
    }

    public Cellphone(String phoneName ,double price, int quantily, String producer, String portableCountry, String status) {
        super(phoneName ,price, quantily, producer);
        this.portableCountry = portableCountry;
        this.status = status;
    }

    public String getPortableCountry() {
        return portableCountry;
    }

    public void setPortableCountry(String portableCountry) {
        this.portableCountry = portableCountry;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Cellphone{" +
                super.toString()+
                "portableCountry='" + portableCountry + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
