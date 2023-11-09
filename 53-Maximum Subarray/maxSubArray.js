/**
 * @param {number[]} nums
 * @return {number}
 */
var maxSubArray = function(nums) {
    let sum = 0;
    let max = nums[0];

    //array length is 0, return 0
    if(nums.length === 0)
        return 0;

    for(let i=0; i<nums.length; i++)
    {
        //calculating the sum
        sum += nums[i]; 

        //compare max and sum, update the max if sum is greater than max
        max = Math.max(max, sum);

        if(sum < 0)
            sum = 0;
    }

    return max;
};

maxSubArray([-2,1,-3,4,-1,2,1,-5,4]);//6
maxSubArray([1]);//1
maxSubArray([5,4,-1,7,8]);//23
