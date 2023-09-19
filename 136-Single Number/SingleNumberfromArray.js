/**
 * @param {number[]} nums
 * @return {number}
 */
var singleNumber = function(nums) {
    
    let result = 0;

    for(let num of nums)
    {
        /*
            XOR truth table
            0 0 = 0
            0 1 = 1
            1 0 = 1
            1 1 = 0
        
        Example 1: [2,2,1]
        result-0 ^ num-2 => 00 ^ 10 = 10, 
        result-2 ^ num-2 => 10 ^ 10 = 00, 
        result-0 ^ num-1 => 00 ^ 01 = 01
        end - result-1

        Example 2: [4,1,2,1,2]
        result-0 ^ num-4 => 0000 ^ 0100 = 0100,
        result-4 ^ num-1 => 0100 ^ 0001 = 0101,
        result-5 ^ num-2 => 0101 ^ 0010 = 0111,
        result-7 ^ num-1 => 0111 ^ 0001 = 0110,
        result-6 ^ num-2 => 0110 ^ 0010 = 0100,
        end - result-4
        */
        result ^= num; 
    }

    return result;
};
