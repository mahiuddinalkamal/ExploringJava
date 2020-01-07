
package pkgstatic;


public class Static {

    public static void main(String[] args) {
    
        MyClass obj1=new MyClass();
           MyClass obj2=new MyClass();
        obj1.x++;
        obj1.y++;
        obj2.x++;
        obj2.y++;
        
        System.out.println(obj1.x);
         System.out.println(obj2.x);
          System.out.println(obj1.x);
           System.out.println(obj2.y);
    }
}
