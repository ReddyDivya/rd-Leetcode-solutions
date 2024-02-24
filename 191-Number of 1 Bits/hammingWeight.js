/**
 * @param {number} n - a positive integer
 * @return {number}
 */
var hammingWeight = function(n) 
{
     let count = 0;

    while(n > 0)
    {   
        //Perform a bitwise AND operation with 1; if the result is 1, output 1, otherwise output 0.
        count += n & 1;//Increment count if the least significant bit is 1

        n = n>>>1;//Right shift n by 1 bit
    }

    return count;
};

//Test cases
console.log(NumOf1Bits(0b00000000000000000000000000001011));//3
console.log(NumOf1Bits(0b00000000000000000000000010000000));//1
console.log(NumOf1Bits(0b11111111111111111111111111111101));//31
