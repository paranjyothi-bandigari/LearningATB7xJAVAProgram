package ex_18082024;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab200 {
    public static void main(String[] args) throws FileNotFoundException {
        Readfile();
    }

    private static void Readfile() throws FileNotFoundException,NullPointerException,ArithmeticException {
        String path = "C://a.txt";
        File file = new File(path);
        FileReader fileReader = new FileReader(file);
    }
}
