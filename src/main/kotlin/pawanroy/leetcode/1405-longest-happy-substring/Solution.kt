package pawanroy.leetcode.`1405-longest-happy-substring`

import java.util.PriorityQueue

class Solution {
    fun longestDiverseString(a: Int, b: Int, c: Int): String {
        val res = StringBuilder()

        val pr = PriorityQueue<Item> { x, y -> y.count - x.count }
        if (a > 0) pr.add(Item(a, 'a'))
        if (b > 0) pr.add(Item(b, 'b'))
        if (c > 0) pr.add(Item(c, 'c'))

        var last = ' '
        var secondLast = ' '

        while (pr.isNotEmpty()) {
            val p = pr.poll()
            if (secondLast == last && p.value.equals(last, true)) {
                if (pr.isEmpty()) break
                val p1 = pr.poll()
                res.append(p1.value)
                p1.count--
                last = p1.value
                if (p1.count > 0) pr.add(p1)
            }
            res.append(p.value)
            p.count--
            secondLast = last
            last = p.value
            if (p.count > 0) pr.add(p)
        }

        return res.toString()
    }

    data class Item(var count: Int, var value: Char)
}