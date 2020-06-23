import java.io.*;

public class ReadByte{
        public static void main(String[]args){
                File file = new File("yourfile.txt");
                try{
                        FileReader fr = new FileReader(file);
                        int c = fr.read();
                        while(c!=-1){
                                char k = (char)c;
                                System.out.print(k+" ");
                                c = fr.read();
                        }
                }catch(Exception e){
                        System.out.println("hata : "+e);
                }
        }
}
