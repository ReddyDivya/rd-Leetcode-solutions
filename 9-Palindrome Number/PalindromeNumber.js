/**
 * @param {number} x
 * @return {boolean}
 */

//1. With built-in methods
var isPalindrome = function(x) {
   
   //1. converting to string and slpit
   let newStr = x.toString().split(''); 
   
   //2. reverse the string, join and converting to a Number
   let reverseX = Number(newStr.reverse().join(""));
   
   if(x === reverseX)
      return true;
   else  return false;
};

//2. Without built-in methods
var isPalindrome = function(x) {
   //Negative numbers cannot be palindromes
   if(x < 0)
      return false; 

   let reversed = 0;
   let original = x;

   //1. number is more than 0
   while(x > 0)
   {
      //2. get last digit
      const lastDigit  = x % 10;//1, 2, 1

      //3. reverse the number
      reversed = reversed * 10 + lastDigit;//1, 1*10+2 = 12, 12*10+1 = 121
   
      //get original 
      x = Math.floor(x/10);//12, 1, 0-end
   }

   return reversed === original;
}

isPalindrome(121); // true
isPalindrome(-121); // false
isPalindrome(10); // false
