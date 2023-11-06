 /**
 * @param {number[]} nums
 * @return {boolean}
 */
var containsDuplicate = function(arr) {
    let value = false;
    let nums = arr.sort(); //1. sorting array

    //2. finding duplicates in an array
    for(let i = 0; i < nums.length; i++)
    {
        if(nums[i] == nums[i+1])
            value = true
    }
    return value;
};

console.log(containsDuplicate([1,2,3,1]));//true
console.log(containsDuplicate([1,2,3,4]));//false
console.log(containsDuplicate([1,1,1,3,3,4,3,2,4,2]));//true
