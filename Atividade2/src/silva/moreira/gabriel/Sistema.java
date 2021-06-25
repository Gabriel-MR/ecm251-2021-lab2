package silva.moreira.gabriel;

import silva.moreira.gabriel.models.*;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Sistema {

    ArrayList<Membro> Membros = new ArrayList<Membro>();
    MobileMembers mobileMembers;
    HeavyLifters heavyLifters;
    ScriptGuys scriptGuys;
    BigBrothers bigBrothers;

    private Scanner scanner;

    public void menu(){
        System.out.println("Bem-vindo!");
        System.out.println("1 - Registrar membros");
        System.out.println("2 - Horário de trabalho");
        System.out.println("3 - Postar mensagem");
        System.out.println("4 - Mudar horário de trabalho");
        System.out.println("0 - Sair");
        int op = scanner.nextInt();

        do {
            switch (op){
                case 1:
                System.out.println("Cargo do membro: \n");
                System.out.println("1 - Mobile Member");
                System.out.println("2 - Heavy Lifter");
                System.out.println("3 - Script Guy");
                System.out.println("4 - Big Brother");
                int cargo = scanner.nextInt();
                switch (cargo){
                    case 1:
                        System.out.println("Nome: ");
                        String nome = scanner.next();
                        System.out.println("Id: ");
                        int id = scanner.nextInt();
                        mobileMembers = new MobileMembers(nome, id);

                        break;
                    case 2:
                        System.out.println("Nome: ");
                        String nome = scanner.next();
                        System.out.println("Id: ");
                        int id = scanner.nextInt();
                        heavyLifters = new HeavyLifters(nome, id);

                        break;

                    case 3:
                        System.out.println("Nome: ");
                        String nome = scanner.next();
                        System.out.println("Id: ");
                        int id = scanner.nextInt();
                        scriptGuys = new ScriptGuys(nome, id);

                        break;

                    case 4:
                        System.out.println("Nome: ");
                        String nome = scanner.next();
                        System.out.println("Id: ");
                        int id = scanner.nextInt();
                        bigBrothers = new BigBrothers(nome, id);

                        break;

                    default:
                        System.out.println("Cargo invalido");
                }
                menu();

                case 2:
                    System.out.println("nome: ");
                    String nome = scanner.next();
                    break;

                case 3:
                    for (Membro membro : Membros){
                        System.out.println(membro.getNome() + membro.getMensagem());
                    }
                    break;
                    menu();




            }
        }while (op != 0);
    }
}

