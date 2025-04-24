import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        gerente gerente = new gerente();
        desenvolvedor desenvolvedor = new desenvolvedor();
        estagiario estagiario = new estagiario();
        int i = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1: Cadastro");
        System.out.println("2: Login");
        System.out.println("3: Sair");
        funcionario funcionario = new funcionario();
        while (i <= 0) {
            int x = scan.nextInt();
            switch (x) {
                case 1:
                    System.out.println("Digite seu CPF:");
                    funcionario.cpf = scan.next();
                    System.out.println("Digite seu Nome:");
                    funcionario.nome = scan.next();
                    System.out.println("Digite seu Departamento:");
                    funcionario.departamento = scan.next();
                    System.out.println("Digite o dia de nascimento:");
                    int dia = scan.nextInt();
                    System.out.println("Digite o mês de nascimento:");
                    int mes = scan.nextInt();
                    System.out.println("Digite o ano de nascimento:");
                    int ano = scan.nextInt();
                    funcionario.dataNascimento = new DataNascimento(dia, mes, ano);
                    funcionario.mostrarDados();
                    System.out.println("Cadastre sua função:");
                    System.out.println("1: Estagiario");
                    System.out.println("2: Desenvolvedor");
                    System.out.println("3: Gerente");
                    int funcao = scan.nextInt();
                    switch (funcao) {
                        case 1:
                            funcionario.salario = 1.518;
                            System.out.println("Estagiario cadastrado");
                            break;

                        case 2:
                            funcionario.salario = 2.100;
                            System.out.println("Desenvolvedor cadastrado");
                            break;
                        case 3:
                            funcionario.salario = 3.000;
                            System.out.println("Gerente cadastrado");
                            break;

                        default:
                            System.out.println("Invalido, Tente Novamente");
                    }
                    break;

                case 2:
                    if (funcionario.salario == 1.518) {
                        System.out.println("Estagiario Logado");
                        System.out.println("Menu");
                        System.out.println("1: Bater Ponto");
                        System.out.println("2: Fazer Tarefa");
                        System.out.println("3: Mostrar Dados");
                        System.out.println("4: Deslogar");
                        int est = scan.nextInt();
                        switch (est) {
                            case 1:
                                funcionario.baterponto();
                            case 2:
                                estagiario.fazerTarefa();
                            case 3:
                                funcionario.mostrarDados();
                            case 4:
                                System.out.println("Deslogando...");
                                break;
                            default:
                                System.out.println("Opção Invalida.");
                        }
                    } else if (funcionario.salario == 2.100) {
                        System.out.println("Desenvolvedor Logado");
                        System.out.println("Menu");
                        System.out.println("1: Bater Ponto");
                        System.out.println("2: Fazer Tarefa");
                        System.out.println("3: Mostrar Dados");
                        System.out.println("4: Deslogar");
                        int des = scan.nextInt();
                        switch (des) {
                            case 1:
                                desenvolvedor.baterponto();
                            case 2:
                                desenvolvedor.programar();
                            case 3:
                                funcionario.mostrarDados();
                            case 4:
                                System.out.println("Deslogando...");
                                break;
                            default:
                                System.out.println("Opção Invalida.");
                        }
                    } else if (funcionario.salario == 3.000) {
                        System.out.println("Gerente Logado");
                        System.out.println("Menu");
                        System.out.println("1: Bater Ponto");
                        System.out.println("2: Fazer Reunião");
                        System.out.println("3: Mostrar Dados");
                        System.out.println("4: Deslogar");
                        int ger = scan.nextInt();
                        switch (ger) {
                            case 1:
                                funcionario.baterponto();
                            case 2:
                                gerente.fazerReuniao();
                            case 3:
                                funcionario.mostrarDados();
                            case 4:
                                System.out.println("Deslogando...");
                                break;

                            default:
                                System.out.println("Opção Invalida.");
                        }
                    } else {
                        System.out.println("Funcionario não existe");
                    }
                    break;

                case 3:
                    System.out.println("Saindo...");
                    i++;
                    break;

                default:
                    System.out.println("Invalido, Tente Novamente");
                    break;
            }
        }
    }

}