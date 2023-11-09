/**
 * @param {number[]} numbers
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(numbers, target) {
    
    //Method: Two Pointer 
    let left=0, right=numbers.length-1;

    while( left < right)
    {
        if(numbers[left]+numbers[right] < target)
        {
            //Case1: less than target => left-pointer -> increment 
            left++;
        }
        else if(numbers[left]+numbers[right] > target)
        {
            //Case2: right than target => right-pointer -> decrement
            right--;
        }
        else
            return [left+1, right+1]; //match found, so return indices
    }
};

twoSum([2,7,11,15], 9);//[1,2]
twoSum([2,3,4], 6);//[1,3]
twoSum([-1,0], -1);//[1,2]
