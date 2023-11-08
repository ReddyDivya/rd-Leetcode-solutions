/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isAnagram = function(s, t) {
    /*
        1. convert string to array and then, sort arrays
        2. check for same length 
        3. check every element of arrays and return boolean
    */

    //1. convert string to array and then, sort arrays
    s = s.split("").sort();
    t = t.split("").sort();

    //2. check for same length 
    if(s.length != t.length)
        return false;

    //3. check every element of arrays and return boolean
    for(let i = 0; i < s.length; i++){
        //if both the arrays are not same, return false
        if(s[i] !== t[i])
            return false;
    }

    return true;
};

isAnagram('anagram', 'nagaram');//true
isAnagram('rat', 'car');//false
