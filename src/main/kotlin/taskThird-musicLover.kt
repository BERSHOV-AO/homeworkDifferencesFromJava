fun main() {

    val priceOneSong = 1000

    val discountStart100Rb = 1_001
    val discountStop100Rb = 10_000
    val discount = 100;

    val discountStart5Percent = 10_001
    val discountPercent = 5
    val discountPercentBonus = 1

    val regularUser = true;

    val sumPrice = priceOneSong * 21
    var resultSumPrice: Int
    var resultSumPriceBonus: Int
    val strRubSumPrice = if (sumPrice % 2 == 0) "рублей" else "рубль"

    if (sumPrice in discountStart100Rb..discountStop100Rb) {
        resultSumPrice = sumPrice - discount
        val strRubResultSumPrice = if (resultSumPrice % 2 == 0) "рублей" else "рубль"

        println(
            """
            покупка — $sumPrice $strRubSumPrice. →

            после применения 100 рублей скидки — $resultSumPrice $strRubResultSumPrice.
                       
        """.trimIndent()
        )


    } else if (sumPrice >= discountStart5Percent) {
        resultSumPrice = sumPrice - (sumPrice * discountPercent) / 100
        val strRubResultSumPrice = if (resultSumPrice % 2 == 0) "рублей" else "рубль"

        println(
            """
            покупка — $sumPrice $strRubSumPrice. →

            после применения 5% скидки — $resultSumPrice $strRubResultSumPrice.

        """.trimIndent()
        )

    } else {
        resultSumPrice = sumPrice
        println("цена без скидки =  $resultSumPrice $strRubSumPrice")
    }

    if (regularUser) {
        resultSumPriceBonus = resultSumPrice - (resultSumPrice * discountPercentBonus) / 100
        val strRubResultSumPriceBonus = if (resultSumPriceBonus % 2 == 0) "рублей" else "рубль"
        println("после применения 1% скидки — $resultSumPriceBonus $strRubResultSumPriceBonus.")
    }
}


