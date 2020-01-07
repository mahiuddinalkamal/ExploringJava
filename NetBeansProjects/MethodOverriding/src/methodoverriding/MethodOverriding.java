package methodoverriding;


public class MethodOverriding {

    public static void main(String[] args) {
        
        Class3 obj=new Class3();
        obj.getName();
 
        
    }
    
    public void getName()
    {
    
        System.out.println("mak");
    }
}
