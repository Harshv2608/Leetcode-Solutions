var TimeLimitedCache = function() {
    this.cache=new Map();
};

/** 
 * @param {number} key
 * @param {number} value
 * @param {number} duration time until expiration in ms
 * @return {boolean} if un-expired key already existed
 */
TimeLimitedCache.prototype.set = function(key, value, duration) {
    let now=Date.now();
    if(this.cache.has(key)){
        const [val,dur]=this.cache.get(key);
        if(now<dur){
            this.cache.set(key,[value,now+duration]);
            return true;
        }
    }
    this.cache.set(key,[value,now+duration]);
    return false;
};

/** 
 * @param {number} key
 * @return {number} value associated with key
 */
TimeLimitedCache.prototype.get = function(key) {
    let now=Date.now();
    if(this.cache.has(key)){
        const [value,dur] = this.cache.get(key);
        if(now<dur){
            return value;
        }
        else{
            this.cache.delete(key);
        }
    }
    return -1;
};

/** 
 * @return {number} count of non-expired keys
 */
TimeLimitedCache.prototype.count = function() {
    let count=0;
    let now=Date.now();
    for(const [key,[_,dur]] of this.cache){
        if(dur>now){
            count++;
        }else{
            this.cache.delete(key);
        }
    }
    return count;
};

/**
 * const timeLimitedCache = new TimeLimitedCache()
 * timeLimitedCache.set(1, 42, 1000); // false
 * timeLimitedCache.get(1) // 42
 * timeLimitedCache.count() // 1
 */