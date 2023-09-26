//Max Consecutive Ones
// Given a binary array nums, return the maximum number of consecutive 1's in the array.

var findMaxConsecutiveOnes = function(nums) {
    let maxConsecutiveOnes = 0;
    let count = 0;
    
    for(let i=0; i < nums.length; i++)
    {
        //one's
        if(nums[i] == 1)
        {
            count++;
        }
        else //zero's
        {
            count = 0;
        }
        
        if(count > maxConsecutiveOnes) 
              maxConsecutiveOnes = count;
    }
    
    return maxConsecutiveOnes;
};

console.log(findMaxConsecutiveOnes([1,0,1,1,1,0]));//3
console.log(findMaxConsecutiveOnes([1,1,1,1,0,1,1,1,0]));//4
console.log(findMaxConsecutiveOnes([1,0,1,1,0,1,1,1,1,1]));//5
