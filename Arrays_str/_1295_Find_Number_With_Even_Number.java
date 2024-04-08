package Arrays_str;

public class _1295_Find_Number_With_Even_Number {
    public static int findNumbers(int[] n) 
    {
        int cnt = 0;
        for (int a : n ){
            int Soluong = tinhSoChuSo(a);
            if (Soluong % 2 == 0){
                cnt++;
            }
        }
        return cnt;
    }

    private static int tinhSoChuSo(int a) {
        int cnt = 0;       
        while( a != 0 ){
            a /= 10;
            cnt++;
        }
        return cnt;                // 1 23 123123123132123123
    }

    public static void main(String[] args) {
        int[] n = {12, 345, 2, 6, 7896};
        System.out.println(findNumbers(n));
    }   
}
