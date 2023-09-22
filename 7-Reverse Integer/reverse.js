var reverse = function(x) {
    let lastDigit = 0;
    let reverse = 0;
    let isNegNum = false;

    if(x < 0)
    {
        isNegNum = true;
        x = Math.abs(x);//Math.abs - to remove negative sign
    }

    while(x > 0)
    {
        lastDigit = x % 10;//3, 2, 1

        /*
        0*10+3 = 3,
        3*10+2 = 32,
        32*10+1 = 321
        */
        reverse = reverse*10 + lastDigit;
        x = Math.floor(x/10);//12, 1, 0
    }

    return (isNegNum ? "-"+reverse : reverse);
};

console.log(reverse(123));//321
console.log(reverse(-123));//-321
