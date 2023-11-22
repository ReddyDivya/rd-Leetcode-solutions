/**
 * @param {number} n
 * @return {number}
 */
var fibonacci = function(n) {
    
    if(n <= 1)
        return n;

    //fibArray is initialized with first two numbers of the Fibonacci sequence ([0, 1])
    let fibArray = [0,1];

    for(let i=2; i<=n; i++)//i=2 because fibArray is lready initialized with 0, 1
    {
        //adding two preceding elements and place it next in the sequence
        fibArray[i] = fibArray[i-1] + fibArray[i-2];
    }
    
    return fibArray[n];
};

fibonacci(2);//1
fibonacci(3);//2
fibonacci(4);//3
fibonacci(6);//8
fibonacci(7);//13
