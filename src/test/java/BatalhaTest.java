import org.junit.Assert;
import org.junit.Test;



public class BatalhaTest {



    @Test
    public void deveRetornarNinjaComJutsuMaisForteSeOsDoisGastamOMesmoChakra() {
        Jutsu jutsu1 = new Jutsu(5, 10);
        Jutsu jutsu2 = new Jutsu(5, 8);
        Ninja ninja1 = new Ninja("Naruto", jutsu1);
        Ninja ninja2 = new Ninja("Sasuke", jutsu2);
        Batalha batalha = new Batalha();
        Ninja vencedor = batalha.lutar(ninja1, ninja2);
        Assert.assertEquals(ninja1, vencedor);
    }

    @Test
    public void deveAtualizarOChakraDoOponenteDeAcordoComODanoDoJutsoQuandoAtacar() {
        Jutsu jutsu = new Jutsu(5, 10);
        Ninja ninja1 = new Ninja("Naruto", jutsu);
        Ninja ninja2 = new Ninja("Sasuke", jutsu);
        ninja1.atacar(ninja2);
        Assert.assertEquals(90, ninja2.getChakra());
    }

    @Test
    public void deveRetornarPrimeiroNinjaComoVencedorQuandoONomeForItachi() {
        Jutsu jutsu = new Jutsu(5, 10);
        Ninja ninja1 = new Ninja("Itachi", jutsu);
        Ninja ninja2 = new Ninja("Sasuke", jutsu);
        Batalha batalha = new Batalha();
        Ninja vencedor = batalha.lutar(ninja1, ninja2);
        Assert.assertEquals(ninja1, vencedor);
    }

    @Test
    public void deveRetornarSegundoNinjaComoVencedorQuandoONomeForItachi() {
        Jutsu jutsu = new Jutsu(5, 10);
        Ninja ninja1 = new Ninja("Naruto", jutsu);
        Ninja ninja2 = new Ninja("Itachi", jutsu);
        Batalha batalha = new Batalha();
        Ninja vencedor = batalha.lutar(ninja1, ninja2);
        Assert.assertEquals(ninja2, vencedor);
    }

    @Test
    public void deveRetornarPrimeiroNinjaComoVencedorQuandoEmpatar() {
        Jutsu jutsu = new Jutsu(5, 10);
        Ninja ninja1 = new Ninja("Naruto", jutsu);
        Ninja ninja2 = new Ninja("Sasuke", jutsu);
        Batalha batalha = new Batalha();
        Ninja vencedor = batalha.lutar(ninja1, ninja2);
        Assert.assertEquals(ninja1, vencedor);
    }





}

