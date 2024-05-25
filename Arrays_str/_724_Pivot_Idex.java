

public class _724_Pivot_Idex {
    
    public static int pivotIndex(int[] a){
        int n = a.length;
        int L = 0, R = 0;
        for (int i : a){
            R += i;
        }
        for (int i = 0; i < n; i++){
            R -= a[i];
            if ( R == L ){
                return i;
            }
            L += a[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {2, 1, -1};
        System.out.println(pivotIndex(a));
    }
}
