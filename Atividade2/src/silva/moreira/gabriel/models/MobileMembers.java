package silva.moreira.gabriel.models;

import silva.moreira.gabriel.enums.Cargos;
import silva.moreira.gabriel.enums.Turnos;
import silva.moreira.gabriel.interfaces.PostarMensagem;

// Heranca de Membros e interface PostarMensagem
public class MobileMembers extends Membro implements PostarMensagem {
    public MobileMembers(String nome, int id){
        super(nome, id, Cargos.MobileMembers, Turnos.Regular);
        super.mensagem = PostarMensagem();
    }

    // Interface PostarMensagem
    @Override
    public String PostarMensagem() {
        if (this.getTurnos() == Turnos.Regular){
            return "Happy Coding!";
        }else {
            return "Happy_C0d1ng. Maskers";
        }
    }
}
