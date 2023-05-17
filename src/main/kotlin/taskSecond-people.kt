fun main() {

    val likes = 41;
    val likesComment = if (likes % 2 == 0) "Понравилось $likes людям" else "Понравилось $likes человеку"
    println(likesComment)
}