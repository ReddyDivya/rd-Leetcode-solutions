/**
 * @param {number[]} nums
 * @return {number[]}
 */
var runningSum = function(nums) {
    let result = 0;
    let newArray = [];

    for(let i=0; i <nums.length; i++)
    {
        result = result + nums[i]; 
        newArray.push(result);
    }

    return newArray;
};

console.log(runningSum([1,2,3,4])); // [1,3,6,10]
