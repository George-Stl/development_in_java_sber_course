package Episode4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ConsoleReader {
    static String readString() throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }
    static int readInt() throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(reader.readLine());
    }
    static double readDouble() throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return Double.parseDouble(reader.readLine());
    }
    static boolean readBoolean() throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return Boolean.parseBoolean(reader.readLine());
    }

}
