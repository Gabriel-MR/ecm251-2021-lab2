package silva.moreira.gabriel;

import silva.moreira.gabriel.enums.Cargos;
import silva.moreira.gabriel.enums.Turnos;
import silva.moreira.gabriel.models.*;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {

    /**
     * Atributos
     */

    ArrayList<Membro> Membros = new ArrayList<>();
    MobileMembers mobileMembers;
    HeavyLifters heavyLifters;
    ScriptGuys scriptGuys;
    BigBrothers bigBrothers;

    /**
     * Iniciar o sistema
     */

    private final Scanner scanner;
    public  Sistema(){
        scanner = new Scanner(System.in);
    }

    /**
     * Menu principal das funcoes
     */

    public void menu() throws IOException {

        System.out.println("Bem-vindo!");
        System.out.println("1 - Registrar membros");
        System.out.println("2 - Apresentacao membros");
        System.out.println("3 - Turno de trabalho");
        System.out.println("4 - Postar mensagem");
        System.out.println("5 - Mudar turno");
        System.out.println("6 - Gerar arquivo com os membros");
        System.out.println("0 - Sair");
        System.out.println("Opcao: ");
        int op = scanner.nextInt();

        do {
            switch (op){

                case 0:
                    System.out.println("Sistema encerrado!");
                    System.exit(0);

                case 1:
                    System.out.println("Cargo do membro: \n");
                    System.out.println("1 - Mobile Member");
                    System.out.println("2 - Heavy Lifter");
                    System.out.println("3 - Script Guy");
                    System.out.println("4 - Big Brother");
                    System.out.println("Opcao: ");
                    int cargo = scanner.nextInt();
                    switch (cargo){
                        case 1:
                            System.out.println("Nome: ");
                            String nome1 = scanner.next();
                            System.out.println("E-mail: ");
                            String email1 = scanner.next();
                            mobileMembers = new MobileMembers(nome1, email1);
                            Membros.add(mobileMembers);
                            break;
                        case 2:
                            System.out.println("Nome: ");
                            String nome2 = scanner.next();
                            System.out.println("E-mail: ");
                            String email2 = scanner.next();
                            heavyLifters = new HeavyLifters(nome2, email2);
                            Membros.add(heavyLifters);
                            break;

                        case 3:
                            System.out.println("Nome: ");
                            String nome3 = scanner.next();
                            System.out.println("E-mail: ");
                            String email3 = scanner.next();
                            scriptGuys = new ScriptGuys(nome3, email3);
                            Membros.add(scriptGuys);
                            break;

                        case 4:
                            System.out.println("Nome: ");
                            String nome4 = scanner.next();
                            System.out.println("E-mail: ");
                            String email4 = scanner.next();
                            bigBrothers = new BigBrothers(nome4, email4);
                            Membros.add(bigBrothers);
                            break;

                        default:
                            System.out.println("Cargo invalido");
                    }
                    menu();

                case 2:
                    for (Membro membro : Membros){
                        System.out.println(membro.apresentacao());
                    }
                    menu();
                    break;

                case 3:
                    for (Membro membro : Membros){
                        System.out.println("- " + membro.getNome());
                    }

                    System.out.println("nome: ");
                    String nome5 = scanner.next();
                    Membro pesquisa = null;
                    for (Membro membro : Membros){
                        if (nome5.equals(membro.getNome())){
                            pesquisa = membro;
                            break;
                        }
                    }
                    assert pesquisa != null;
                    System.out.println(pesquisa.getTurnos());
                    menu();

                case 4:
                    for (Membro membro : Membros){
                        System.out.println(membro.getNome() +": " + membro.getMensagem());
                    }
                    menu();
                    break;

                case 5:
                    // Lista de membros
                    for (Membro membro : Membros){
                        System.out.println(membro.apresentacao());
                    }

                    System.out.println("Nome: ");
                    String nome6 = scanner.next();

                    for (Membro membro : Membros) {
                        if (nome6.equals(membro.getNome())) {
                            if (membro.getTurnos() == Turnos.Regular) {
                                System.out.println("Mudanca de turno para extra");
                                membro.setTurnos(Turnos.Extra);
                                if (membro.getCargo() == Cargos.MobileMembers)
                                    membro.setMensagem(mobileMembers.postarMensagem());
                                else if (membro.getCargo() == Cargos.HeavyLifters)
                                    membro.setMensagem(heavyLifters.postarMensagem());
                                else if (membro.getCargo() == Cargos.ScriptGuys)
                                    membro.setMensagem(scriptGuys.postarMensagem());
                                else if (membro.getCargo() == Cargos.BigBrothers)
                                    membro.setMensagem(bigBrothers.postarMensagem());
                                break;

                            } else if (membro.getTurnos() == Turnos.Extra) {
                                System.out.println("Mudanca de turno para regular");
                                membro.setTurnos(Turnos.Regular);
                                if (membro.getCargo() == Cargos.MobileMembers)
                                    membro.setMensagem(mobileMembers.postarMensagem());
                                else if (membro.getCargo() == Cargos.HeavyLifters)
                                    membro.setMensagem(heavyLifters.postarMensagem());
                                else if (membro.getCargo() == Cargos.ScriptGuys)
                                    membro.setMensagem(scriptGuys.postarMensagem());
                                else if (membro.getCargo() == Cargos.BigBrothers)
                                    membro.setMensagem(bigBrothers.postarMensagem());
                                break;
                            }
                        }
                    }
                    menu();

                case 6:
                    int id = 0;
                    FileWriter fileWriter = new FileWriter("arquivo_super_Secreto_nao_abrir.csv", true);
                    fileWriter.write("Membros: \n");
                    for (Membro membro : Membros) {
                        id += 1;
                        fileWriter.append(String.valueOf(membro.getCargo())).append(" ; ").append(membro.getNome()).append(" ; ").append(String.valueOf(id)).append("\n");
                    }
                    System.out.println("Arquivo gerado/atualizado");
                    fileWriter.close();
                    menu();
                    break;

                default:
                    System.out.println("Opcao invalida");
                    menu();
            }
        }while (true);
    }
}
