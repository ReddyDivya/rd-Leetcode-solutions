 /**
 * @param {number[]} nums
 * @return {boolean}
 */
/**
 * @param {number[]} nums
 * @return {boolean}
 */
var containsDuplicate = function(arr) {
    /*
    Approach - Set
    Time Complexity - O(n)
    Space Complexity - O(n)
    */
    const hashset = new Set();//Create an empty Set

    //Iterate through the array
    for(let i=0; i<arr.length; i++)
    {
        // Check if the current element is already in the Set
        if(hashset.has(arr[i]))
            return true; // If it's a duplicate, return true

        // If it's not a duplicate, add it to the Set
        hashset.add(arr[i]);
        console.log(hashset);
    }
    return false;  // If the loop completes without finding duplicates, return false
};

console.log(containsDuplicate([1,2,3,1]));//true
console.log(containsDuplicate([1,2,3,4]));//false
console.log(containsDuplicate([1,1,1,3,3,4,3,2,4,2]));//true
