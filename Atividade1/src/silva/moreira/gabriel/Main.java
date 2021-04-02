//Gabriel Moreira Silva - 19.00397-8
//Felipe Oliveira Boacnin - 19.00616-0

package silva.moreira.gabriel;

public class Main {

    public static void main(String[] args) {
	    Usuarios usuario1 = new Usuarios("All Might");
        Usuarios usuario2 = new Usuarios("One For All");
        Usuarios usuario3 = new Usuarios("Bakugo");

        Contas conta1 = new Contas(usuario1, 1,1000.00);
        Contas conta2 = new Contas(usuario2, 2,250.00);
        Contas conta3 = new Contas(usuario3,3,3000.00);

        System.out.println("Estado inicial:");
        System.out.println("Conta 1: " + conta1.toString());
        System.out.println("Conta 2: " + conta2.toString());
        System.out.println("Conta 3: " + conta3.toString());

        Transacoes transacoes = new Transacoes();

        String operacao1 = transacoes.qrCode(conta1, 250.00);
        transacoes.pagamento(conta2,conta1, operacao1);
        transacoes.pagamento(conta3,conta1, operacao1);
        transacoes.pagamento(conta2,conta1, operacao1);

        String operacao2 = transacoes.qrCode(conta2, 1000.00);
        transacoes.pagamento(conta3,conta2, operacao2);

        System.out.println("Estado Final:");
        System.out.println("Conta 1: " + conta1.toString());
        System.out.println("Conta 3: " + conta2.toString());
        System.out.println("Conta 3: " + conta3.toString());
    }
}
