# Remove Element

## Example 1:
- Input: nums = [3,2,2,3], val = 3
- Output: 2, nums = [2,2,_,_]
- Explanation: Your function should return k = 2, with the first two elements of nums being 2.
- It does not matter what you leave beyond the returned k (hence they are underscores).
---

## Example 2:
- Input: nums = [0,1,2,2,3,0,4,2], val = 2
- Output: 5, nums = [0,1,4,0,3,_,_,_]
- Explanation: Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
- Note that the five elements can be returned in any order.
- It does not matter what you leave beyond the returned k (hence they are underscores).
---

## Given
- return count of elements inside the array. But we have to sort the array as well
---
## Challenge => sort the array with new positions, return number of elements in the new array
---
### Given
nums= [3,2,2,3]
val = 3
k =0;
---
### Steps:

iterate 

### case - current element is not equal to val
  - Replace nums[k] with the non equal value element
  - num of non-equal values count	
	
	nums[k] = nums[i];
	k++;
  
return k;
---

### case 1 => i=0, nums[0]=3, val=3, k=0, nums= [3,2,2,3]
	currentElement == val => wrong
---
### case 2 => i=1, nums[1]=2, val=3, k=0, nums= [3,2,2,3]
	currentElement != val 
	2 != 3 = correct 
	nums[0] = nums[1];//nums= [2,2,2,3]
	k=1;
---
### case 2 => i=2, nums[2]=2, val=3, k=1, nums= [2,2,2,3]
	currentElement != val 
	2 != 3 = correct 
	nums[1] = nums[2];//nums= [2,2,2,3]
	k=2;
---
### case 2 => i=3, nums[3]=3, val=3, k=2, nums= [2,2,2,3]
	currentElement != val = wrong
	
---
### Output
	k = 2, nums = [2,2,2,3]
