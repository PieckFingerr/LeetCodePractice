package Sort;

class _88_Merge_Sorted_Array {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
    }

    public static void main(String[] args) {
        int m = 3, n = 3;
        int[] n1 = {1, 2, 3};
        int[] n2 = {2, 4, 5};
        merge(n1, m, n2, n);
        System.out.println(n1.toString());
    }


}