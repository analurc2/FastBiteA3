package A_MenuInicial;
import java.util.Scanner;
import A_MenuInicial.FastBite;

public class FastBite {



    // Dados do usuário
    public static String usuarioCadastrado = "";
    public static String senhaCadastrada = "";
    public static String telefoneCadastrado = "";
    public static String cepCadastrado = "";
    public static boolean primeiroPedido = true;

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println(Cores.RED +
                "\n███████╗ █████╗ ███████╗████████╗██████╗ ██╗████████╗███████╗\n" +
                "██╔════╝██╔══██╗██╔════╝╚══██╔══╝██╔══██╗██║╚══██╔══╝██╔════╝\n" +
                "█████╗  ███████║███████╗   ██║   ██████╔╝██║   ██║   █████╗\n" +
                "██╔══╝  ██╔══██║╚════██║   ██║   ██╔══██╗██║   ██║   ██╔══╝\n" +
                "██║     ██║  ██║███████║   ██║   ██████╔╝██║   ██║   ███████╗\n" +
                "╚═╝     ╚═╝  ╚═╝╚══════╝   ╚═╝   ╚═════╝ ╚═╝   ╚═╝   ╚══════╝");

        Thread.sleep(2000);

        System.out.println(Cores.CYAN +
                "\n FASTBITE");
        System.out.println(Cores.CYAN + "Seu delivery rápido e inteligente." + Cores.RESET);
        System.out.println(Cores.CYAN + " PRIMEIRO PEDIDO COM 60% DE DESCONTO!" + Cores.RESET);

        Thread.sleep(1500);

        int opcao = 0;

        while (opcao != 4) {

            System.out.println(Cores.CYAN + "\n========== MENU ==========" + Cores.RESET);
            System.out.println(Cores.CYAN + "[1] Cadastrar" + Cores.RESET);
            System.out.println(Cores.CYAN + "[2] Fazer Login" + Cores.RESET);
            System.out.println(Cores.CYAN + "[3] Entrar como visitante" + Cores.RESET);
            System.out.println(Cores.CYAN + "[4] Sair" + Cores.RESET);

            System.out.print("\nEscolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:

                    System.out.println(Cores.GREEN + "\n===== CADASTRO =====" + Cores.RESET);

                    System.out.print("Crie um usuário: ");
                    usuarioCadastrado = sc.nextLine();

                    String telefone;
                        do {
                            System.out.print("Telefone: ");
                            telefone = sc.nextLine();

                            if(telefone.length() != 11) {
                                System.out.println(Cores.RED + "Telefone invalido! Digite exatamente 11 numeros." + Cores.RESET);
                            } 
                            else if(!telefone.matches("[0-9]+")) {
                                System.out.println(Cores.RED + "Digite apenas numeros!" + Cores.RESET);
                                telefone = "";
                                }
                            } 
                        while(telefone.length() != 11);
                        telefoneCadastrado = telefone;

                    String cep;
                        do {
                            System.out.print("CEP: ");
                            cep = sc.nextLine();

                            if(cep.length() != 8) {
                                System.out.println(Cores.RED + "CEP invalido! Digite exatamente 8 numeros." + Cores.RESET);
                            }
                            else if(!cep.matches("[0-9]+")) {
                                System.out.println(Cores.RED + "Digite apenas numeros!" + Cores.RESET);
                                cep = "";
                            }
                        } 
                        while(cep.length() != 8);
                            cepCadastrado = cep;

                    System.out.print("Crie uma senha: ");
                    senhaCadastrada = sc.nextLine();

                    System.out.println(Cores.GREEN + "\n Cadastro realizado com sucesso!" +
                            Cores.RESET);

                    break;

                case 2:

                    System.out.println(Cores.PURPLE +
                            "\n===== LOGIN =====" +
                            Cores.RESET);

                    System.out.print("Usuário: ");
                    String usuarioLogin = sc.nextLine();

                    System.out.print("Senha: ");
                    String senhaLogin = sc.nextLine();

                    if(usuarioLogin.equals(usuarioCadastrado)
                        && senhaLogin.equals(senhaCadastrada)) {
                
                    System.out.println(Cores.GREEN +
                            "\n Login realizado com sucesso!" +
                            Cores.RESET);
                
                    Menuapp.exibirMenu(sc);
                
                

                    } else {

                        System.out.println(Cores.RED +
                                "\n Usuário ou senha incorretos." +
                                Cores.RESET);
                    }

                    break;

                case 3:

                    System.out.println(Cores.YELLOW +
                            "\nEntrando como visitante..." +
                            Cores.RESET);
                    Menuapp.exibirMenu(sc);
                    break;

                case 4:

                    System.out.println(Cores.GREEN +
                            "\nObrigado por usar o FASTBITE " +
                            Cores.RESET);

                    break;

                default:

                    System.out.println(Cores.RED +
                            "\n Opção inválida." +
                            Cores.RESET);
            }
        }

        sc.close();
    }
}

