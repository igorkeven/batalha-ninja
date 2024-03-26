import org.junit.Assert;
import org.junit.Test;

public class NinjaTest {

    @Test
    public void deveCriarNinjaComValoresCorretos() {
        Jutsu jutsu = new Jutsu(5, 10);
        Ninja ninja = new Ninja("Naruto", jutsu);
        Assert.assertEquals("Naruto", ninja.getNome());
        Assert.assertEquals(100, ninja.getChakra());
    }

    @Test
    public void deveAtacarCorretamente() {
        Jutsu jutsu = new Jutsu(5, 10);
        Ninja ninja1 = new Ninja("Naruto", jutsu);
        Ninja ninja2 = new Ninja("Sasuke", jutsu);
        ninja1.atacar(ninja2);
        Assert.assertEquals(90, ninja2.getChakra());
        Assert.assertEquals(95, ninja1.getChakra());
    }

    @Test
    public void deveReceberGolpeCorretamente() {
        Jutsu jutsu = new Jutsu(5, 10);
        Ninja ninja = new Ninja("Naruto", jutsu);
        ninja.receberGolpe(10);
        Assert.assertEquals(90, ninja.getChakra());
    }
}
