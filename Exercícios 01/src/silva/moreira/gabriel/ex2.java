package silva.moreira.gabriel;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        String nome1, nome2;
        int idade1, idade2, dif;

        System.out.println("nome 1: ");
        Scanner scanner = new Scanner(System.in);
        nome1 = scanner.nextLine();

        System.out.println("idade 1: ");
        idade1 = Integer.parseInt(scanner.nextLine());

        System.out.println("nome 2: ");
        nome2 = scanner.nextLine();

        System.out.println("idade 2: ");
        idade2 = Integer.parseInt(scanner.nextLine());

        if (idade1 > idade2){
            dif = idade1 - idade2;
            System.out.println(""+nome1+" é mais velho que "+nome2+" por "+dif+" anos");
        }else
            dif = idade2 - idade1;
            System.out.println(""+nome2+" é mais velho que "+nome1+" por "+dif+" anos");
    }
}
