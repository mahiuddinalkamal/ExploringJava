package methodoverloading;

public class Class1 {
      
    void getName()
     {
     
         System.out.println("this is method1");
     }
       public void getName(int a)
     {
     
         System.out.println("this is method2"+" "+a);
     }
        public void getName(String a)
     {
     
         System.out.println("this is method3"+" "+a);
     }
}
