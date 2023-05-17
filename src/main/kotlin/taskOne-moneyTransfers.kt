fun main() {

    val minimumCommission = 35
    val percentCommission = 0.75
    val amount = 550

    val commissionCalculatedFromPercent = (amount * percentCommission) / 100
    val amountCommission = if (commissionCalculatedFromPercent > minimumCommission) commissionCalculatedFromPercent
    else minimumCommission

    println("Пользователь за переводы с любых карт c $amount руб. заплатит комиссию $amountCommission руб.")
}