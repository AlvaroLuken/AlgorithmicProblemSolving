
import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;


public class Main {


  public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);
    

    int base1 = scanner.nextInt();
    int base2 = scanner.nextInt();

    String originalValue = scanner.next();

    


    // System.out.println(Integer.toString(Integer.parseInt(og, base1), base2));

    String res = changeBase(base1, base2, originalValue);

    System.out.print(res);





  }

  public static String changeBase(int base1, int base2, String originalValue) {



    String errorMessage = originalValue + " is an illegal base " + base1 + " number";

    if(base1 > 16) {
      return errorMessage;
    } 
    
    HashMap<Character, Integer> map = new HashMap<Character, Integer>();

    

    map.put('A', 10);
    map.put('B', 11);
    map.put('C', 12);
    map.put('D', 13);
    map.put('E', 14);
    map.put('F', 15);

    String str = " ";
    int counter = 0;

    long num = 0;

    boolean flag = false;
    for(int i = 0; i < originalValue.length(); i++) {
      if(map.containsKey(originalValue.charAt(i))) {
        flag = true;
      }
    }

    
    if(flag) {
      for(int i = originalValue.length()-1; i >= 0; i--) {
        
      if(map.containsKey(originalValue.charAt(i))) {
        flag = true; //there is a char in String
          num += map.get(originalValue.charAt(i)) * (Math.pow(base1, counter));
          counter++;
      } else if(!map.containsKey(originalValue.charAt(i))) {
        if(Character.isDigit(originalValue.charAt(i))) {
          int a = originalValue.charAt(i) - '0';
          num += a * Math.pow(base1, counter);
          counter++;
        } else {
          return errorMessage;
        }
            }
      }
    }

    if(!flag) {
      for(int i = 0; i < originalValue.length(); i++) {
      int z = originalValue.charAt(i) - '0';
      if(z >= base1) {
        return errorMessage;
      }
    }
    }
    

    String na = Long.toString(num);

    
    
    

  

    String result = Long.toString(Long.parseLong(originalValue, base1), base2);

    if(flag) {
      result = Long.toString(Long.parseLong(na, base1), base2);
      result = result.toUpperCase();
    }
    
    return originalValue + " base " + base1 + " = " + result.toUpperCase() + " base " + base2;
    

  }



}