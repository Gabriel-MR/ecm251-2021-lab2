package silva.moreira.gabriel.models;

import silva.moreira.gabriel.enums.Cargos;
import silva.moreira.gabriel.enums.Turnos;
import silva.moreira.gabriel.interfaces.Apresentacao;

public abstract class Membro implements Apresentacao {
    protected String nome;
    protected int id;
    protected Cargos cargo;
    protected String mensagem;
    protected Turnos turnos;

    // Construtor
    public Membro(String nome, int id, Cargos cargo, Turnos turnos) {
        this.nome = nome;
        this.id = id;
        this.cargo = cargo;
        this.turnos = turnos;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public Cargos getCargo() {
        return cargo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public Turnos getTurnos() {
        return turnos;
    }

    // Setters
    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public void setTurnos(Turnos turnos) {
        this.turnos = turnos;
    }


    // toString Apresentação
    @Override
    public String toString() {
        return "Membro{" +
                "nome='" + nome + '\'' +
                ", id=" + id +
                ", cargo=" + cargo +
                ", turnos=" + turnos +
                '}';
    }
}
