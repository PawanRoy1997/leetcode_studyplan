package pawanroy.leetcode.`2064-minimize-maximum-of-products-distributed-to-any-store`

import java.util.PriorityQueue

class Solution {
    data class QuantityStoreMap(var effectiveQuantity: Double, val quantity: Double, var stores: Int)

    fun minimizedMaximum(n: Int, quantities: IntArray): Int {
        val comparator = Comparator { t: QuantityStoreMap, t2: QuantityStoreMap -> t2.effectiveQuantity.compareTo(t.effectiveQuantity) }
        val priorityQueue: PriorityQueue<QuantityStoreMap> = PriorityQueue(comparator)
        quantities.forEach { priorityQueue.add(QuantityStoreMap(it.toDouble(), it.toDouble(), 1)) }
        repeat(n - quantities.size) {
            val p = priorityQueue.poll()
            priorityQueue.add(p.copy(stores = p.stores + 1, effectiveQuantity = p.quantity / (p.stores + 1)))
        }
        val i = priorityQueue.poll().effectiveQuantity
        return if (i > i.toInt()) i.toInt() + 1 else i.toInt()
    }
}