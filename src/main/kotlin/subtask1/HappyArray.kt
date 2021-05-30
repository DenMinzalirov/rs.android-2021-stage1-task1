package subtask1
import kotlin.collections.*

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
        return if (sadArray.size <= 2) { sadArray } else {
            val result = sadArray.toMutableList()
            var i: Int = 1
            while (i < result.size - 1) {
                if (result[i] > result[i - 1] + result[i + 1]) {
                    result.removeAt(i)
                    if (i > 1) {i--}
                } else {i++}
            }
            return result.toIntArray()
        }
    }
}
