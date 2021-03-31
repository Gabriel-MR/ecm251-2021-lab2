package silva.moreira.gabriel;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        String nome, senha, nomecerto, senhacerta;

        System.out.println("cadastro: ");
        Scanner scanner = new Scanner(System.in);

        nome = scanner.nextLine();
        System.out.println("senha: ");
        senha = scanner.nextLine();

        do{
            System.out.println("login: ");
            nomecerto = scanner.nextLine();

            System.out.println("senha: ");
            senhacerta = scanner.nextLine();
        }while(!nome.equals(nomecerto) || !senha.equals(senhacerta));

        System.out.println("Bem-vindo");

    }
}
