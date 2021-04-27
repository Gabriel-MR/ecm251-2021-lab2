package silva.moreira.gabriel.pedra_papel_tesoura_2.model.jeff;

import silva.moreira.gabriel.pedra_papel_tesoura_2.model.Jogada;
import silva.moreira.gabriel.pedra_papel_tesoura_2.model.classico.Papel;
import silva.moreira.gabriel.pedra_papel_tesoura_2.model.classico.Pedra;
import silva.moreira.gabriel.pedra_papel_tesoura_2.model.classico.Tesoura;

public class Lagarto extends Jogada {
    @Override
    public Jogada[] jogadasQueVenco() {
        return new Jogada[]{new Papel(), new Spoke()};
    }

    @Override
    public Jogada[] jogadasQuePerco() {
        return new Jogada[]{new Pedra(), new Tesoura()};
    }

    @Override
    public String toString() {
        return "Lagarto";
    }
}
