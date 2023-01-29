package pawanroy.leetcode

class ListNode(var `val`: Int) {
    var next: ListNode? = null

    override fun toString(): String {
        return if(next == null) return this.`val`.toString()
        else "$`val`${next.toString()}"
    }
}