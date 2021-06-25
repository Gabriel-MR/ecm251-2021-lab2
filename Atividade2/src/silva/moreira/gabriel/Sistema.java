package silva.moreira.gabriel;

import silva.moreira.gabriel.models.*;

import java.util.Random;
import java.util.Scanner;

public class Sistema {
    MobileMembers mobileMembers;
    HeavyLifters heavyLifters;
    ScriptGuys scriptGuys;
    BigBrothers bigBrothers;

    private Scanner scanner;

    public void menu(){
        System.out.println("Bem-vindo!");
        System.out.println("Opções: ");
        System.out.println("1 - Registrar membros");
        System.out.println("2 - Horário de trabalho");
        System.out.println("3 - Postar mensagem");
        System.out.println("4 - Mudar horário de trabalho");
        System.out.println("0 - Sair");

    int op = scanner.nextInt();
    do {
        switch (op){
            case 1:

        }
    }while (op != 0);
    }
}

