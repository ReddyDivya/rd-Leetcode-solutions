/**
 * @param {character[]} s
 * @return {void} Do not return anything, modify s in-place instead.
 */
var reverseString = function(s) {
    //Approach: 2 Pointer Method
    let left = 0, right = s.length-1; 
    let temp = 0;

    while(left < right)
    {
        temp = s[left]; //'h', 'e', 'l', 'l', 'o'
        s[left] = s[right]; //'o', 'l', 'l', 'e', 'h'
        s[right] = temp; //'h', 'e', 'l', 'l', 'o'

        left++;//move to next element
        right--;//move to previous element
    }
};

reverseString(["h","e","l","l","o"]);//["o","l","l","e","h"]
reverseString(["H","a","n","n","a","h"]);//["h","a","n","n","a","H"]
