var findNumbers = function(nums) {

    //base cases
    if (nums.length === 0) return 0;
    
    let EvenNumOfDigits = 0;
    
    for(let num of nums)
    {
        let numOfDigits = 0;
        
        //55, 201, 82, 1770
        while(Math.floor(num) > 0)
        {
            numOfDigits++;//2 | 3 | 2 | 4
            num = num/10;//5,0 |20,2,0| 8,0 |177, 17,1, 0
        }
        
        if(numOfDigits % 2 === 0) EvenNumOfDigits++;//1 | remains 1 | 2 | 3
    }
    
    return EvenNumOfDigits;
};

console.log(findNumbers([55,201,82,1770]));//3
console.log(findNumbers([555,901,482,1771]));//1
