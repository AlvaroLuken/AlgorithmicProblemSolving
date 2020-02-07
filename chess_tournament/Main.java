import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();
    int m = scanner.nextInt();

    boolean flag = false;

  //  System.out.println("N : " + n + "M : " + m);

    if(n == 0 || m == 0) {
    	System.out.print("0");
    	System.exit(0);
    }

    int[] ar = new int[m];

    int x = 0;
    while(x < m) {
      ar[x] = scanner.nextInt();
      x++;
    }
    
    int[] arr = new int[(int)Math.pow(2, n)];
    int counter = 0;
    for(int i = 0; i < arr.length; i++) {
      if(counter >= ar.length) {
        counter = 0;
      }
      if(i == ar[counter]-1) {
        arr[i] = 0;
        counter++;
      } else {
        arr[i] = 1;
      }
      
    }
    int res = 0;
    

    res = chess(n, m, arr);
    
    
    System.out.print(res);

	}

  public static int chess(int n, int m, int[] arr) {

    

    int walk = 0;
    
    int[] newArray = new int[arr.length/2];
    int length = arr.length;
  //  length = newArray.length;
    


    int index = 0;

    while(length > 1) {

      

      

      for(int i = 0; i < arr.length; i+=2) {
        if(arr.length == 2) {

          if((arr[0] == 1 && arr[1] == 0) || (arr[i] == 0 && arr[i+1] == 1)) {
            walk++;
          }
          return walk;
        }

      if(arr[i] == 1 && arr[i+1] == 1) {
        newArray[index] = 1;
        index++;
      }
      if(arr[i] == 0 && arr[i+1] == 0) {
        newArray[index] = 0;
        index++;
      }
      if((arr[i] == 1 && arr[i+1] == 0) || (arr[i] == 0 && arr[i+1] == 1)) {
        walk++;
        newArray[index] = 1;
        index++;
      }
    }
    arr = newArray;
    length = newArray.length;
    int[] nArray = new int[newArray.length/2];
    newArray = nArray;
    index =0;


    }

    return walk;
    
    

  
  
  }
}