package silva.moreira.gabriel.models;

import silva.moreira.gabriel.interfaces.PostarMensagem;

public class HeavyLifters extends Membro implements PostarMensagem {
    public HeavyLifters(){
        super();
        super.mensagem = PostarMensagem();
    }

    @Override
    public String PostarMensagem() {
        if (){
            return "Podem contar conosco!";
        }else {
            return "N00b_qu3_n_Se_r3pita.bat";
        }
    }
}
