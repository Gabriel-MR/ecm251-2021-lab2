package silva.moreira.gabriel.pedra_papel_tesoura_2.model;

import silva.moreira.gabriel.pedra_papel_tesoura_2.enumeracao.Resultado;

public abstract class Jogada {
    final public Resultado verificarResultado(Jogada jogada){
        if(verificarSeGanhei(jogada)){
            return Resultado.Ganhou;
        }
        if (verificarSePerdi(jogada)){
            return Resultado.Perdeu;
        }
        return Resultado.Empatou;
    }

    final private boolean verificarSePerdi(Jogada jogada) {
        for (Jogada jogadaGanha : jogadasQuePerco()) {
            if(jogadaGanha.getClass() == jogada.getClass()){
                return true;
            }
        }
        return false;
    }

    final private boolean verificarSeGanhei(Jogada jogada) {
        for (Jogada jogadaGanha : jogadasQueVenco()) {
            if(jogadaGanha.getClass() == jogada.getClass()){
                return true;
            }
        }
        return false;
    }

    public abstract Jogada[] jogadasQueVenco();
    public abstract Jogada[] jogadasQuePerco();
}
