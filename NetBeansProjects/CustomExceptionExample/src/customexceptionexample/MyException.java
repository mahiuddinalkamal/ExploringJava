
package customexceptionexample;


public class MyException extends Exception {
    String value;
    public MyException(String x)
    {
    
        value="MyException: "+x;
    }

    @Override
    public String toString() //akhane override hocche
    {
        return value;
    }
            
}
