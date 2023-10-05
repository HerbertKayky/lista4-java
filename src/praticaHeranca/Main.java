package praticaHeranca;

import java.util.ArrayList;
import java.util.Scanner;

class GerenciadorFuncionarios {
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void listarFuncionarios() {
        for (Funcionario f : funcionarios) {
            System.out.println(f.getNome() + " - Salário: " + f.getSalario());
        }
    }

    public void atualizarSalario(String nome, int novoSalario) {
        for (Funcionario f : funcionarios) {
            if (f.getNome().equals(nome)) {
                f.setSalario(novoSalario);
                System.out.println("Salário atualizado!");
                return;
            }
        }
        System.out.println("Funcionário não encontrado.");
    }

    public void removerFuncionario(String nome) {
        funcionarios.removeIf(f -> f.getNome().equals(nome));
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GerenciadorFuncionarios gerenciador = new GerenciadorFuncionarios();

        while (true) {
            System.out.println("Escolha uma opcao:");
            System.out.println("1. Adicionar Funcionário");
            System.out.println("2. Listar Funcionários");
            System.out.println("3. Atualizar Salário de um Funcionário");
            System.out.println("4. Remover Funcionário");
            System.out.println("5. Sair");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Escolha o tipo de funcionário: (1- Secretaria, 2- Gerente, 3- Telefonista)");
                    int tipo = scanner.nextInt();
                    scanner.nextLine();  

                    System.out.println("Digite o nome:");
                    String nome = scanner.nextLine();
                    System.out.println("Digite o salário:");
                    int salario = scanner.nextInt();
                    
                    if (tipo == 1) {
                        System.out.println("Digite o número do ramal:");
                        String ramal = scanner.next();
                        gerenciador.adicionarFuncionario(new Secretaria(nome, salario, ramal));
                    } else if (tipo == 2) {
                        System.out.println("Digite o login:");
                        String login = scanner.next();
                        System.out.println("Digite a senha:");
                        String senha = scanner.next();
                        gerenciador.adicionarFuncionario(new Gerente(nome, salario, login, senha));
                    } else if (tipo == 3) {
                        System.out.println("Digite o código:");
                        String codigo = scanner.next();
                        gerenciador.adicionarFuncionario(new Telefonista(nome, salario, codigo));
                    } else {
                        System.out.println("Tipo inválido!");
                    }
                    break;

                case 2:
                    gerenciador.listarFuncionarios();
                    break;

                case 3:
                    System.out.println("Digite o nome do funcionário:");
                    nome = scanner.next();
                    System.out.println("Digite o novo salário:");
                    salario = scanner.nextInt();

                    gerenciador.atualizarSalario(nome, salario);
                    break;

                case 4:
                    System.out.println("Digite o nome do funcionário que deseja remover:");
                    nome = scanner.next();

                    gerenciador.removerFuncionario(nome);
                    break;

                case 5:
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }
}

