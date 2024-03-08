package Recursion;

public class Giaithua {
    public static int giaiThua(int n){
        if ( n == 0 ){
            return 1;
        }
        int t = n * giaiThua(n - 1);
        return t;
    }

    public static void main(String[] args) {
        int n = giaiThua(5);
        System.out.println("5! = " + n);
    }
}
