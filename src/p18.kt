import java.util.Arrays

fun main() {
    val a1 = arrayOf('a', 'b', 'c')
    println("Character Array: " + a1.joinToString())

    val a = Array<Int>(5) { 0 }
    println("Array a: " + a.joinToString(";"))

    val b = Array<Int>(10) { i -> i * 2 }
    println("Array b: " + b.joinToString(";"))

    b.shuffle()
    println("After Shuffle: " + b.joinToString())

    b.sort()
    println("After Built-in Sort: " + b.joinToString())

    val intArray = IntArray(5) { i -> i + 1 }
    println("IntArray: " + intArray.joinToString(";"))

    val nestedArray = arrayOf(
        arrayOf(1, 2, 3),
        arrayOf(4, 5, 6)
    )

    println("Arrays.deepToString(): " + Arrays.deepToString(nestedArray))
    println("contentDeepToString(): " + nestedArray.contentDeepToString())

    println("Range Loop:")
    for (i in 0..4) {
        print("$i ")
    }
    println()

    println("Until Loop:")
    for (i in 0 until 5) {
        print("$i ")
    }
    println()

    println("DownTo Loop:")
    for (i in 5 downTo 1) {
        print("$i ")
    }
    println()

    val unsorted = intArrayOf(5, 2, 8, 1, 3)

    println("Before Manual Sort: " + unsorted.joinToString())

    for (i in 0 until unsorted.size - 1) {
        for (j in 0 until unsorted.size - i - 1) {

            if (unsorted[j] > unsorted[j + 1]) {
                val temp = unsorted[j]
                unsorted[j] = unsorted[j + 1]
                unsorted[j + 1] = temp
            }
        }
    }

    println("After Manual Sort: " + unsorted.joinToString())
    val numbers = intArrayOf(9, 4, 7, 2, 6)

    println("Before Built-in Sort: " + numbers.joinToString())

    numbers.sort()

    println("After Built-in Sort: " + numbers.joinToString())
}