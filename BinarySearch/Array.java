package BinarySearch;

public class Array {
    public static int binarySearch(int[] a, int x){
        int n = a.length;
        int l = 0, r = n - 1;
        while ( l <= r ){
            int Mid = (l + r) / 2;
            if (a[Mid] == x){
                return Mid;
            } else if ( x > Mid ){
                l = Mid + 1;
            } else {
                r = Mid - 1;
            }
        }
        return -1;
    }
}
