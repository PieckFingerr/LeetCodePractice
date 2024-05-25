

public class _27_Remove_Element {
    public static int removeElement(int[] nums, int val) {
        int n = nums.length;
        for (int i = 0; i < n; i++){
            if (nums[i] == val){
                for (int j = i; j <= (n - 2); j++){
                    nums[j] = nums[j + 1];
                }
                n--;
            } else {
                i++;
            }
        } 
        return 0;
    }

    public static void main(String[] args) {
        int[] a = {3, 2, 2, 3};
        int val = 3;
        removeElement(a, val);
        System.out.println("Done");
        
    }
}

