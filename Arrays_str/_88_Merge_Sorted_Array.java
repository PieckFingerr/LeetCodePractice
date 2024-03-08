package Arrays_str;

public class _88_Merge_Sorted_Array {
    public static void merge(int[] n1, int m, int[] n2, int n){
        int i = m - 1;
        int j = n - 1;
        int k = ( m + n ) - 1;
        while(j >= 0 ){
            if ( i >= 0 && n1[i] > n2[j]){
                n1[k--] = n2[j--];
            } else {
                n1[k--] = n1[i--];
            }
        } 
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 0, 0, 0};
        int[] b = {2, 5, 6};
        int m = 3, n = 3;
        merge(a, m, b, n);
            System.out.print("Gà");
    }   
}
