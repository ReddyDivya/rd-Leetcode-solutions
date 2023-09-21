/**
 * @param {number} num
 * @return {number}
 */
var numberOfSteps = function (num) {
  let steps = 0;

  while (num > 0) {
    steps++;

    //even num
    if (num % 2 === 0)
    {
      num /= 2;
    }
    else //odd num
    {
      num -= 1;
    }
  }
  return steps;
};

/*
122
61
60
30
15
14
7
6
3
2
1
0
*/

console.log(123);
