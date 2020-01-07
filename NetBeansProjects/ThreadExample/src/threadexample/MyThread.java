package threadexample;

public class MyThread extends Thread {
  
    public MyThread(String x)
    {
    
        super(x); //super class a thread ar namkoron kortase nadileo osubidha nai
        this.start(); //ai class ar akta object,start hobar porei kebol run a jabe
    }
    @Override
    public void run()
    {
    System.out.println("current thread: "+Thread.currentThread().getName());
    try{
    Thread.sleep(3000);
    
    }
    catch(Exception e){
    
    }
System.out.println("after sleep mode");
    }
}
