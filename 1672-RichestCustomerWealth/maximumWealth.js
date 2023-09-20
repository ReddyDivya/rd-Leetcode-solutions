var maximumWealth = function(accounts) {
    let maxWealth = 0;

    for(let i=0; i < accounts.length; i++)
    {
        //case 1 >> i = 0, currWealth = 0;
        //case 2 >> i = 1, currWealth = 0;
        //case 3 >> i = 2, currWealth = 0;
        let currWealth = 0;

        for(let j=0; j < accounts.length; j++)
        {
            /*
            case 1 >> i = 0, currWealth = 0;
            [0, 0] >> 0+1 = 1,
            [0, 1] >> 1+5 = 6

            case 1 >> i = 1, currWealth = 0;
            [1, 0] >> 0+7 = 7,
            [1, 1] >> 7+3 = 10

            case 2 >> i = 2, currWealth = 0;
            [2, 0] >> 0+3 = 3,
            [2, 1] >> 3+5 = 8
            */
            currWealth += accounts[i][j];
            console.log('currWealth >> ', currWealth);
        }

        /*
        after coming out from inner loop >>
            case 1 >> i = 0, currWealth = 6, maxWealth = 6
            case 2 >> i = 1, currWealth = 10, maxWealth = 10
            case 3 >> i = 2, currWealth = 8, maxWealth = 10
        */
        console.log('max >> ', maxWealth);
        
        maxWealth = Math.max(maxWealth, currWealth);//6, 10, 10
        
    }

    return maxWealth;
};

maximumWealth([[1,5],[7,3],[3,5]])
