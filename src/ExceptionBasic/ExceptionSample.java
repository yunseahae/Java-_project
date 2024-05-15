package ExceptionBasic;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionSample {
    public static void main(String[] args) throws IOException {
        // FileNotFoundException
        /*BufferedReader br = new BufferedReader(new FileReader("없는 파일"));
        br.readLine();
        br.close();*/

        // ArithmeticException
        // int c = 4/0;

        int[] a = {1,2,3};
        System.out.println(a[2]);
    }
}
