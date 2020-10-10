import java.net.*;
import java.io.*;

public class URLReader {
    public static void main(String[] args) throws Exception {

        URL oracle = new URL("a url");
        BufferedReader bf = new BufferedReader(new InputStreamReader(oracle.openStream()));

        String inputLine;
        while ((inputLine = bf.readLine()) != null)
            System.out.println(inputLine);
        in.close();
    }
}  
