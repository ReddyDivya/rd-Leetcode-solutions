/**
 * @param {number[]} nums
 * @param {number} val
 * @return {number}
 */

//Focus: return count of elements inside the array. But we have to sort the array as well
var removeElement = function(nums, val) {
    let numOfElements = 0;
    
     // Iterate through the array
    for(let i=0; i<nums.length; i++)
    {
         // If the current element is not equal to val
        if(nums[i] !== val)
        {
            // Replace nums[k] with the non-val element
            nums[numOfElements] = nums[i];
            console.log(numOfElements, nums[numOfElements])
            numOfElements++;
        }    
    }

    return numOfElements; //Return the count of non-val elements
};

removeElement([3,2,2,3], 3);//2, [2,3]
removeElement([0,1,2,2,3,0,4,2], 2);//5 [0,1,3,0,4]
