import java.io.*;

public class main{
        public static void main(String[]args){
                File f = new File("yakup.txt");
                try{
                        BufferedReader br = new BufferedReader(new FileReader(f));
                        System.out.println(br.readLine());
                        br.close();

                }catch(Exception e){
                        System.out.println("hata : "+e);
                }
        }
}