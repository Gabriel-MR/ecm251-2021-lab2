//Gabriel Moreira Silva - 19.00397-8
//Felipe Oliveira Boacnin - 19.00616-0

package silva.moreira.gabriel;

public class Usuarios {
    private String nome;
    private String senha;
    private String email;

    // Construtor
    public Usuarios(String nome){
        this.nome = nome;
        this. senha = senha;
        this.email = email;
    }

    // Getter
    public String getNome() {
        return nome;
    }

    @Override
    public String toString(){
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", senha='" + senha + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}