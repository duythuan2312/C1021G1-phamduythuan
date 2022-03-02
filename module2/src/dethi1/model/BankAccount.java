package dethi1.model;

public abstract class BankAccount {
    private int id;
    private static int idAuto = 0;
    private  String MTK;
    private String name;
    private String ngaytao;


    public BankAccount() {
    }

    public BankAccount(String MTK, String name, String ngaytao) {
        idAuto++;
        this.id = idAuto;
        this.MTK = MTK;
        this.name = name;
        this.ngaytao = ngaytao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdAuto() {
        return idAuto;
    }

    public void setIdAuto(int idAuto) {
        this.idAuto = idAuto;
    }

    public String getMTK() {
        return MTK;
    }

    public void setMTK(String MTK) {
        this.MTK = MTK;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNgaytao() {
        return ngaytao;
    }

    public void setNgaytao(String ngaytao) {
        this.ngaytao = ngaytao;
    }

    @Override
    public String toString() {
        return "id=" + id+
                ", MTK='" + MTK + '\'' +
                ", name='" + name + '\'' +
                ", ngaytao='" + ngaytao + '\'' +
                '}';
    }
}
