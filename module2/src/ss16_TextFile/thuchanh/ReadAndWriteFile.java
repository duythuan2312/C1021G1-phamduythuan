package ss16_TextFile.thuchanh;

import java.io.*;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public static void main(String[] args) throws IOException {
        List<Integer> stringList = new ArrayList<>();
        FileReader fileReader = new FileReader("D:\\codegym1\\module2\\number.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String i;
        while ((i = bufferedReader.readLine()) != null) {
            int number = Integer.parseInt(i);
            stringList.add(number);
        }
        System.out.println(stringList);
        int max = stringList.get(0);
        for (int j = 0; j < stringList.size(); j++) {
            if (stringList.get(j) > max) {
                max = stringList.get(j);
            }
        }
        System.out.println("Số lớn nhất là :" + max);

        FileWriter fileWriter = new FileWriter("Data.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("Giá trị lớn nhất là : " + max);
        bufferedWriter.close();
    }

}


