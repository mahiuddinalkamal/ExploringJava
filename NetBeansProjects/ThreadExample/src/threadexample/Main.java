package threadexample;

public class Main {

   
    public static void main(String[] args) {

        System.out.println("initial thread : "+Thread.currentThread().getName());
        MyThread obj= new MyThread("user created thread");
    }
}
