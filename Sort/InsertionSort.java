package Sort;

public class InsertionSort {

    public static void printfArray(int no, int[] a){
        System.out.printf("%d: ", no);
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%d ", a[i]);
        }
        System.out.println();
    }



    public static void insertionSort(int[] a){
        int n = a.length;
        for (int i = 1; i < n; i++){
            // chèn a[i] vào dãy 0 -> i - 1
            int ai = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > ai){
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = ai;
            printfArray(i, a);
        } 
    }

    public static void main(String[] args) {
        int[] a = {5, 3, 2, 1, 10, 9, 6, 7};
        insertionSort(a);
    }
}
