package silva.moreira.gabriel.models;

import silva.moreira.gabriel.enums.Cargos;
import silva.moreira.gabriel.enums.Turnos;
import silva.moreira.gabriel.interfaces.PostarMensagem;

// Heranca de Membros e interface PostarMensagem
public class HeavyLifters extends Membro implements PostarMensagem {
    public HeavyLifters(String nome, String email){
        super(nome, email, Cargos.HeavyLifters, Turnos.Regular);
        super.mensagem = PostarMensagem();
    }

    // Interface PostarMensagem
    @Override
    public String PostarMensagem() {
        if (this.getTurnos() == Turnos.Regular){
            return "Podem contar conosco!";
        }else {
            return "N00b_qu3_n_Se_r3pita.bat";
        }
    }
}
