package silva.moreira.gabriel;

import silva.moreira.gabriel.models.*;

import java.io.FileWriter;
import java.io.IOException;
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

    public void menu() throws IOException {
        System.out.println("Bem-vindo!");
        System.out.println("1 - Registrar membros");
        System.out.println("2 - Horário de trabalho");
        System.out.println("3 - Postar mensagem");
        System.out.println("4 - Mudar turno");
        System.out.println("5 - Gerar arquivo com os membros");
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
                    case 0:
                        System.exit();
                    case 1:
                        System.out.println("Nome: ");
                        String nome1 = scanner.next();
                        System.out.println("Id: ");
                        String email1 = scanner.next();
                        mobileMembers = new MobileMembers(nome1, email1);

                        break;
                    case 2:
                        System.out.println("Nome: ");
                        String nome2 = scanner.next();
                        System.out.println("Id: ");
                        String email2 = scanner.next();
                        heavyLifters = new HeavyLifters(nome2, email2);

                        break;

                    case 3:
                        System.out.println("Nome: ");
                        String nome3 = scanner.next();
                        System.out.println("Id: ");
                        String email3 = scanner.next();
                        scriptGuys = new ScriptGuys(nome3, email3);

                        break;

                    case 4:
                        System.out.println("Nome: ");
                        String nome4 = scanner.next();
                        System.out.println("Id: ");
                        String email4 = scanner.next();
                        bigBrothers = new BigBrothers(nome4, email4);

                        break;

                    default:
                        System.out.println("Cargo invalido");
                }
                menu();

                case 2:
                    System.out.println("nome: ");
                    String nome5 = scanner.next();
                    Membro pesquisa = null;
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
                    menu();
                    break;

                case 4:
                    break;

                case 5:
                    int id = 0;
                    FileWriter fileWriter = new FileWriter("arquivo_super_Secreto_nao_abrir.csv", true);
                    fileWriter.write("Membros: \n");
                    for (Membro membro : Membros) {
                        id += 1;
                        fileWriter.append(membro.getCargo() + " ; " + membro.getNome() + " ; " + id + "\n");
                    }
                    fileWriter.close();
                    menu();
                    break;

                default:
                    System.out.println("Opcao invalida");
            }
        }while (op != 0);
    }
}

