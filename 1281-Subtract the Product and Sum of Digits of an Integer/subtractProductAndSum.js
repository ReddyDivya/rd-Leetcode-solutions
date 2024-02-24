/**
 * @param {number} n
 * @return {number}
 */
var subtractProductAndSum = function(n) {
    let prod = 1, sum = 0;  
    while(n > 0)
    {
        let lastDigit = n%10;//last digit
        prod *= lastDigit;
        sum += lastDigit;
        n = Math.floor(n/10);
    }

    return prod-sum;
};

console.log(subtractProductAndSum(234));//15
console.log(subtractProductAndSum(4421));//21
