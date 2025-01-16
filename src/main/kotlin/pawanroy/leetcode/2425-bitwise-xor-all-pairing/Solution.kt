package pawanroy.leetcode.`2425-bitwise-xor-all-pairing`

class Solution {
    fun xorAllNums(nums1: IntArray, nums2: IntArray): Int {
        var res = 0
        val even1 = nums1.size % 2 == 0
        val even2 = nums2.size % 2 == 0
        return when {
            even1 && !even2 -> {
                nums1.forEach {
                    res = res xor it
                }
                res
            }

            even2 && !even1 -> {
                nums2.forEach {
                    res = res xor it
                }
                res
            }

            !even1 && !even2 -> {
                nums1.forEach { a ->
                    nums2.forEach { b ->
                        res = res xor a xor b
                    }
                }

                res
            }

            else -> {
                0
            }
        }
    }
}