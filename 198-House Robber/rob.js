/**
 * @param {number[]} nums
 * @return {number}
 */
var rob = function(nums) {
    //Method: Dymanic Programming

    //new array with same length
    let dp = new Array(nums.length);

    //assinging first 2 indices values in the new array
    dp[0] = nums[0];
    dp[1] = Math.max(nums[0], nums[1]);//assign maximum value to dp[1]

    //now, dynamic programming approach starts
    for(let i=2; i<nums.length; i++)
    {
        /*
        adding alternate elements then, comparing with previous element of dp and pushing the max value to dp array
        i=2=> dp[2] = dp[1], dp[0]+nums[2]
        i=3=> dp[3] = dp[2], dp[1]+nums[3]
        i=4=> dp[4] = dp[3], dp[2]+nums[4]
        */
        dp[i] = Math.max(dp[i-1], dp[i-2] + nums[i]);
    }

    //the final element in the dp array is the maximum value.
    return dp[nums.length-1];
};

rob([1,2,3,1]);//4
rob([2,7,9,3,1]);//12
