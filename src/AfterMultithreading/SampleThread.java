package AfterMultithreading;

public class SampleThread extends Thread {
    SampleThread(){
        start(); // start running the thread
    }
    @Override
    public void run(){
     try{
         System.out.println("part2 to print in descending order");
         for(int j=10;j>=1;j--){
             System.out.println("j value is :"+j);
//             Thread.sleep(500);
         }
     }catch(Exception e){
         System.out.println("exception occurred : "+e.getMessage());
        }
    }
}
