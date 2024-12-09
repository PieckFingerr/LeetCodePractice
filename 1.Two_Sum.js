/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    const pair = {};
    for (let i = 0; i < nums.length; i++) {
        let num = target - nums[i];
        if (target - num in pair) {
            return [i, pair[target - num]]
        }
        pair[num] = i;
    }
};

