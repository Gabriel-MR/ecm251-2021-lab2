//Gabriel Moreira Silva - 19.00397-8
//Felipe Oliveira Boacnin - 19.00616-0

package silva.moreira.gabriel;

import java.util.Random;

public class Transacoes {

    // Gerar um número aleatório
    private static int getRandomNumberInRange(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    // Gerar o qrCode em string
    public String qrCode(Contas conta, double valor) {
        return conta.getIdConta() +
                ";" + conta.getUsuario().getNome() +
                ";" + valor + ";" +
                getRandomNumberInRange(1000, 9999);
    }

    // Gerar um pagamento/transferência
    public boolean pagamento(Contas pagador, Contas recebedor, String s) {
        String[] dados = s.split(";");
        // Código debatido com Gabriel Domingues Garofalo – 19.01229-2
        if ((recebedor.getUsuario().getNome().equals(dados[1])) && (Integer.toString(recebedor.getIdConta()).equals(dados[0])) && (pagador.getSaldo() >= Double.parseDouble(dados[2]))) {
            pagador.transferir(recebedor, Double.parseDouble(dados[2]));
            return true;
        }
        return false;
    }
}