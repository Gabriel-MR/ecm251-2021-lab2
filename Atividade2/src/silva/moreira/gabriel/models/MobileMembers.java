package silva.moreira.gabriel.models;

import silva.moreira.gabriel.interfaces.PostarMensagem;

public class MobileMembers extends Membro implements PostarMensagem {
    public MobileMembers(){
        super();
        super.mensagem = PostarMensagem();
    }

    @Override
    public String PostarMensagem() {
        if (){
            return "Happy Coding!";
        }else {
            return "Happy_C0d1ng. Maskers";
        }
    }
}
