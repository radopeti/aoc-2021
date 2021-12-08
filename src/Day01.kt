fun main() {
    fun part1(input: List<String>): Int {
        var count = 0
        var prev = input[0].toInt()
        input
            .map { it.toInt() }
            .subList(1, input.size)
            .forEach { currDepth ->
                if (currDepth > prev) {
                    count++
                }
                prev = currDepth
            }
        return count
    }

    fun part2(input: List<String>): Int {

        return input.size
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day01_test")
    check(part1(testInput) == 8)

    val input = readInput("Day01")
    println(part1(input))
    println(part2(input))


}

private fun <E> List<E>.toCollection() {
    TODO("Not yet implemented")
}
