package Arrays_str;

/**
 * _485_Max_Consecutive_Ones
 */
public class _485_Max_Consecutive_Ones {

    public static int Solution(int[] a){
        int n = a.length;
        int max = 0;
        int cnt = 0;
        for (int i = 0; i < n; i++){
            if (a[i] == 1){
                cnt++;
                max = max < cnt ? cnt : max;
            } else {
                cnt = 0;
            }
        }
        return max;
    }    

    public static void main(String[] args) {
        int[] a = {0, 1, 1, 1, 0, 0, 1, 1, 1, 1};
        System.out.println(Solution(a));
    }

}