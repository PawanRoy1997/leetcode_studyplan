package pawanroy.leetcode.`706-design-hash-map`

class MyHashMap {

    private val keys = ArrayList<Int>()
    private val values = ArrayList<Int>()
    fun put(key: Int, value: Int) {
        if (keys.contains(key)) {
            val index = keys.indexOf(key)
            values[index] = value
        } else {
            keys.add(key)
            values.add(value)
        }
    }

    fun get(key: Int): Int {
        val index = keys.indexOf(key)
        return if (index == -1) -1 else values[index]
    }

    fun remove(key: Int) {
        if(keys.contains(key)) {
            val index = keys.indexOf(key)
            keys.removeAt(index)
            values.removeAt(index)
        }
    }

}