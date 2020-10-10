import java.net.*;

public class main{
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
