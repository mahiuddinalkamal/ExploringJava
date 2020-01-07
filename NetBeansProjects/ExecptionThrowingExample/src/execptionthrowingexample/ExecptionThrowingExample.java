
package execptionthrowingexample;


public class ExecptionThrowingExample {

    public static void main(String[] args) {
        try {
        compute(0);
        }
        catch(Exception e)
        {
        System.out.println("caught exception "+e);
        }
    }
    
    public static void compute(int s) throws ArithmeticException 
    {
     if (s==0) throw new ArithmeticException("don't divide by zero");
     else {
      int a=10/s;
      System.out.println("compute result "+a);
     
     }
    
    }
}
