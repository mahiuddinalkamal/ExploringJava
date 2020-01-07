
package samestringcheck;


public class SameStringCheck {

    public static void main(String[] args) {
        
        //string comparison
            String s1="Abcd";
               String s2="bacd";
              int x= s1.compareTo(s2);
              System.out.println(x);
              
              //substring_check
              String a="1104047";
                 System.out.println(a.substring(2));
              System.out.println(a.substring(2,5));
              
              //same_string_check
              //case_sensitive
              String b="maaaak";
              String c="maaaAaK";
              boolean i=b.equals(c);
                System.out.println(i);
                //case_not_sensitive
                boolean j=b.equalsIgnoreCase(c);
                  System.out.println(j);
                //concate operation
                  
                  String m="mak";
                  String n="1104047";
                  String p= m.concat(n);
                   System.out.println(p);
                //region comparison
                   
                  boolean q= b.regionMatches(true,1,c, 2, 3);
                   // System.out.println(q);
              if(q) System.out.println("matched");
              else System.out.println("not matched");
              
        
    }
}
