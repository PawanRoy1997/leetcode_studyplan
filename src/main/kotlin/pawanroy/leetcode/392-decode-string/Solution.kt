package pawanroy.leetcode.`392-decode-string`

class Solution {
    fun alphaDigtSearch(finish: Int, sourse: String, stack: ArrayList<String>, isAlpha: Boolean): Int {
        var finish = finish
        val start = finish
        if (isAlpha) while (finish < sourse.length && sourse[finish].isLetter()) finish++ else while (finish < sourse.length && sourse[finish].isDigit()

        ) finish++
        if (start != finish) stack.add(sourse.substring(start, finish))
        if (finish < sourse.length && sourse[finish] == '[') finish++
        return finish
    }

    fun stackWork(stack: ArrayList<String>) {
        val repeat: Int
        var answ = StringBuilder()
        if (stack.isNotEmpty()) {
            answ = StringBuilder(stack[stack.size - 1])
            stack.removeAt(stack.size - 1)
        }
        while (stack.isNotEmpty() && !stack[stack.size - 1][0].isDigit()) {
            answ.insert(0, stack[stack.size - 1])
            stack.removeAt(stack.size - 1)
        }
        if (stack.isNotEmpty() && stack[stack.size - 1][0].isDigit()) {
            repeat = stack[stack.size - 1].toInt()
            stack.removeAt(stack.size - 1)
            answ = repeat(answ, repeat)
        }
        while (stack.isNotEmpty() && stack[stack.size - 1][0].isLetter()) {
            answ.insert(0, stack[stack.size - 1])
            stack.removeAt(stack.size - 1)
        }
        stack.add(answ.toString())
    }

    private fun repeat(answ: StringBuilder, i: Int): StringBuilder {
        val tmp = StringBuilder()
        repeat(i){
            tmp.append(answ)
        }
        return tmp
    }

    fun decodeString(s: String): String {
        val stack = ArrayList<String>()
        var finish = 0
        finish = alphaDigtSearch(finish, s, stack, true)
        while (finish < s.length) {
            finish = alphaDigtSearch(finish, s, stack, false)
            finish = alphaDigtSearch(finish, s, stack, true)
            if (finish < s.length && s[finish] == ']') {
                stackWork(stack)
                finish++
            }
        }
        if (stack.size > 1) stackWork(stack)
        return stack[0]
    }
}