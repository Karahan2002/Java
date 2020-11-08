import java.nio.file.*;
import java.nio.*;

public class crateFileInDirectory{
        public static void main(String[]args){
                try{
                        Path p = Paths.get("any directory/yakup.txt");

                        if(Files.exists(p)){
                                System.out.println("directory already exists");
                        }else{
                                Path newPath = Files.createFile(p);
                                System.out.println("file created at : "+newPath.toString());
                        }
                }catch(Exception e){
                        System.out.println("hata : "+e);
                }
        }
}
