package customexceptionexample;

public class Main {

    public static void main(String[] args) {
      try{
      calculate(11);
      }
      catch (MyException e){
      System.out.println("caught exception"+e);
      }
    }
    public static void calculate(int x) throws MyException
    
    {
      if (x>10)throw new MyException("Greater than 10"); 
      else {
      System.out.println("normal exit");
      }
    }
}
