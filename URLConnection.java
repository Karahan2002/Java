import java.net.*;

public class URLConnection{
        public static void main(String[]args){
                try{
                        URL url = new URL("a url");
                        URLConnection connection = url.openConnection();
                        connection.connect();
                        System.out.println("Connected succesfully!!");
                }catch(Exception e){
                        System.out.println("hata : "+e);
                }
        }
}
