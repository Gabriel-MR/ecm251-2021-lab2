package silva.moreira.gabriel.models;

import silva.moreira.gabriel.enums.Cargos;
import silva.moreira.gabriel.enums.Turnos;
import silva.moreira.gabriel.interfaces.PostarMensagem;

public class HeavyLifters extends Membro implements PostarMensagem {

    /**
     * Heranca de Membros e interface PostarMensagem
     * @param nome nome do membro
     * @param email email do membro
     */

    public HeavyLifters(String nome, String email){
        super(nome, email, Cargos.HeavyLifters, Turnos.Regular);
        super.mensagem = postarMensagem();
    }

    /**
     * Mensagem para postar do membro heavyLifters de acordo com o turno
     * @return mensagem para postar
     */

    @Override
    public String postarMensagem() {
        if (this.getTurnos() == Turnos.Regular){
            return "Podem contar conosco!";
        }else {
            return "N00b_qu3_n_Se_r3pita.bat";
        }
    }
}
