import kotlin.test.Test
import kotlin.test.assertNotNull


class SampleTest {

    @Test
    fun `this is a sample test`() {
        val platformName = getPlatformName()
        assertNotNull(platformName)
    }

}
