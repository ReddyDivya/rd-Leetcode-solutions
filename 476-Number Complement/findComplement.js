/**
 * @param {number} num
 * @return {number}
 */
var findComplement = function(num) {
    let complement = '';
    //1. convert to binary
    let binary = num.toString(2);

    //2. 1's complement
    for(let i=0; i<binary.length; i++)
    {
        complement += binary[i] === '1' ? '0' : '1';
    }

    //3. convert complemented binary to decimal
    let decimal = parseInt(complement, 2);

    return decimal;
};

console.log(findComplement(5));//2
console.log(findComplement(7));//0
console.log(findComplement(10));//5
