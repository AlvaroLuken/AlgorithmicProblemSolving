public static int fibonacci(int n) {
        

        // 1, 1, 2, 3, 5, 8, 13
        // 1, 2, 3, 4, 5,
        if(n == 0 || n == 1 || n == 2) {
            return 1;
        }


        return fibonacci(n-2) + fibonacci(n-1);

        // Complete the function.
}