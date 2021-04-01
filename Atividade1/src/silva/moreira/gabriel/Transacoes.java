//Gabriel Moreira Silva - 19.00397-8
//Felipe Oliveira Boacnin - 19.00616-0

package silva.moreira.gabriel;

import java.util.Random;

public class Transacoes {

    private static int getRandomNumberInRange(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
    
    public String qrCode(Contas conta, double valor){
        return conta.getIdConta() + ";" + conta.getUsuario().getNome() + ";" + valor + ";" +  getRandomNumberInRange(1000,9999);
        String[] dados = Transacoes.qrCode().split(";");

    }




}
