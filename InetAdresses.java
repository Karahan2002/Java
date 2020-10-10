import java.net.*;

public class InetAdresses{
        public static void main(String[]args){
                try{
                        InetAddress address = InetAddress.getLocalHost();
                        System.out.println("raw ip address : "+address.getAddress());
                        System.out.println("fully qualified domain name for this ip address : "+address.getCanonicalHostName());
                        System.out.println("host address : "+address.getHostAddress());
                        System.out.println("host name : "+address.getHostName());
                        System.out.println("localhost : "+address.getLocalHost());
                        System.out.println("loopback address : "+address.getLoopbackAddress());
                        System.out.println("hash code : "+address.hashCode());
                }catch(Exception e){
                        System.out.println("hata : "+e);
                }
        }
}
