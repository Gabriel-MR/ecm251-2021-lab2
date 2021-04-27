package silva.moreira.gabriel.pedra_papel_tesoura.model;

public class Jogador {
    private String nome;
    private boolean eHumano;
    private Jogada jogada;

    public Jogador(String nome, boolean eHumano) {
        this.nome = nome;
        this.eHumano = eHumano;
    }

    public Jogador(String nome) {
        this.nome = nome;
        this.eHumano = false;
    }

    public String getNome() {
        return nome;
    }

    public boolean iseHumano() {
        return eHumano;
    }

    public Jogada getJogada() {
        return jogada;
    }

    public void setJogada(Jogada jogada) {
        this.jogada = jogada;
    }
}
