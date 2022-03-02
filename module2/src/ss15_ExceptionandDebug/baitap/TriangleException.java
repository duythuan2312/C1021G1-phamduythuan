package ss15_ExceptionandDebug.baitap;

import java.util.Scanner;

public class TriangleException {

    public  static void illegalTriangleException() throws Exception{
        Scanner scanner = new Scanner(System.in);
         boolean check = false;
        do {
            try {
                System.out.println("Enter edge A ");
                int A = Integer.parseInt(scanner.nextLine());
                if (A < 0){
                    check = true;
                    throw new IllegalTriangleException("Không được nhập số âm ");
                }
                System.out.println("Enter edge B");
                int B = Integer.parseInt(scanner.nextLine());
                if (B < 0){
                    check = true;
                    throw new IllegalTriangleException("Không được nhập số âm");
                }
                System.out.println("Enter edge C");
                int C = Integer.parseInt(scanner.nextLine());
                if (C < 0){
                    check = true;
                    throw new IllegalTriangleException("Không được nhập số âm");
                }
                if (A+B <= C || A+C <= B || B+C <= A ){
                    check = true;
                    throw new IllegalTriangleException("Tổng 2 số phải lớn hơn 1 số còn lại :");
                }
            }catch (IllegalTriangleException e){
                check = true;
                System.err.println(e.getError());
            }catch (Exception e){
                check = true;
                System.err.println("Error...........");
            }
        }while (check);




    }
    public static void main(String[] args) {
           try {
               illegalTriangleException();

           }catch (IllegalTriangleException e){
               System.err.println(e.getError());

           }catch (Exception e) {
               e.printStackTrace();
           }

    }
}
