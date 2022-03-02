package ss22_StructuralDesignpattern.thuchanh3;

import java.io.File;

public class FileCalculatorAdapter implements FileCalculator{
    @Override
    public long calculateSize(String path) {
       FileUtil fileUtil = new FileUtil();
       File file = new File(path);
       return fileUtil.hashCode();
    }
}
