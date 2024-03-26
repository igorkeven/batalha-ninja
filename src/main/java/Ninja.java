
public class Ninja {
    private final String nome;
    private int chakra = 100;
    private final Jutsu jutsuPrincipal;

    public Ninja(String nome, Jutsu jutsuPrincipal) {
        this.nome = nome;
        this.jutsuPrincipal = jutsuPrincipal;
    }

    public void atacar(Ninja oponente) {
        oponente.receberGolpe(jutsuPrincipal.getDano());
        this.chakra -= jutsuPrincipal.getChakraConsumido();
    }

    public void receberGolpe(int dano) {
        this.chakra -= dano;
    }

    public String getNome() {
        return nome;
    }

    public int getChakra() {
        return chakra;
    }
}
