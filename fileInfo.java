import java.io.File;

public class main{
        public static void main(String[]args){
                File file = new File("yakup.txt");
                try{
                        if(file.exists()){
                                System.out.println("file information : ");
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
                        }else{
                                if(file.createNewFile()){
                                        System.out.println("file created");
                                }
                        }
                }catch(Exception e){
                        System.out.println("hata : "+e);
                }
        }
}
