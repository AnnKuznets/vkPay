fun main() {
    val transfer = "masterMaestro Pay"
    println("Комиссия ${total(transfer)} копеек")
}
fun total(transfer: String) : Double{
    val amount = 45_000_000.0
    return when (transfer) {
        "VK Pay" -> {vkCalculate(amount)}
        "visaMir Pay" -> {visaMirCalculate(amount)}
        "masterMaestro Pay" -> {masterMaestroCalculate(amount)}
        else -> amount
    }
}
fun vkCalculate(amount: Double): Double {
    return 0.0
}
fun visaMirCalculate(amount: Double): Double{
    val minTaxVisaMir = 3_500.0
    val taxVisaMir = 0.0075
    val totalTaxVisaMir = amount * taxVisaMir
    if (totalTaxVisaMir > minTaxVisaMir) {
        return totalTaxVisaMir
    }
    return minTaxVisaMir
}


fun masterMaestroCalculate(amount: Double) : Double{
        val taxMasterMaestro = 0.0
        val taxMasterMaestroLimit = 0.006 * amount + 2_000.0
        val limitMasterMaestro = 7_500_000.0
        val lastTransfer = 10_500_000.0
        val result = amount * taxMasterMaestro
        if (lastTransfer <= limitMasterMaestro) {
            return result
        }
        return taxMasterMaestroLimit
    }
