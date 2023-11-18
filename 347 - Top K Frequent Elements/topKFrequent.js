/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number[]}
 */
var topKFrequent = function(nums, k) {
    //Approach - Bucket sort Algorithm Using HashMap
    const hashMap = new Map();//1. Create a hashmap to store the frequency of each element

    //2. Populate the hashmap with the frequency of each element
    for(const num of nums)
    {
      hashMap.set(num, (hashMap.get(num) || 0) + 1);//{1 => 3, 2 => 2}
    }

    //3. Create an array of unique elements from the input array
    const uniqueElements = [...hashMap.keys()];//[1, 2, 3]

    //4. Sort the unique elements based on their frequency in descending order
    uniqueElements.sort((a,b) => hashMap.get(b) - hashMap.get(a));//[1, 2, 3]

    //5. Get the top K frequent elements
    const topKFrequentElements = uniqueElements.slice(0, k);//[1, 2]

    return topKFrequentElements;
};

topKFrequent([1,1,1,2,2,3], 2);//[1, 2]
topKFrequent([1], 1);//[1]
