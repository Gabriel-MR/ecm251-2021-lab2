package silva.moreira.gabriel.pedra_papel_tesoura_2.model.jeff;

import silva.moreira.gabriel.pedra_papel_tesoura_2.model.Jogada;
import silva.moreira.gabriel.pedra_papel_tesoura_2.model.classico.Papel;
import silva.moreira.gabriel.pedra_papel_tesoura_2.model.classico.Pedra;
import silva.moreira.gabriel.pedra_papel_tesoura_2.model.classico.Tesoura;

public class Spoke extends Jogada {
    @Override
    public Jogada[] jogadasQueVenco() {
        return new Jogada[]{new Papel(), new Tesoura()};
    }

    @Override
    public Jogada[] jogadasQuePerco() {
        return new Jogada[]{new Papel(), new Lagarto()};
    }

    @Override
    public String toString() {
        return "Spoke";
    }
}
