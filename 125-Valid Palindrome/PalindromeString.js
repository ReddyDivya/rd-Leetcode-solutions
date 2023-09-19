/**
 * @param {string} s
 * @return {boolean}
 */
var isPalindrome = function(s) {
    //1. lowercase and trims the spaces
    let str = s.toLowerCase().trim();

    /*
    2. removes all non-alphanumeric characters using a regular expression.
    The [^a-z0-9] pattern matches anything that is not a lowercase letter or a  digit (0-9)
    */
    let modifiedStr = str.replace(/[^a-z0-9]/g, '');

    //3. reverse the string
    let reversedStr = modifiedStr.split('').reverse().join('');

    // Compare the modified phrase(modifiedStr) with its reversedStr
    return modifiedStr === reversedStr;
};

console.log(isPalindrome("A man, a plan, a canal, Panama")); // Output: true
console.log(isPalindrome("race car")); // Output: true
console.log(isPalindrome("Hello, World!")); // Output: false
