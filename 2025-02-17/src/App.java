import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
        int x = 0;
        Scanner scanner = new Scanner(System.in);
        while (x == 0) {
            System.out.println(
                    "Digite o numero ao lado da opção desejada:\n1-Adicionar pessoa\n2-Listar pessoas\n3-Remover pessoa\n4-Acessar pessoa\n5-Total de Impostos\n6-Finalizar");
            int opcao = scanner.nextInt();
            if (opcao == 1) {
                Pessoa novaPessoa = Pessoa.criarPessoa();
                if (novaPessoa != null) {
                    pessoas.add(novaPessoa);
                }
            } else if (opcao == 2) {
                if (pessoas.size() == 0) {
                    System.out.println("Não há pessoas cadastradas!");
                } else {
                    for (int i = 0; i < pessoas.size(); i++) {
                        System.out.println("[" + i + "]Nome:" + pessoas.get(i).getNome() + " Renda anual:R$"
                                + pessoas.get(i).getRendaAnual());
                    }
                }

            } else if (opcao == 3) {
                if (pessoas.size() == 0) {
                    System.out.println("Não há pessoas cadastradas!");
                } else {
                    System.out.println("Digite o número à esquerda da pessoa a ser removida:");
                    for (int i = 0; i < pessoas.size(); i++) {
                        System.out.println("[" + i + "]Nome:" + pessoas.get(i).getNome());
                    }
                    int remover = scanner.nextInt();
                    pessoas.remove(remover);
                    System.out.println("Pessoa [" + remover + "] removida com sucesso!");
                }

            } else if (opcao == 4) {
                if (pessoas.size() == 0) {
                    System.out.println("Não há pessoas cadastradas!");
                } else {
                    System.out.println("Digite o número à esquerda da pessoa a ser acessada:");
                    for (int i = 0; i < pessoas.size(); i++) {
                        System.out.println("[" + i + "]Nome:" + pessoas.get(i).getNome());
                    }
                    int acessar = scanner.nextInt();
                    System.out.println(pessoas.get(acessar).pegarPessoa(pessoas.get(acessar)));
                }

            } else if (opcao == 5) {
                if (pessoas.size() == 0) {
                    System.out.println("Não há pessoas cadastradas!");
                } else {
                    double total = 0;
                    for (int i = 0; i < pessoas.size(); i++) {
                        total = total + pessoas.get(i).getImposto();
                    }
                    System.out.println("Total de impostos:R$" + total);
                }

            } else if (opcao == 6) {
                x = 1;

            } else {
                System.out.println("Operação inválida!");

            }

        }
        System.out.println("Programa finalizado.");
        scanner.close();
    }

}