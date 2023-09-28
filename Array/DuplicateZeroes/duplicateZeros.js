/**
 * @param {number[]} nums
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var duplicateZeros = function(nums) {
    const originalLength = nums.length;
    let zeroCount = 0;

    //Count the number of zeros in the original array
    for (let i = 0; i < originalLength; i++) {
        if (nums[i] === 0) {
            zeroCount++;
        }
    }

    // Calculate the new length of the modified array
    const newLength = originalLength + zeroCount;//11

    // Start from the end of the original array and modify in-place
    for (let i = originalLength - 1, j = newLength - 1; i >= 0; i--, j--)
    {
        
        if (nums[i] === 0)
        {
            //we don't want to exceed the original length
            if (j < originalLength) {
                // Place a duplicate zero
                nums[j] = 0;
            }
            j--; // Move to the next position
        }
        
        // Move non-zero elements to their new positions
        if (j < originalLength) {
            nums[j] = nums[i];
        }
    }
};

console.log(duplicateZeros([1, 0, 2, 3, 0, 4, 5, 0])) //[1, 0, 0, 2, 3, 0, 0, 4]
