package pawanroy.leetcode.`1912-desing-movie-rental-system`

import java.util.*

data class MovieEntry(val shopId: Int, val movieId: Int, val price: Int)

class MovieRentingSystem(n: Int, entries: Array<IntArray>) {
    // Quick price lookup
    private val priceMap = HashMap<Pair<Int, Int>, Int>()

    // Available movies per movieId
    private val available = HashMap<Int, TreeSet<MovieEntry>>()

    // Rented movies global
    private val rented = TreeSet<MovieEntry>(compareBy<MovieEntry> { it.price }
        .thenBy { it.shopId }
        .thenBy { it.movieId })

    init {
        val comp = compareBy<MovieEntry> { it.price }.thenBy { it.shopId }
        for (e in entries) {
            val shop = e[0]
            val movie = e[1]
            val price = e[2]
            val entry = MovieEntry(shop, movie, price)
            priceMap[shop to movie] = price
            available.computeIfAbsent(movie) { TreeSet(comp) }.add(entry)
        }
    }

    fun search(movieId: Int): List<Int> {
        val result = ArrayList<Int>()
        val set = available[movieId] ?: return result
        var count = 0
        for (e in set) {
            result.add(e.shopId)
            if (++count == 5) break
        }
        return result
    }

    fun rent(shopId: Int, movieId: Int) {
        val price = priceMap[shopId to movieId]!!
        val entry = MovieEntry(shopId, movieId, price)
        available[movieId]?.remove(entry)
        rented.add(entry)
    }

    fun drop(shopId: Int, movieId: Int) {
        val price = priceMap[shopId to movieId]!!
        val entry = MovieEntry(shopId, movieId, price)
        rented.remove(entry)
        available[movieId]?.add(entry)
    }

    fun report(): List<List<Int>> {
        val result = ArrayList<List<Int>>()
        var count = 0
        for (e in rented) {
            result.add(listOf(e.shopId, e.movieId))
            if (++count == 5) break
        }
        return result
    }
}


/**
 * Your MovieRentingSystem object will be instantiated and called as such:
 * var obj = MovieRentingSystem(n, entries)
 * var param_1 = obj.search(movie)
 * obj.rent(shop,movie)
 * obj.drop(shop,movie)
 * var param_4 = obj.report()
 */