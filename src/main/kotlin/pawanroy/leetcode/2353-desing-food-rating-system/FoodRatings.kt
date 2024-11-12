package pawanroy.leetcode.`2353-desing-food-rating-system`

import java.util.*

class FoodRatings(foods: Array<String>, cuisines: Array<String>, ratings: IntArray) {
    data class FoodItem(val name: String, val cuisine: String, var rating: Int)

    private val foodComparator = compareByDescending<FoodItem> { it.rating }
        .thenBy { it.name }

    private val foodList: PriorityQueue<FoodItem> = PriorityQueue(foodComparator)

    init {
        foods.forEachIndexed { index, foodItem ->
            foodList.add(FoodItem(foodItem, cuisines[index], ratings[index]))
        }
        println(foodList)
    }

    fun changeRating(food: String, newRating: Int) {
        val item = foodList.first { it.name == food }
        foodList.remove(item)
        foodList.offer(item.copy(rating = newRating))
        println(foodList)
    }

    fun highestRated(cuisine: String): String {
        return foodList.first { it.cuisine == cuisine }.name
    }
}