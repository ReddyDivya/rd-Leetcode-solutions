/**
 * @param {number[]} prices
 * @return {number}
 */
function maxProfit(prices) {
  let maxProfit = 0;
  let minPrice = Number.MAX_VALUE; //1.7976931348623157e+308

  for (let i = 0; i < prices.length; i++) {
    //1. finding min price
    if (prices[i] < minPrice) {
      minPrice = prices[i];
    } 
    else if (prices[i] - minPrice > maxProfit) //2. finding max profit
    {
      maxProfit = prices[i] - minPrice;
    }
  }

  return maxProfit;
}

console.log(maxProfit[7,1,5,3,6,4]);//5
