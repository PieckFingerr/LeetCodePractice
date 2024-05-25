// import java.util.ArrayList;
// import java.util.List;

// class Solution 
// {
//     public List<Integer> _488_Disappeared_Num (int[] nums) {
//         List<Integer> results = new ArrayList<>();
//         boolean[] exist = new boolean[nums.length + 1];

//         for (int i = 0; i < nums.length; i++){
//             // 1 <= nums[i] <= n
//             exist[nums[i]] = true;
//         }
//     }

//     for (int i = 1; i <= nums.length; i++){
//         if (exist[i] == false){
//             results.add(i);
//         }
//     }
//     return results;
// }

