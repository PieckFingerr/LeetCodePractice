package Recursion;

public class Fibonanci2 {
    // Vì lí do là đệ quy gây tốn tgian và bộ nhớ nên đây sẽ là cách tối ưu đệ quy thông qua bài toán Fibonanci
    // Đệ quy có nhớ
    static int[] F = new int[1000];
    public static int Fibo2(int n){
        if (F[n] != 0 ){
            return F[n];
        }
        System.out.println("Cần tính F["+n+"] ");
        if ( n <= 2) {
            return 1;
        }
        F[n] = Fibo2(n - 1) + Fibo2(n - 2);
        return F[n]; 
    }

    public static void main(String[] args) {
      System.out.println(Fibo2(10));
    }
}
