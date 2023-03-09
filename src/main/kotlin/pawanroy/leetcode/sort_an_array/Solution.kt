package pawanroy.leetcode.sort_an_array

class Solution {
    fun sortArray(nums: IntArray): IntArray {
        mergeSort(nums, 0, nums.size - 1)
        return nums
    }

    fun mergeFun(arr: IntArray, l: Int, m: Int, r: Int) {
        val n1 = m + 1 - l
        val n2 = r - m
        val left = IntArray(n1)
        for (i in 0 until n1) {
            left[i] = arr[l + i]
        }
        val right = IntArray(n2)
        for (i in 0 until n2) {
            right[i] = arr[m + 1 + i]
        }
        var i = 0
        var j = 0
        var k = l
        while (i < n1 || j < n2) {
            if (j == n2 || i < n1 && left[i] < right[j]) arr[k++] = left[i++] else arr[k++] = right[j++]
        }
    }

    fun mergeSort(arr: IntArray, low: Int, high: Int) {
        if (low < high) {
            val middle = (high - low) / 2 + low
            mergeSort(arr, low, middle)
            mergeSort(arr, middle + 1, high)
            mergeFun(arr, low, middle, high)
        }
    }
}
