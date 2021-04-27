package silva.moreira.gabriel.pedra_papel_tesoura_2.model.classico;

import silva.moreira.gabriel.pedra_papel_tesoura_2.model.Jogada;
import silva.moreira.gabriel.pedra_papel_tesoura_2.model.jeff.Lagarto;
import silva.moreira.gabriel.pedra_papel_tesoura_2.model.jeff.Spoke;

public class Papel extends Jogada {

    @Override
    public Jogada[] jogadasQueVenco() {
        return new Jogada[]{new Pedra(), new Spoke()};
    }

    @Override
    public Jogada[] jogadasQuePerco() {
        return new Jogada[]{new Tesoura(), new Lagarto()};
    }

    @Override
    public String toString() {
        return "Papel";
    }
}
