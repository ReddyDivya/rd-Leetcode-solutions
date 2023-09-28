# Duplicate Zeroes

## Steps:
-------
- originalLength
- numOfZeroes => count no. of zeroes in the original array
- newLength = originalLength + numOfZeroes
- start iteration from back since we don't have to exceed the origianlLength

### cases: zero
	//duplications
	j < originalLength 
		nums[j] = 0;
		j--;
### cases: non-zero
	//get new positions
	j < originalLength
		nums[j] = nums[i];
---
### Given

- originalLength=8, 
- numOfZeroes=3,
- newLength=11,
- nums = [1, 0, 2, 3, 0, 4, 5, 0]
---
### cases: zero => i=7, j=10
	10 < 8 = wrong => [1, 0, 2, 3, 0, 4, 5, 0]
	j = 9
---
### cases: non-zero => i=6, j=8
	j < ol
	8 < 8 => wrong => [1, 0, 2, 3, 0, 4, 5, 0]
---
### cases: non-zero => i=5, j=7
	j < ol
	7 < 8 => nums[j] = nums[i] => nums[7] = nums[5]; [1, 0, 2, 3, 0, 4, 5, 4]
---
### cases: zero => i=4, j=6
	6 < 8 = correct => before [1, 0, 2, 3, 0, 4, 0, 4]
	nums[6] = 0; //[1, 0, 2, 3, 0, 4, 0, 4]
	j = 5                                  
---
### cases: non-zero => i=4, j=5
	j < ol
	5 < 8 => nums[j] = nums[i] => nums[5] = nums[4]; [1, 0, 2, 3, 0, 0, 0, 4]
---	
### cases: non-zero => i=3, j=4
	j < ol
	4 < 8 => nums[j] = nums[i] => nums[4] = nums[3]; [1, 0, 2, 3, 3, 0, 0, 4]
---	
### cases: non-zero => i=2, j=3
	j < ol
	3 < 8 => nums[j] = nums[i] => nums[3] = nums[2]; [1, 0, 2, 2, 3, 0, 0, 4]
---
### cases: zero => i=1, j=2
	2 < 8 = correct 
	nums[2] = 0; //nums[j] = nums[i] => nums[2] = nums[1]; [1, 0, 0, 2, 3, 0, 0, 4]
	j=1
---	
### cases: non-zero => i=1, j=1
	1 < 8 = //nums[j] = nums[i] => nums[1] = nums[1]; [1, 0, 0, 2, 3, 0, 0, 4] 
	
### output = [1, 0, 0, 2, 3, 0, 0, 4] 
