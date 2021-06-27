package silva.moreira.gabriel.models;

import silva.moreira.gabriel.enums.Cargos;
import silva.moreira.gabriel.enums.Turnos;
import silva.moreira.gabriel.interfaces.PostarMensagem;


public class MobileMembers extends Membro implements PostarMensagem {

    /**
     * Heranca de Membros e interface PostarMensagem
     * @param nome nome do membro
     * @param email email do membro
     */

    public MobileMembers(String nome,String email){
        super(nome, email, Cargos.MobileMembers, Turnos.Regular);
        super.mensagem = postarMensagem();
    }

    /**
     * Mensagem para postar do membro mobileMembers de acordo com o turno
     * @return mensagem para postar
     */

    @Override
    public String postarMensagem() {
        if (this.getTurnos() == Turnos.Regular){
            return "Happy Coding!";
        }else {
            return "Happy_C0d1ng. Maskers";
        }
    }
}
