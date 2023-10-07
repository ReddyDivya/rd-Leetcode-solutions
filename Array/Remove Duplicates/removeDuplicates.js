function removeDuplicates(nums) {
  if (nums.length === 0) return 0; // Empty array, nothing to remove.
  
  let uniqueCount = 1; // At least the first element is unique.
    
  for (let i = 1; i < nums.length; i++) {
    if (nums[i] !== nums[i - 1]) {
      nums[uniqueCount] = nums[i];
      uniqueCount++;
    }
  }
  
  nums.length = uniqueCount; // Truncate the array to remove duplicates.
  return uniqueCount; // Return the length of the new array without duplicates.
}

console.log(removeDuplicates([1, 1, 2, 2, 2, 3, 4, 4, 5])); //5
console.log(removeDuplicates([0, 1, 2, 1])); //4
