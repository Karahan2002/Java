import java.nio.file.*;
import java.nio.*;

public class createDirectory{
        public static void main(String[]args){
                try{
                        Path p = Paths.get(directory name);

                        if(Files.exists(p)){
                                System.out.println("Directory already exists");
                        }else{
                                Path newPath = Files.createDirectories(p);
                                System.out.println("directory created at "+newPath.toString());

                        }
                }catch(Exception e){
                        System.out.println("hata : "+e);
                }
        }
}
