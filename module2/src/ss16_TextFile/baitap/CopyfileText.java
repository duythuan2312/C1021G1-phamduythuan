package ss16_TextFile.baitap;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CopyfileText {

    public static final String FILE_TEXT = "D:\\codegym1\\module2\\target.txt";

    public List<String> readFile() throws IOException {
        String result = "";
        FileReader fileReader = new FileReader("D:\\codegym1\\module2\\source.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String i;
        List<String> list = new ArrayList<>();
        while ((i=bufferedReader.readLine()) != null){
                list.add(i);
        }
        bufferedReader.close();
        return list;
    }
    public void writeFile(List<String> str) throws IOException {
        FileWriter fileWriter = new FileWriter(FILE_TEXT);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (int i =0 ; i < str.size() ;i++){
           bufferedWriter.write(str.get(i));
           bufferedWriter.newLine();
       }
       bufferedWriter.close();

    }
    public static void main(String[] args) throws IOException {
        CopyfileText copyfileText = new CopyfileText();
        copyfileText.writeFile(copyfileText.readFile());
    }
}
