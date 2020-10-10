import java.net.*;

public class URLInfo{
        public static void main(String[]args){
                try{
                        URL url = new URL("a url");

                        System.out.println("protocol = " + url.getProtocol());
                        System.out.println("authority = " + url.getAuthority());
                        System.out.println("host = " + url.getHost());
                        System.out.println("port = " + url.getPort());
                        System.out.println("path = " + url.getPath());
                        System.out.println("query = " + url.getQuery());
                        System.out.println("filename = " + url.getFile());
                        System.out.println("ref = " + url.getRef());
                }catch(Exception e){
                        System.out.println("hata : "+e);
                }
        }
}
