package pawanroy.leetcode.`3479-Fruits-into-baskets`

import java.util.Arrays

class Solution {
    private val segTree = IntArray(400007)
    private lateinit var baskets: IntArray

    private fun build(p: Int, l: Int, r: Int) {
        if (l == r) {
            segTree[p] = baskets[l]
            return
        }
        val mid = (l + r) shr 1
        build(p shl 1, l, mid)
        build((p shl 1) or 1, mid + 1, r)
        segTree[p] = maxOf(segTree[p shl 1], segTree[(p shl 1) or 1])
    }

    private fun query(p: Int, l: Int, r: Int, ql: Int, qr: Int): Int {
        if (ql > r || qr < l) {
            return Int.Companion.MIN_VALUE
        }
        if (ql <= l && r <= qr) {
            return segTree[p]
        }
        val mid = (l + r) shr 1
        return maxOf(
            query(p shl 1, l, mid, ql, qr),
            query((p shl 1) or 1, mid + 1, r, ql, qr)
        )
    }

    private fun update(p: Int, l: Int, r: Int, pos: Int, `val`: Int) {
        if (l == r) {
            segTree[p] = `val`
            return
        }
        val mid = (l + r) shr 1
        if (pos <= mid) {
            update(p shl 1, l, mid, pos, `val`)
        } else {
            update((p shl 1) or 1, mid + 1, r, pos, `val`)
        }
        segTree[p] = maxOf(segTree[p shl 1], segTree[(p shl 1) or 1])
    }

    fun numOfUnplacedFruits(fruits: IntArray, baskets: IntArray): Int {
        this.baskets = baskets
        val m = baskets.size
        var count = 0
        if (m == 0) {
            return fruits.size
        }
        Arrays.fill(segTree, Int.Companion.MIN_VALUE)
        build(1, 0, m - 1)
        for (i in fruits.indices) {
            var l = 0
            var r = m - 1
            var res = -1
            while (l <= r) {
                val mid = (l + r) shr 1
                if (query(1, 0, m - 1, 0, mid) >= fruits[i]) {
                    res = mid
                    r = mid - 1
                } else {
                    l = mid + 1
                }
            }
            if (res != -1 && baskets[res] >= fruits[i]) {
                update(1, 0, m - 1, res, Int.Companion.MIN_VALUE)
            } else {
                count++
            }
        }
        return count
    }
}