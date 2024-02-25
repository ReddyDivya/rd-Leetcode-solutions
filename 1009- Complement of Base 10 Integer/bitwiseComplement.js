/**
 * @param {number} n
 * @return {number}
 */
var bitwiseComplement = function(n) {
    let complement = '';

    //1. convert to binary
    let binary = n.toString(2);

    //2. 1's complement
    for(let i=0; i<binary.length; i++)
    {
        complement += binary[i] === '0' ? '1' : '0';
    }

    //3. convert back to decimal
    let decimal = parseInt(complement, 2);
    return decimal;
};
