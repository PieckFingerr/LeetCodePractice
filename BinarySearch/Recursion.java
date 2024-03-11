package BinarySearch;

public class Recursion {
    
    public static int binarySearch(int[] a, int key, int iLeft, int iRight){
        if (iLeft > iRight){
            return -1;
        }
        System.out.println("[" + iLeft + ", " + iRight + "]");
        int m = (iLeft + iRight) / 2;
        if (a[m] == key){
            return m;
        } else if (a[m] < key){
            return binarySearch(a, key, m + 1, iRight);
        } else {
            return binarySearch(a, key, iLeft, m - 1);
        }
    }

    public static int binarySearch(int[] a, int key){
        int n = a.length;
        return binarySearch(a, key, 0, n - 1);
    }   

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        binarySearch(a, 6);
    }
}
