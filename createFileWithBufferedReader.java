import java.io.*;

public class main{
        public static void main(String[]args){
                File file = new File("yakup.txt");

                //reading file
                try{
                        BufferedReader bf = new BufferedReader(new FileReader(file));
                        String x = bf.readLine();
                        while(x!=null){
                                System.out.println(x);
                                x = bf.readLine();
                        }
                }catch(Exception e){
                        System.out.println("hata : "+e);
                }
                //writing file
                try{
                        FileWriter writer = new FileWriter(file);
                        writer.write("yakup karahan");
                        writer.close();
                }catch(Exception e){
                        System.out.println("hata : "+e);
                }

        }
}
