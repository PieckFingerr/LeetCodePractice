
// // Definition for singly-linked list.
// function ListNode(val, next) {
//     this.val = (val===undefined ? 0 : val)
//     this.next = (next===undefined ? null : next)
// }

// /**
//  * @param {ListNode} head
//  * @return {boolean}
//  */

// var isPalindrome = function(head) {
//     let tmp = new ListNode();
//     tmp = head;
//     let stack = [];
//     while(tmp) {
//         stack.push(tmp.val);
//         tmp = tmp.next;
//     }
//     let i = 0;
//     let j = stack.length - 1;
//     while (i < j) {
//         if (stack[i] != stack[j]) {
//             return false;
//         } else {
//             i++;
//             j--;        
//         }
//     }
//     return true;
// };






//Definition for singly-linked list.
function ListNode(val, next) {
    this.val = (val===undefined ? 0 : val)
    this.next = (next===undefined ? null : next)
}

/**
 * @param {ListNode} head
 * @return {boolean}
 */
var isPalindrome = function (head) {
    if (!head || !head.next) return true;
    let slow = head, fast = head;
    let prev = null;

    while (fast && fast.next) {
        fast = fast.next.next;
        let temp = slow.next;
        slow.next = prev;
        prev = slow;
        slow = temp;
    }
    if (fast) slow = slow.next;

    while (prev && slow) {
        if (prev.val !== slow.val) return false;
        prev = prev.next;
        slow = slow.next;
    }

    return true;
};

let head = new ListNode();
head.val = 1;
head.next = new ListNode();
head.next.val = 2;
head.next.next = new ListNode();
head.next.next.val = 2;
head.next.next.next = new ListNode();
head.next.next.next.val = 1;

if (isPalindrome(head)) {
    console.log("true");
} else {
    console.log("false");
}