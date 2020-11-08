import java.nio.file.*;

public class writeToDirectory{
        public static void main(String[]args){
                try{
                        Path p = Paths.get(directory of the file);
                        Path newPath = Files.createFile(p);

                        String content = "hello";

                        Files.write(newPath,content.getBytes());
                        System.out.println("data writed");


                }catch(Exception e){
                        System.out.println("hata : "+e);
                }
        }
}
