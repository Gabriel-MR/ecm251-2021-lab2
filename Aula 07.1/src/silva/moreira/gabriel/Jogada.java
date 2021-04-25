package silva.moreira.gabriel;

public class Jogada {
    public Resultado verificarResultado(Jogada jogada){
        if(verificarSeGanhei(jogada)){
            return Resultado.Ganhou;
        }
        if (verificarSePerdi(jogada)){
            return Resultado.Perdeu;
        }
        return Resultado.Empatou;
    }
    public boolean verificarSeGanhei(Jogada jogada){
        return true;
    }
    public boolean verificarSePerdi(Jogada jogada){
        return true;
    }
}
