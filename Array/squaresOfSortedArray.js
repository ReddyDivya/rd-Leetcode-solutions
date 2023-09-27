//Squares of a Sorted Array

var sortedSquares = function(nums) {
    //[-4,-1,0,3,10]
    let sqr = [];
    let sortedArray = [];
    
    for(num of nums){
        sqr.push(Math.pow(num, 2));
    }
    
    sortedArray = sqr.sort(function(a,b) {
        return a-b;
    })
    
    return sortedArray;
};

sortedSquares([-4,-1,0,3,10]); //[0, 1, 9, 16, 100]
sortedSquares([-7,-3,2,3,11]); //[4,9,9,49,121]
