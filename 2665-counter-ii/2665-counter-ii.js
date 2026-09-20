/**
 * @param {integer} init
 * @return { increment: Function, decrement: Function, reset: Function }
 */
var createCounter = function(init) {
    let i=init;
    function increment(){
        return ++i;
    }
    function decrement(){
        return --i;
    }
    function reset(){
        return i=init;
    }
    return{increment,decrement,reset};
};

/**
 * const counter = createCounter(5)
 * counter.increment(); // 6
 * counter.reset(); // 5
 * counter.decrement(); // 4
 */