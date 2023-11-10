/**
 * @param {number[]} prices
 * @return {number}
 */
function maxProfit(prices) {
  let left=0, right=1, profit=0, maxProfit=0;

  while(left < prices.length)
  {
      if(prices[left] < prices[right])
      {
          //calculating profit
          profit = prices[right] - prices[left];
          maxProfit = Math.max(maxProfit, profit);
      }
      else
      {
         /*If the price at the left day is not less than the price at the right day, 
         it means the current left day is not a good buying day. In this case, the left pointer is       moved to the right pointer.
         */
         left = right;//the left pointer is moved to the right pointer
      }
      right++;  //The right pointer is always incremented to move to the next day.
  }

  return maxProfit;
}

maxProfit([7,1,5,3,6,4]);//5
maxProfit([7,6,4,3,1]);//0
