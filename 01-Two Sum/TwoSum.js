var twoSum = function(nums, target) {
    /*
    i-0 - 1st iteration
    i-1 - 2nd iteration
    */
    for(let i=0; i < nums.length; i++)
    {
        /*
        j=i+1 
        i-0, j-[1,2]
        i-1, j-[2]
        */
        for(let j=i+1; j < nums.length; j++)
        {
            /*
            i-0, j-1 => 3+2 = 5
            i-0, j-2 => 3+4 = 7
            i-1, j-2 => 2+4 = 6 => got target
            */
            if(nums[i] + nums[j] === target)
            {
                return [i, j]; //[1, 2]
            }
        }
    }
};

//Output
twoSum([3,2,4], 6); //[1, 2]
twoSum([2,7,11,15], 9); //[0, 1]
twoSum([3,3], 6); //[0, 1]
