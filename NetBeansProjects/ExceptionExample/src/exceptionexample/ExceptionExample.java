package exceptionexample;


public class ExceptionExample {

 
    public static void main(String[] args) {
 
        try{
                int a=5/2;//arithmetic exception hocche tai ai line ar pore sorasori catch a jabega
                System.out.println("after division:"+a);
        }
        catch(ArrayIndexOutOfBoundsException e){
        
            System.out.println("caught exception:ArrayIndexOutOfBoundsException ");
        }
        catch(ArithmeticException e){
        
            System.out.println("caught exception: ArithmeticException");
        }
        finally{
        
            System.out.println("this is finally block");
        }
        
          System.out.println("after try catch block");
      
}
}