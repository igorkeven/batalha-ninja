public class Batalha {
    public Ninja lutar(Ninja primeiroNinja, Ninja segundoNinja) {
        for (int i = 0; i < 3; i++) {
            primeiroNinja.atacar(segundoNinja);
            segundoNinja.atacar(primeiroNinja);
        }

        if (primeiroNinja.getNome().equals("Itachi")) {
            return primeiroNinja;
        } else if (segundoNinja.getNome().equals("Itachi")) {
            return segundoNinja;
        } else if (primeiroNinja.getChakra() >= segundoNinja.getChakra()) {
            return primeiroNinja;
        } else {
            return segundoNinja;
        }
    }
}
