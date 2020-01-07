package runnableexample;

public class MyThread implements Runnable {
 Thread thread;
    
    public MyThread(String x){
     thread=new Thread(this,x);
     if (x.equals("Thread-1")) thread.setPriority(Thread.MAX_PRIORITY); //priority set korlam
     else thread.setPriority(Thread.MIN_PRIORITY);
     thread.start();
    }
    public void run() {
    
       for(int i=1;i<=5;i++){
       System.out.println(Thread.currentThread().getName()+" i ar iteration: "+i);
       try{
       Thread.sleep(3000);
       }
       catch(Exception e){
       
       }
       
       } 
    }
    

    
    
    
}
