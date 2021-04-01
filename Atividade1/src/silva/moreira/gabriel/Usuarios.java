
//Gabriel Moreira Silva - 19.00397-8
//Felipe Oliveira Boacnin - 19.00616-0

package silva.moreira.gabriel;

public class Usuarios {
    private Usuarios nome;
    private String senha;
    private String email;

    public Usuarios(Usuarios nome){
        this.nome = nome;
        this. senha = senha;
        this.email = email;
    }

    public Usuarios getNome(){
        return nome;
    }

    @Override
    public String toString() {
        return "Usuarios{" +
                "nome='" + nome + '\'' +
                ", senha='" + senha + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}