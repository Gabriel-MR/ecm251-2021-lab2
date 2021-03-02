package silva.moreira.gabriel;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        String ra, nome, telefone, email;
        int idade;

        System.out.println("ra: ");
        Scanner scanner = new Scanner(System.in);
        ra = scanner.nextLine();

        System.out.println("nome: ");
        nome = scanner.nextLine();

        System.out.println("telefone: ");
        telefone = scanner.nextLine();

        System.out.println("email: ");
        email = scanner.nextLine();

        System.out.println("idade: ");
        idade = scanner.nextInt();

        System.out.println("RA: "+ra);
        System.out.println("nome: "+nome);
        System.out.println("telefone: "+telefone);
        System.out.println("e-mail: "+email);
        System.out.println("idade: "+idade);






    }
}
