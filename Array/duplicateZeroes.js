var duplicateZeros = function(nums) {
    //[1,0,2,3,0,4,5,0]
    
    let duplicateZeroes = [];
    let arrLength = nums.length;//length of the initial array
    
    for(num of nums)
    {
        if(num >= 0)
        {
            duplicateZeroes.push(num);
        }
        
        //if num is 0, then duplicate it.
        if(num === 0)
        {
            duplicateZeroes.push(num);
        }
    }
    
    //truncate to the initially given array length
    return duplicateZeroes.slice(0, arrLength);
};

duplicateZeros([1,0,2,3,0,4,5,0]); //[1,0,0,2,3,0,0,4]
duplicateZeros([1,2,3]); //[1,2,3]
