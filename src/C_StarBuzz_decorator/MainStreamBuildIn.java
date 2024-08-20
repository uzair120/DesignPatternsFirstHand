package C_StarBuzz_decorator;

import C_StarBuzz_decorator.built_in.LowerCaseInputStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class MainStreamBuildIn {
    public static void execute() {
        int c;
        try {
            InputStream inputStream = new FileInputStream("./src/C_StarBuzz_decorator/input.txt");


            inputStream = new BufferedInputStream(inputStream);
            inputStream = new LowerCaseInputStream(inputStream);
            while ((c = inputStream.read()) >= 0) {
                System.out.print((char) c);
            }
            inputStream.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
