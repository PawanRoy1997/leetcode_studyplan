package pawanroy.leetcode.`846-hand-of-straights`

class Solution {
    fun isNStraightHand(hand: IntArray, groupSize: Int): Boolean {
        if(hand.size % groupSize != 0) return false
        var result = true
        var count = hand.size
        val canUse = BooleanArray(count){true}

        hand.sort()

        while(count > 0){
            var remaining = groupSize
            var current = -1
            var i = 0
            while(i in hand.indices && remaining > 0){
                if(current == -1 && canUse[i]){
                    canUse[i] = false
                    current = hand[i]
                    remaining--
                    count --
                }

                if(current == hand[i]-1 && canUse[i]){
                    canUse[i] = false
                    current = hand[i]
                    remaining--
                    count --
                }
                i++
            }
            if(remaining != 0){
                result = false
                break
            }
        }

        return result
    }
}