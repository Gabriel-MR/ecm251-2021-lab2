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
        System.out.println("4 - Mudar turno");
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
                        String nome1 = scanner.next();
                        System.out.println("Id: ");
                        int id1 = scanner.nextInt();
                        mobileMembers = new MobileMembers(nome1, id1);

                        break;
                    case 2:
                        System.out.println("Nome: ");
                        String nome2 = scanner.next();
                        System.out.println("Id: ");
                        int id2 = scanner.nextInt();
                        heavyLifters = new HeavyLifters(nome2, id2);

                        break;

                    case 3:
                        System.out.println("Nome: ");
                        String nome3 = scanner.next();
                        System.out.println("Id: ");
                        int id3 = scanner.nextInt();
                        scriptGuys = new ScriptGuys(nome3, id3);

                        break;

                    case 4:
                        System.out.println("Nome: ");
                        String nome4 = scanner.next();
                        System.out.println("Id: ");
                        int id4 = scanner.nextInt();
                        bigBrothers = new BigBrothers(nome4, id4);

                        break;

                    default:
                        System.out.println("Cargo invalido");
                }
                menu();

                case 2:
                    System.out.println("nome: ");
                    String nome5 = scanner.next();
                    Membro pesquisa;
                    for (Membro membro : Membros){
                        if (nome5.equals(membro.getNome())){
                            pesquisa = membro;
                            break;
                        }
                    }
                    System.out.println(pesquisa.getTurnos());
                    menu();

                case 3:
                    for (Membro membro : Membros){
                        System.out.println(membro.getNome() + membro.getMensagem());
                    }
                    break;
                    menu();

                case 4:
                    break;

                case 5:
                    System.out.println("nome: ");
                    String remover = scanner.next();

                    for(Membro membro : Membros){
                        if(remover.equals(membro.getNome())){
                            // achou membro
                            break;
                        }
                    }
                    Membros.remove();
                    menu();





            }
        }while (op != 0);
    }
}

