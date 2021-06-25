package silva.moreira.gabriel.models;

import silva.moreira.gabriel.interfaces.PostarMensagem;

public class BigBrothers extends Membro {
    public BigBrothers(){
        super();
        super.mensagem = PostarMensagem();
    }

    @Override
    public String PostarMensagem() {
        if (){
            return "Sempre ajudando as pessoas membros ou não S2!";
        }else {
            return "...";
        }
    }
}
