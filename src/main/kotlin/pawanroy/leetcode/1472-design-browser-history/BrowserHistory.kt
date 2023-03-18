package pawanroy.leetcode.`1472-design-browser-history`

class BrowserHistory(homepage: String) {
    private val history = arrayListOf(homepage)
    private var index = 0

    fun visit(url: String) {
        if(index == history.lastIndex) {
            history.add(url)
            index++
        }else{
            history[++index] = url
            while(history.lastIndex != index){
                history.removeAt(index+1)
            }
        }
    }

    fun back(steps: Int): String {
        if (index - steps < 0) index = 0
        else index -= steps

        return history[index]
    }

    fun forward(steps: Int): String {
        if ((index + steps) > history.lastIndex) index = history.lastIndex
        else index += steps

        return history[index]
    }

}
