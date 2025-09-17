package pawanroy.leetcode.`2353-desing-food-rating-system`


import java.util.PriorityQueue

class FoodRatings(foods: Array<String>, cuisines: Array<String>, ratings: IntArray) {

    data class FoodItem(val name: String, val cuisine: String, var rating: Int)


    private val comparator = compareByDescending<FoodItem> { it.rating }
        .thenBy { it.name }


    private val foodMap = mutableMapOf<String, FoodItem>()


    private val cuisineMap = mutableMapOf<String, PriorityQueue<FoodItem>>()

    init {
        for (i in foods.indices) {
            val food = FoodItem(foods[i], cuisines[i], ratings[i])
            foodMap[foods[i]] = food
            cuisineMap.computeIfAbsent(cuisines[i]) { PriorityQueue(comparator) }
                .add(food)
        }
    }

    fun changeRating(food: String, newRating: Int) {
        val item = foodMap[food]!!
        val updated = FoodItem(item.name, item.cuisine, newRating)


        foodMap[food] = updated


        cuisineMap[item.cuisine]!!.add(updated)
    }

    fun highestRated(cuisine: String): String {
        val pq = cuisineMap[cuisine]!!


        while (true) {
            val top = pq.peek()
            val latest = foodMap[top.name]!!
            if (top.rating == latest.rating) {
                return top.name
            } else {
                pq.poll()
            }
        }
    }
}