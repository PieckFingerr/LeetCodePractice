package Sort;

class SelectionSort {

    public static void printfArray(int no, int[] a){
        System.out.printf("%d: ", no);
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%d ", a[i]);
        }
        System.out.println();
    }
    
    public static void selectionSort(int[] a){
        int n = a.length;
        for (int i = 0; i < n; i++){
            int minIndex = i;
            for (int j = i + 1; j < n; j++){
                if (a[j] < a[minIndex]){
                    minIndex = j;
                }
            }
            if (minIndex != i){
                int tmp = a[i];
                a[i] = a[minIndex];
                a[minIndex] = tmp;
            }
            printfArray(i, a);
        }
    }

    public static void main(String[] args) {
        int[] a = {3, 1, 7, 2, 4, 5, 9, 6, 8};
        selectionSort(a);
    }
    
}