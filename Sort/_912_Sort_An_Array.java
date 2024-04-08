package Sort;
import java.util.Arrays;

public class _912_Sort_An_Array {

    public int[] merge(int[] a1, int[] a2){
        int n = a1.length + a2.length;
    int[] result = new int[n];

    int i = 0; // cua result
    int i1 = 0; // con tro tro vao mang a1
    int i2 = 0; // con tro tro vao mang a2
    
    while (i < n){
        if (i1 < a1.length && i2 < a2.length) { // a1 & a2 != NULL
            if (a1[i1] < a2[i2]){ // a1 < a2
                result[i] = a1[i1];
                i++; i1++;
            } else { // a2 < a1
                result[i] = a2[i2];
                i++; i2++;
            }
        } else {    // a1 != NULL || a2 != NULL
            if (i1 < a1.length){    // a1 != NULL
                result[i] = a1[i1];
                i++; i1++;
            } else {    // a2 != NULL
                result[i] = a2[i2];
                i++; i2++;
            }
        }
    }

        return result;
    }

    public int[] mergeSort(int[] a, int L, int R){
    
    // DKDB truong hop dung
    if (L > R) return new int[0];
    if (L == R){
        int[] singleElement = {a[L]};
        return singleElement;
    }

    // Truong hop tong quat phia duoi

    // chia ra 
    int k = ( L + R ) / 2;
    int[] a1 = mergeSort(a, L, k);
    int[] a2 = mergeSort(a, k + 1, R);


    // Tron vao: a2 va a1 la cac mang da duoc sap xep
    int[] result = merge(a1, a2);
    return result;
    
    }

    public int[] sortArray(int[] nums){
        return mergeSort(nums, 0, nums.length - 1);
    }

    public static void main(String[] args) {
        _912_Sort_An_Array c = new _912_Sort_An_Array();
        int[] a = {1, 3, 5, 7, 9};
        int[] b = {2, 4, 6, 8, 10};

        System.out.println(Arrays.toString(c.merge(a, b)));
    }
}