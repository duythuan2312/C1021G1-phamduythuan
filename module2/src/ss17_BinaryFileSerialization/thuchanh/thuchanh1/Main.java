package ss17_BinaryFileSerialization.thuchanh.thuchanh1;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class Main {

    public static final String REPLACE_EXISTING = "D:\\codegym1\\module2\\src\\ss17_BinaryFileSerialization\\thuchanh\\Data.txt";

    private static void copyFileUsingJava7Files(File source, File dest) throws IOException {
        Files.copy(source.toPath(),dest.toPath(),StandardCopyOption.REPLACE_EXISTING);
    }
    private static void copyFileUsingStream(File source ,File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer))>0){
                 os.write(buffer,0, length);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            is.close();
            os.close();
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập tệp nguồn :");
        String sourcePath = scanner.nextLine();
        System.out.println("Nhập tệp đích :");
        String destPath = scanner.nextLine();

        File sourceFile = new File(sourcePath);
        File destFile = new File(destPath);

        try {
            copyFileUsingJava7Files(sourceFile,destFile);
            System.out.println("Đã sao chép xong");
        }catch (IOException e){
            System.out.println("Không thể sao chép tệp đó");
            System.out.println(e.getMessage());
        }
    }
}
