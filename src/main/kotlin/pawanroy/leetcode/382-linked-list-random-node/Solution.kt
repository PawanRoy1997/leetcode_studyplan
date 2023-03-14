package pawanroy.leetcode.`382-linked-list-random-node`

import pawanroy.leetcode.ListNode

class Solution(head: ListNode?) {
    private var headPtr = head
    private var input = ArrayList<Int>()
    private var size = 0

    init {
        while (headPtr != null) {
            input.add(headPtr!!.`val`)
            headPtr = headPtr?.next
        }
        size = input.size
    }

    fun getRandom(): Int {
        return input[kotlin.random.Random.nextInt(size)]
    }

}