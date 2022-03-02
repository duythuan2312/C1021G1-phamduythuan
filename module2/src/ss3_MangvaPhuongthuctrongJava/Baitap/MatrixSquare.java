package ss3_MangvaPhuongthuctrongJava.Baitap;

import java.util.Scanner;

public class MatrixSquare {
    static int row ,col;
    static int[][] matrix;
    public static int Sum(int row , int col){
        int sum = 0 ;
        for (int i = 0 ; i < row ; i++ ){
            for (int j = 0; j < col ; j++){
                if(i == j ){
                    sum+=matrix[i][j];
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input row :");
        row = scanner.nextInt();

        do {
            System.out.println("Input col :");
            col = scanner.nextInt();
            if(col < row || col > row){
                System.out.print("Please enter the column number using the line number.");
            }
        }while (col < row || col > row);
        matrix = new int[row][col];
        for (int i = 0; i < row;i++){
            for (int j = 0; j < col; j++){
                System.out.print("Enter an element in a location\n " + "(" +  i + ")" + "(" + j + ")" + " : " );
                matrix[i][j] = scanner.nextInt();
            }
        }
        for (int k = 0; k < matrix.length; k++){
            System.out.print("Matrix in place(" + k + ") ");
            for (int l = 0; l < matrix[k].length;l++){
                System.out.print(matrix[k][l] + "\t");
            }
            System.out.println();
        }
        int sum = Sum(row,col);
        System.out.println("The sum of the main diagonal in the square matrix is: " + sum);
    }

}
