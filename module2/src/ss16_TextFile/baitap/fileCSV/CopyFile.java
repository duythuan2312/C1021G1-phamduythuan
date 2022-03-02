package ss16_TextFile.baitap.fileCSV;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
    public static List<Module> readCSV() throws IOException {
        List<Module> list = new ArrayList<>();
        FileReader fileReader = new FileReader("D:\\codegym1\\module2\\src\\ss16_TextFile\\baitap\\fileCSV\\Nation.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        String temp[];
        Module module;
        while ((line = bufferedReader.readLine()) != null) {
            temp = line.split(",");
            module = new Module(Integer.parseInt(temp[0]), temp[1], temp[2]);
            list.add(module);
        }
        bufferedReader.close();

        return list;

    }
    public static void main(String[] args) throws IOException {
        List<Module>  list = readCSV();
        for (Module module : list){
            System.out.println(module.getName());
        }

    }
}