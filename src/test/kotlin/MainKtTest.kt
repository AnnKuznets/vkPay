import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun visaMirCalculate_Tax() {

        val minTaxVisaMir = 3_500.0
        val taxVisaMir = 0.0075
        val amount = 45_000_000.0
        val totalTaxVisaMir = amount * taxVisaMir

        val result = visaMirCalculate(amount)

        assertEquals(337_501.0, result, 0.0)
    }

    @Test
    fun visaMirCalculate_minTax() {
        val minTaxVisaMir = 3_500.0
        val taxVisaMir = 0.0075
        val amount = 1_000_000.0
        val totalTaxVisaMir = amount * taxVisaMir

        val result = visaMirCalculate(minTaxVisaMir)

        assertEquals(3_501.0, result, 0.0)
    }


    @Test
    fun masterMaestroCalculate_Tax() {
        val taxMasterMaestro = 0.0
        val amount = 45_000_000.0
        val taxMasterMaestroLimit = 0.006 * amount + 2_000.0
        val limitMasterMaestro = 7_500_000.0
        val lastTransfer = 10_500_000.0

        val tax = masterMaestroCalculate(amount)

        assertEquals(272_001.0, tax, 0.0)
    }
}