fun main() {

    val likes = 11;
    val likesComment =
        if (likes % 10 == 1 && likes % 100 != 11) "Понравилось $likes человеку" else "Понравилось $likes людям"
    println(likesComment)
}