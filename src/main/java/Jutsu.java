public class Jutsu {
    private final int chakraConsumido;
    private final int dano;

    public Jutsu(int chakraConsumido, int dano) {
        this.chakraConsumido = Math.min(chakraConsumido, 5);
        this.dano = Math.min(dano, 10);
    }

    public int getChakraConsumido() {
        return chakraConsumido;
    }

    public int getDano() {
        return dano;
    }
}
