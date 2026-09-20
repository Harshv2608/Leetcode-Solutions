/**
 * @param {Function} fn
 * @return {Function}
 */
function memoize(fn) {
    const mp=new Map();
    return function(...args) {
        let key=args.toString();
        if(mp.has(key)){
            return mp.get(key);
        }else{
            let res=fn(...args);
            mp.set(key,res);
            return res;
        }
    }
}


/** 
 * let callCount = 0;
 * const memoizedFn = memoize(function (a, b) {
 *	 callCount += 1;
 *   return a + b;
 * })
 * memoizedFn(2, 3) // 5
 * memoizedFn(2, 3) // 5
 * console.log(callCount) // 1 
 */