package silva.moreira.gabriel.models;

import silva.moreira.gabriel.enums.Cargos;
import silva.moreira.gabriel.enums.Turnos;
import silva.moreira.gabriel.interfaces.PostarMensagem;

// Heranca de Membros e interface PostarMensagem
public class ScriptGuys extends Membro implements PostarMensagem {
    public ScriptGuys(String nome, String email){
        super(nome, email, Cargos.ScriptGuys, Turnos.Regular);
        super.mensagem = PostarMensagem();
    }

    // Interface PostarMensagem
    @Override
    public String PostarMensagem() {
        if (this.getTurnos() == Turnos.Regular){
            return "Prazer em ajudar novos amigos de código!";
        }else {
            return "QU3Ro_S3us_r3curs0s.py";
        }
    }
}
