package silva.moreira.gabriel.models;

import silva.moreira.gabriel.enums.Cargos;
import silva.moreira.gabriel.enums.Turnos;
import silva.moreira.gabriel.interfaces.Apresentacao;

public abstract class Membro implements Apresentacao {
    protected String nome;
    protected String email;
    protected Cargos cargo;
    protected String mensagem;
    protected Turnos turnos;

    // Construtor
    public Membro(String nome, String email, Cargos cargo, Turnos turnos) {
        this.nome = nome;
        this.email = email;
        this.cargo = cargo;
        this.turnos = turnos;

    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getEmail(){
        return email;
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


    @Override
    public String toString() {
        return "Membro{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", cargo=" + cargo +
                ", turnos=" + turnos +
                '}';
    }
}
