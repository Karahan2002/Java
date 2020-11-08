import java.nio.file.*;
import java.nio.*;

public class DirectoryInfo{
        public static void main(String[]args){
                try{
                        Path p = Paths.get("yakup");

                        if(Files.exists(p)){
                                System.out.println("Directory information : ");

                                Path newPath = Files.createDirectories(p);
                                System.out.println("directory created at "+newPath.toString());
                                System.out.println("file name : "+newPath.getFileName());
                                System.out.println("file system : "+newPath.getFileSystem());
                                System.out.println("number of name elements : "+newPath.getNameCount());
                                System.out.println("parent path : "+newPath.getParent());
                                System.out.println("root component of the path : "+newPath.getRoot());
                                System.out.println("hash code of the path : "+newPath.hashCode());
                                System.out.println("file : "+newPath.toFile());
                        }else{
                                System.out.println("the path doesn't exist");
                        }
                }catch(Exception e){
                        System.out.println("hata : "+e);
                }
        }
}
