//In this code we can create and write a new file using File and FileWriter classes

import java.io.File;
import java.io.FileWriter;

public class main{
        public static void main(String[]args){
                File file = new File("yakup.txt");
                try{
                        if(file.createNewFile()){
                                System.out.println("dosya olusturuldu");
                        }else{
                                System.out.println("dosya olusturulamadi");
                        }
                }catch(Exception e){
                        System.out.println("hata : "+e);
                }
                try{
                        FileWriter writer = new FileWriter(file);
                        writer.write("yakup karahan");
                        writer.close();
                        System.out.println("dosya yazildi");
                }catch(Exception e){
                        System.out.println("hata : "+e);
                }
        }
}
