package randomnumber;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;


public class Randomnumber {

  public static final Random gen = new Random();  

    public static int[] printRandomNumbers(int n, int maxRange) {  
         
      
        int[] result = new int[n];  
    
        Set<Integer> used = new HashSet<Integer>();  
      
    for (int i = 0; i < n; i++) {  
          
        int newRandom;  
        do {  
            newRandom = gen.nextInt(maxRange+1);  
        } while (used.contains(newRandom));  
        result[i] = newRandom;  
        used.add(newRandom);  
    }  
    return result;  
}  
    public static void main(String[] args) {
          for (int i : printRandomNumbers(5,10)) {  
        System.out.println(i);  
    } 
    }
}
