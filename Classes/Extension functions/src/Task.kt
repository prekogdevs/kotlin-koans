fun Int.r() = RationalNumber(this, 1)

fun Pair<Int, Int>.r() = RationalNumber(this.first, this.second)

data class RationalNumber(val numerator: Int, val denominator: Int)
