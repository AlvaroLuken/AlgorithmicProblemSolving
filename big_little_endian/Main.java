import java.util.*;

class Main {
  public static void main(String[] args) {

  	Scanner scanner = new Scanner(System.in);
    
    int n = scanner.nextInt();

    scanner.close();

    int guess = Integer.reverseBytes(n); 

    // for(int i = 31; i >= 0; i--) {

    //   m = n >> i;

    //   if((m & 1) == 1) {
    //     str.append("1");
    //   } else {
    //     str.append("0");
    //   }

    // }

    System.out.print(n + " converts to " + guess);
  }

  
}