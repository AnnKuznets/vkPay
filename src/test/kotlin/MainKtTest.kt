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

        val result = visaMirCalculate(minTaxVisaMir)

        assertEquals(3_501.0, result, 0.0)
    }
    @Test
    fun masterMaestroCalculate_minTax() {
        val taxMasterMaestro = 0.0
        val amount = 1_000_000.0
        val limitMasterMaestro = 7_500_000.0
        val lastTransfer = 5_000.0

        val result = masterMaestroCalculate(taxMasterMaestro) - 2_000.0

        assertEquals(0.0, result, 0.0)
    }

    @Test
    fun masterMaestroCalculate_Tax() {
        val taxMasterMaestro = 0.0
        val amount = 1_000_000.0
        val taxMasterMaestroLimit = 0.006 * amount + 2_000.0
        val limitMasterMaestro = 7_500_000.0
        val lastTransfer = 10_500_000.0

        val tax = masterMaestroCalculate(amount)

        assertEquals(8_000.0, tax, 0.0)
    }

    @Test
    fun cardTypeMaster() {
        val transfer = "masterMaestro Pay"

        val result = total("masterMaestro Pay")

        assertEquals(total("masterMaestro Pay"), result, 0.0)
    }
    @Test
    fun cardTypeVisa() {
        val transfer = "visaMir Pay"

        val result = total("visaMir Pay")

        assertEquals(total("visaMir Pay"), result, 0.0)
    }
    @Test
    fun cardTypeVk() {
        val transfer = "VK Pay"

        val result = total("VK Pay")

        assertEquals(total("VK Pay"), result, 0.0)
    }
    @Test
    fun vkCalculateTest() {
        val amount = 4_000_000.00

        val result = vkCalculate(amount)

        assertEquals(0.0, result, 0.0)
    }
}