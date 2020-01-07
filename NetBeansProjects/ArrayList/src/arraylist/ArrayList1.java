
package arraylist;
import java.util.ArrayList;

public class ArrayList1 {

    public static void main(String[] args) {
      ArrayList<String> a= new ArrayList<String>();
      System.out.println("size"+a.size());
      a.add("1");
              a.add("a");
        a.add("b");
          a.add("c");
            a.add("d");
              a.add("e");
              System.out.println("size"+a.size());
      
              System.out.println("content:"+a);
    //index ar pore add korte chaile
              a.add(2, "m");
      System.out.println("new content:"+a);
      //remove process
      a.remove(3);
       System.out.println("new content:"+a);
       a.add("d");
              System.out.println("new content:"+a);
                a.remove("d");//1st d ta remove korse
              System.out.println("new content:"+a);
              System.out.println(Integer.valueOf(a.get(0)));//here 0 is index
              
    
    }
}
