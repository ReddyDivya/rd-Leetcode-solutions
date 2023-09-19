/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function(x) {
   
   //1. converting to string and slpit
   let newStr = x.toString().split(''); 
   
   //2. reverse the string, join and converting to a Number
   let reverseX = Number(newStr.reverse().join(""));
   
   if(x === reverseX)
      return true;
   else  return false;
};

isPalindrome(121); // true
isPalindrome(-121); // false
isPalindrome(10); // false
