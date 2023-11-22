/**
 * @return {Generator<number>}
 */
var fibGenerator = function*() {
    //generate Fibonacci numbers on-demand without precomputing the entire sequence

    let a = 0, b = 1;//assigning the first 2 values of the fibonacci sequence i.e., 0, 1

    while(true)
    {
        //yielding starts with 'a = 0'
        yield a;//pauses the generator and returns the current Fibonacci number (a).

        //generator is then resumed in the next iteration of the loop, calculating the next Fibonacci number.
        [a, b] = [b, a+b];
    }
};

//Commented because, this is how my above code works.
// const fibonacci = fibGenerator();
// for(let i=1; i<8 ; i++)
// {
//     fibonacci.next().value;//this iterates 8 times
// }
