package silva.moreira.gabriel.models;

import silva.moreira.gabriel.enums.Cargos;
import silva.moreira.gabriel.enums.Turnos;
import silva.moreira.gabriel.interfaces.PostarMensagem;

public class BigBrothers extends Membro implements PostarMensagem {

    /**
     * Heranca de Membros e interface PostarMensagem
     * @param nome nome do membro
     * @param email email do membro
     */

    public BigBrothers(String nome, String email){
        super(nome, email, Cargos.BigBrothers, Turnos.Regular);
        super.mensagem = PostarMensagem();
    }

    /**
     * Mensagem para postar do membro bigBrothers de acordo com o turno
     * @return mensagem para postar
     */

    @Override
    public String PostarMensagem() {
        if (this.getTurnos() == Turnos.Regular){
            return "Sempre ajudando as pessoas membros ou não S2!";
        }else {
            return "...";
        }
    }
}
