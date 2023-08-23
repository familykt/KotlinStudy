class Lambda {
    // a,b and e are all the same function.
    fun main(args: Array<String>) {

        //higher order function
        println(d(::e))
        //lambda
        val a: (Int) -> String = { num -> num.toString() }
        println(d(a))
        //lambda with type inference
        val b = { num: Int -> num.toString() }
        println(d(b))
    }

    private fun e(num: Int): String {
        return num.toString()
    }

    private fun d(function: (Int) -> (String)): Int {
        return Integer.valueOf(function(2))
    }


}