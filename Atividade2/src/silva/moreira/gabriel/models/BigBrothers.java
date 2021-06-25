package silva.moreira.gabriel.models;

import silva.moreira.gabriel.enums.Cargos;
import silva.moreira.gabriel.enums.Turnos;
import silva.moreira.gabriel.interfaces.PostarMensagem;

// Heranca de Membros e interface PostarMensagem
public class BigBrothers extends Membro implements PostarMensagem {
    public BigBrothers(String nome, int id){
        super(nome, id, Cargos.BigBrothers, Turnos.Regular);
        super.mensagem = PostarMensagem();
    }

    // Interface PostarMensagem
    @Override
    public String PostarMensagem() {
        if (this.getTurnos() == Turnos.Regular){
            return "Sempre ajudando as pessoas membros ou não S2!";
        }else {
            return "...";
        }
    }
}
