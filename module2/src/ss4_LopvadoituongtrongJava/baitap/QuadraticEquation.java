package ss4_LopvadoituongtrongJava.baitap;

import java.util.Scanner;

public class QuadraticEquation {
    private  int a,b,c;

    public QuadraticEquation(int a, int b ,int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }
    public double getDiscriminant(){
        double delta= this.b *this.b - 4*this.a*this.c;
        return delta;
    }
    public double getRoot1(){
        double getRoot1 = ((-this.b + Math.sqrt(this.b*this.b - 4*this.a*this.c)) / (2*this.a));
        return getRoot1;
    }
    public double getRoot2(){
        double getRoot2 = ((-this.b - Math.sqrt(this.b*this.b - 4*this.a*this.c)) / (2*a));
        return getRoot2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a A:");
        int a = scanner.nextInt();
        System.out.println("Enter a B:");
        int b = scanner.nextInt();
        System.out.println("Enter a C:");
        int c = scanner.nextInt();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        if (quadraticEquation.getDiscriminant() > 0){
            System.out.println("Phuong trinh co 2 nghiem :" +quadraticEquation.getRoot1());
            System.out.println("Phuong trinh co 2 nghiem :" +quadraticEquation.getRoot2());
        }else if (quadraticEquation.getDiscriminant() == 0){
            System.out.println("Phương trình có nghiệm kép =" +quadraticEquation.getRoot2());
        }else{
            System.out.println("Phương trình vô nghiệm ******");
        }

    }

}
