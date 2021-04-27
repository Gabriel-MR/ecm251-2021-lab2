package silva.moreira.gabriel.pedra_papel_tesoura.model;

import silva.moreira.gabriel.pedra_papel_tesoura.enumeracao.Resultado;

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
    public abstract boolean verificarSeGanhei(Jogada jogada);
    public abstract boolean verificarSePerdi(Jogada jogada);
}
