package Recursion;

public class Fibonanci {
    public static int sumFibo(int n){
        if ( n <= 2) {
            return 1;
        }
        return sumFibo(n - 1) + sumFibo(n - 2); 
    }

    public static void main(String[] args) {
        System.out.println(sumFibo(7));
    }
}
