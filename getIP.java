import java.net.*;

public class getIP{
        public static void main(String[]args){
                try{
                        InetAddress ip = InetAddress.getLocalHost();
                        System.out.println("ip address : "+ip.getHostAddress());
                }catch(Exception e){
                        System.out.println("hata : "+e);
                }
        }
}
