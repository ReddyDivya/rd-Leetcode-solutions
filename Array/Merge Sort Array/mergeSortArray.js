/**
 * @param {number[]} nums1
 * @param {number} m
 * @param {number[]} nums2
 * @param {number} n
 * @return {void} Do not return anything, modify nums1 in-place instead.
 */
function mergeSortArray(nums1, m, nums2, n) {
    let i = m - 1; // Index in nums1 for elements from nums1
    let j = n - 1; // Index in nums2
    let k = m + n - 1; // Index in nums1 for the merged result

    // While there are elements in both arrays
    while (i >= 0 && j >= 0) {
        // Compare elements from the end of both arrays and place the larger one in nums1
        if (nums1[i] > nums2[j]) {
            nums1[k] = nums1[i];
            i--;
        } else {
            nums1[k] = nums2[j];
            j--;
        }
        k--;
    }

    // If there are remaining elements in nums2, copy them to nums1
    while (j >= 0) {
        nums1[k] = nums2[j];
        j--;
        k--;
    }

    console.log(nums1)
};

console.log(merge([1,2,3,0,0,0], 3, [2,5,6], 3));//[1,2,2,3,5,6]
console.log(merge([1],1, [], 0));//[1]
console.log(merge([0], 0, [1], 1));//[1]
