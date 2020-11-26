eimport java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class main{
        public static void main(String[]args)throws IOException{
                try{
                        Scanner scanner = new Scanner(new BufferedReader(new FileReader(new File("yakup.txt"))));
                        while(scanner.hasNext()){
                                System.out.print(scanner.next()+" ");
                        }
                }catch(Exception e){
                        System.out.println("hata : "+e);
                }
        }
}
