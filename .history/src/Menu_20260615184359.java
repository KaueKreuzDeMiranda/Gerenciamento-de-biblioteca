import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);
    ArrayList<Material> materiais = new ArrayList<>();

    public void exibirMenu(){
        int opcao;

        System.out.println("O que você deseja fazer?");
        System.out.println("1 - Cadastrar Livro");
        System.out.println("2 - Cadastrar Revista");
        System.out.println("3 - Cadastrar DVD");
        System.out.println("4 - Listar Materiais");
        System.out.println("5 - Consultar Material por Código");
        System.out.println("6 - Realizar Empréstimo");
        System.out.println("7 - Realizar Devolução");
        System.out.println("8 - Alterar Dados de um Materia");
        System.out.println("9 - Excluir Material");
        System.out.println("10 - Gerar Relatório");
        System.out.println("0 - Encerrar Sistema");
        opcao = sc.nextInt();
        sc.nextLine();

        switch(opcao){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 0:
                break;
            default:
                System.out.println("Insira uma opção válida!");
        }
    }

    public void cadastrarLivro(){
        System.out.println("Insira o código do livro:");
        int codigo = sc.nextInt();
        System.out.println("Insira o título do livro:");
        sc.next
    }
}
