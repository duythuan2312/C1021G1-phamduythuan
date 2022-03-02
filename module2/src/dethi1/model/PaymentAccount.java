package dethi1.model;

public class PaymentAccount extends BankAccount {
      private String sothe;
      private double sotien;

      public PaymentAccount() {
      }

      public PaymentAccount(String MTK, String name, String ngaytao, String sothe, double sotien) {
            super(MTK, name, ngaytao);
            this.sothe = sothe;
            this.sotien = sotien;
      }

      public String getSothe() {
            return sothe;
      }

      public void setSothe(String sothe) {
            this.sothe = sothe;
      }

      public double getSotien() {
            return sotien;
      }

      public void setSotien(double sotien) {
            this.sotien = sotien;
      }

      @Override
      public String toString() {
            return "PaymentAccount{" +
                    super.toString()+
                    "sothe='" + sothe + '\'' +
                    ", sotien=" + sotien +
                    '}';
      }
}
