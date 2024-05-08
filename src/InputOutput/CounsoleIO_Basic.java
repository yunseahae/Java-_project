package InputOutput;

import java.io.*;

public class CounsoleIO_Basic {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);

        String a = br.readLine(); // readLine -- 한줄씩 읽어와라
        System.out.println(a);
    }
}
