import java.io.File;
import java.io.FileWriter;
public class main{
        public static void main(String[]args){
                File file = new File("yakup.txt");
                File file2 = new File("fileInfo.txt");
                try{
                        if(file.exists()){
                                System.out.println("file informations : ");
                                System.out.println("absolute file : "+file.getAbsoluteFile());
                                System.out.println("canonical file : "+file.getCanonicalFile());
                                System.out.println("canonical path : "+file.getCanonicalPath());
                                System.out.println("free space : "+file.getFreeSpace());
                                System.out.println("file name : "+file.getName());
                                System.out.println("parent : "+file.getParent());
                                System.out.println("parent file : "+file.getParentFile());
                                System.out.println("path : "+file.getPath());
                                System.out.println("total space : "+file.getTotalSpace());
                                System.out.println("usable space : "+file.getUsableSpace());
                                System.out.println("length : "+file.length());
                        }else{
                                System.out.println("file doesn't exist");
                                System.out.println("creating new file...");
                                if(file.createNewFile()){
                                        System.out.println("file created succesfully!");
                                }
                        }
                        if(file2.createNewFile()){
                                System.out.println("----------------------");
                                System.out.println("file created");
                        }
                }catch(Exception e){
                        System.out.println("hata : "+e);
                }
                try{
                        FileWriter writer = new FileWriter(file2);
                        
                        writer.write("file informations : "+"\n");
                        writer.write("absolute file : "+file.getAbsoluteFile()+"\n");
                        writer.write("canonical file : "+file.getCanonicalFile()+"\n");
                        writer.write("canonical path : "+file.getCanonicalPath()+"\n");
                        writer.write("free space : "+file.getFreeSpace()+"\n");
                        writer.write("file name : "+file.getName()+"\n");
                        writer.write("parent : "+file.getParent()+"\n");
                        writer.write("parent file : "+file.getParentFile()+"\n");
                        writer.write("path : "+file.getPath()+"\n");
                        writer.write("total space : "+file.getTotalSpace()+"\n");
                        writer.write("usable space : "+file.getUsableSpace()+"\n");
                        writer.write("length : "+file.length()+"\n");
                        writer.close();
                        System.out.println("filw writed succesfully!!");
                }catch(Exception e){
                        System.out.println("hata : "+e);
                }
        }
}
