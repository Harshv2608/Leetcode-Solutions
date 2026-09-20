/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var map = function(arr, fn) {
    const arr2=[];
    for(let i=0;i<arr.length;i++){
        arr2[i]=fn(arr[i],i);
    }
    return arr2;
};