package Sort;

public class BubbleSort {

    public static void printfArray(int no, int[] a){
        System.out.printf("%d: ", no);
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%d ", a[i]);
        }
        System.out.println();
    }


    
    public static void bubblesort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++){
            boolean isSorted = true;
            int m = n - i - 1;
            for (int j = 0; j < m; j++){
                if (a[j] > a[j + 1]){
                    isSorted = false;
                    int tmp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = tmp;
                }
            }
            printfArray(i, a);
            if (isSorted == true){
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {4, 6, 2, 8, 7, 1, 10};
        bubblesort(a);
    }

}
