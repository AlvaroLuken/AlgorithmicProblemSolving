
import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class Main {



	public static void main(String[] args) {


		Scanner scanner = new Scanner(System.in);
		int decimalToSplit = scanner.nextInt();
		scanner.close();
	//	System.out.println(Arrays.toString(split(decimalToSplit)));
		split(decimalToSplit);



	}



	public static void split(int x) {

		String binary = Integer.toBinaryString(x);

		int index1 = 1;
  
        StringBuilder reverse = new StringBuilder(); 

        reverse.append(binary); 
  
		StringBuilder a = new StringBuilder();
		StringBuilder b = new StringBuilder();
    boolean flag = false;


		for(int i = reverse.length()-1; i >= 0; i--) {
			if(index1 % 2 == 1 && binary.charAt(i) == '1') {
				a.append(binary.charAt(i));
        flag = true;
			} else {
        a.append("0");
      }
			if(index1 % 2 == 0 && binary.charAt(i) == '1') {
				b.append(binary.charAt(i));
        flag = true;
			} else {
        b.append("0");
      }
      if(flag) {
        index1++;
        flag = false;
      }

		}

    a = a.reverse();
    b = b.reverse();
 //   System.out.println(a + " + " + b);


		String try1 = a.toString();
		String try2 = b.toString();

		int n = Integer.parseInt(try1 ,2);
		int m = Integer.parseInt(try2 ,2);

		System.out.println(n + " " + m);



	}


}