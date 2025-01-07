/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function(x) {
    let xcopy = x;
    let tmp = 0;
    if (x < 0) {
        return false;
    }
    while (x > 0) {
        tmp = (tmp * 10) + (x % 10);
        x = Math.floor(x/10);
    } 
    return xcopy === tmp;
};