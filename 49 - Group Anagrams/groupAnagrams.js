/**
 * @param {string[]} strs
 * @return {string[][]}
 */
var groupAnagrams = function(strs) {
    //Approach - Hashmap
    const hashMap = {};

    //Helper function to sort characters in a word i.e., eat - aet[alphabetical order]
    let sortString = (str) => str.split("").sort().join("");
    
    //Iterate through each word of the array[strs]
    for(let word of strs)
    {
        //Sort the characters in the word i.e., eat - aet[alphabetical order]
        let sortedWord = sortString(word);

        // If the sortedWord is not a key in the hashmap, create an empty array for it.
        if(!hashMap[sortedWord])
            hashMap[sortedWord] = [];

        /*
        Add the word to the array corresponding to its sorted characters 
        i.e {aet: ['eat', 'tea', 'ate']}
        */
        hashMap[sortedWord].push(word);
        //hashMap => { aet: [ 'eat', 'tea', 'ate' ], ant: [ 'tan', 'nat' ], abt: [ 'bat' ] }
    }
    
    // Convert the values of the hashmap to an array to get the groups of anagrams
    const result = Object.values(hashMap);
    //result => [ [ 'eat', 'tea', 'ate' ], [ 'tan', 'nat' ], [ 'bat' ] ]


    return result;
};

console.log(groupAnagrams(["eat","tea","tan","ate","nat","bat"]));//[["bat"],["nat","tan"],["ate","eat","tea"]]
console.log(groupAnagrams([""]));//[[""]]
console.log(groupAnagrams(["a"]));//[["a"]]
