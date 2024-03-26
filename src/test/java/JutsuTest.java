import org.junit.Assert;
import org.junit.Test;

public class JutsuTest {

    @Test
    public void deveCriarJutsuComValoresCorretos() {
        Jutsu jutsu = new Jutsu(5, 10);
        Assert.assertEquals(5, jutsu.getChakraConsumido());
        Assert.assertEquals(10, jutsu.getDano());
    }
}
