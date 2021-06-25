package silva.moreira.gabriel.models;

import silva.moreira.gabriel.interfaces.PostarMensagem;

public class ScriptGuys extends Membro implements PostarMensagem {
    public ScriptGuys(){
        super();
        super.mensagem = PostarMensagem();
    }

    @Override
    public String PostarMensagem() {
        if (){
            return "Prazer em ajudar novos amigos de código!";
        }else {
            return "QU3Ro_S3us_r3curs0s.py";
        }
    }
}
