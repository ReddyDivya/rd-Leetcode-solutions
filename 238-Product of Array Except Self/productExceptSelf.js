/**
 * @param {number[]} nums
 * @return {number[]}
 */
function productExceptSelf(nums) {
    const n = nums.length;
    const finalResultArr = new Array(n);
    
    // Calculate the prefix products.
    let prefixProduct = 1;
    for (let i = 0; i < nums.length; i++) {
        finalResultArr[i] = prefixProduct;
        prefixProduct *= nums[i];
    }
    
    // Calculate the suffix products and update the finalResultArr array.
    let suffixProduct = 1;
    for (let i = n - 1; i >= 0; i--) {
        finalResultArr[i] *= suffixProduct;
        suffixProduct *= nums[i];
    }
    
    return finalResultArr;
}

console.log(productExceptSelf([1,2,3,4]));//[24,12,8,6]
console.log(productExceptSelf([-1,1,0,-3,3]));//[0,0,9,0,0]

