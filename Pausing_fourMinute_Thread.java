public class Pausing_fourMinute_Thread{
        public static void main(String[]args)throws InterruptedException{
                String info[] = {"1","2","3","4","5","6","7"};
                for(int i=0;i<info.length;i++){
                        Thread.sleep(4000);
                        System.out.println(info[i]);
                }
        }
}
