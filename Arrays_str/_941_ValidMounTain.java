package Arrays_str;

public class _941_ValidMounTain {
    public boolean validMountainArray(int[] arr) {
        int n = arr.length;
        if ( n < 3 ) return false;
        int l = 0;
        int r = n - 1;
        while (l + 1 < n - 1 && arr[l] < arr[l + 1]) l++;
        while ( r - 1 > 0 && arr[r] < arr[ r - 1]) r--;
        return l == r;
    }

    public void main(String[] args) {
        int[] a = {1, 3, 5, 4, 7, 6, 4, 3, 0};
        if (validMountainArray(a) == true){
            System.out.println("true"); 
        } else {
            System.out.println("False");
        }
    }
}
