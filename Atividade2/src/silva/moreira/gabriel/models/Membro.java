package silva.moreira.gabriel.models;

import silva.moreira.gabriel.enums.Cargos;
import silva.moreira.gabriel.enums.Turnos;
import silva.moreira.gabriel.interfaces.Apresentacao;

/**
 * Atributos
 */

public abstract class Membro implements Apresentacao {
    protected String nome;
    protected String email;
    protected Cargos cargo;
    protected String mensagem;
    protected Turnos turnos;

    /**
     * Construtor
     * @param nome nome do membro
     * @param email email do membro
     * @param cargo funcao do membro
     * @param turnos horario de trabalho
     */

    public Membro(String nome, String email, Cargos cargo, Turnos turnos) {
        this.nome = nome;
        this.email = email;
        this.cargo = cargo;
        this.turnos = turnos;

    }

    /**
     * Get do nome
     * @return o nome do membro
     */

    public String getNome() {
        return nome;
    }

    /**
     * Get do cargo
     * @return o cargo
     */

    public Cargos getCargo() {
        return cargo;
    }

    /**
     * Get mensagem para postar
     * @return a mensagem
     */

    public String getMensagem() {
        return mensagem;
    }

    /**
     * Get do turno
     * @return horario de trabalho
     */

    public Turnos getTurnos() {
        return turnos;
    }

    /**
     * Set o horario de trabalho
     * @param turnos horario de trabalho
     */

    public void setTurnos(Turnos turnos) {
        this.turnos = turnos;
    }

    /**
     * Set mensagem do membro
     * @param mensagem mensagem para postar
     */

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    /**
     * Informacoes do membro
     * @return todas as informacoes do membro
     */

    @Override
    public String apresentacao() {
        return "Membro{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", cargo=" + cargo +
                ", turnos=" + turnos +
                '}';
    }
}
