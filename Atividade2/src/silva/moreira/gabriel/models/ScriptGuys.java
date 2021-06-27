package silva.moreira.gabriel.models;

import silva.moreira.gabriel.enums.Cargos;
import silva.moreira.gabriel.enums.Turnos;
import silva.moreira.gabriel.interfaces.PostarMensagem;

public class ScriptGuys extends Membro implements PostarMensagem {

    /**
     * Heranca de Membros e interface PostarMensagem
     * @param nome nome do membro
     * @param email email do membro
     */

    public ScriptGuys(String nome, String email){
        super(nome, email, Cargos.ScriptGuys, Turnos.Regular);
        super.mensagem = PostarMensagem();
    }

    /**
     * Mensagem para postar do membro scriptGuys de acordo com o turno
     * @return mensagem para postar
     */

    @Override
    public String PostarMensagem() {
        if (this.getTurnos() == Turnos.Regular){
            return "Prazer em ajudar novos amigos de código!";
        }else {
            return "QU3Ro_S3us_r3curs0s.py";
        }
    }
}
