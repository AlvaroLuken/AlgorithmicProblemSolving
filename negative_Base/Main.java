import java.util.*;

public class Main {


	public static void main(String[] args) {



		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();

		scanner.close();

		baseNegative2(num);



	}


	public static void baseNegative2(int num) {
    boolean flag = false;
    if(num == 0) {
      flag = true;
    }

		StringBuilder bin = new StringBuilder();
		while(num != 0) {
      int mod = num % -2;
      if(mod < 0) {
        bin.append("1");
      } else {
        bin.append(mod);
      }
      num = (int)Math.ceil(num / -2.0);

    }


    bin.reverse();
    if(flag) {
      System.out.print("0");
    } else {
      System.out.print(bin);
    }
}
}