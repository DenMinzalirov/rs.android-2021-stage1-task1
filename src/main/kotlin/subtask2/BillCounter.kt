package subtask2

class BillCounter {

    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        var price = 0.0f

        for (i in bill.indices)
        {
            if(i != k) {
                price += bill[i]/2.0F
            }
        }
        return if((price - b).toInt() == 0) {
            "Bon Appetit"
        } else {
            (b - price).toInt().toString()
        }
    }
}
