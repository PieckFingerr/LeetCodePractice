public class _283_Move_Zero {
    public void moveZeroes(int[] nums) {
        int l = 0, r = l + 1;
        while (r <= nums.length) {
            if (nums[r] != 0){
                int tmp = nums[r];
                nums[r] = nums[l];
                nums[l] = tmp;
            }
            l++;
        }
    }
}
