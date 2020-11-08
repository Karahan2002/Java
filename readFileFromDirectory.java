import java.nio.file.*;
import java.util.*;

public class readFileFromDirectory{
        public static void main(String[]args){
                try{
                        Path p = Paths.get(directory of the file);

                        List<String> data = Files.readAllLines(p);

                        for(String s:data){
                                System.out.println(s);
                        }
                }catch(Exception e){
                        System.out.println("hata : "+e);
                }
        }
}
