
//Gabriel Moreira Silva - 19.00397-8
//Felipe Oliveira Boacnin - 19.00616-0

package silva.moreira.gabriel;

public class Main {

    public static void main(String[] args) {
	    Usuarios usuario1 = new Usuarios("All Might");
        Usuarios usuario2 = new Usuarios("One For All");
        Usuarios usuario3 = new Usuarios("Bakugo");

        Contas conta1 = new Contas(usuario1,Transacoes.qrCode(),1000);
        Contas conta2 = new Contas(usuario2, Transacoes.qrCode(),250);
        Contas conta3 = new Contas(usuario3, Transacoes.qrCode(),3000);

        System.out.println("Estado inicial:");
        System.out.println("Conta 1: " + conta1.toString());
        System.out.println("Conta 2: " + conta2.toString());
        System.out.println("Conta 3: " + conta3.toString());

        String operacao1 = Transacoes.qrCode(conta1, 250);
        // Usuário 2 paga a requisição do usuário 1
        // Usuário 3 paga a requisição do usuário 1
        // Usuário 2 paga a requisição do usuário 1

        String operacao2 = Transacoes.qrCode(conta2, 1000);
        // Usuário 3 paga a requisição do usuário 2

        System.out.println("Estado Final:");
        System.out.println("Conta 1: " + conta1.toString());
        System.out.println("Conta 3: " + conta2.toString());
        System.out.println("Conta 3: " + conta3.toString());


    }
}
