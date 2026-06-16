import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);
    ArrayList<Material> materiais = new ArrayList<>();

    public void exibirMenu(){
        int opcao;

        System.out.println("\nO que você deseja fazer?");
        System.out.println("1 - Cadastrar Livro");
        System.out.println("2 - Cadastrar Revista");
        System.out.println("3 - Cadastrar DVD");
        System.out.println("4 - Listar Materiais");
        System.out.println("5 - Consultar Material por Código");
        System.out.println("6 - Realizar Empréstimo");
        System.out.println("7 - Realizar Devolução");
        System.out.println("8 - Alterar Dados de um Material");
        System.out.println("9 - Excluir Material");
        System.out.println("10 - Gerar Relatório");
        System.out.println("0 - Encerrar Sistema");
        opcao = sc.nextInt();
        sc.nextLine();

        switch(opcao){
            case 1:
                cadastrarLivro();
                break;
            case 2:
                cadastrarRevista();
                break;
            case 3:
                cadastrarDVD();
                break;
            case 4:
                listarMateriais();
                break;
            case 5:
                consultaCodigo();
                break;
            case 6:
                emprestimo();
                break;
            case 7:
                devolucao();
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
                System.out.println("\nInsira uma opção válida!");
        }
    }

    public void cadastrarLivro(){
        System.out.println("\nInsira o código do livro:");
        int codigo = sc.nextInt();

        System.out.println("\nInsira o título do livro:");
        sc.nextLine();
        String titulo = sc.nextLine();

        System.out.println("\nInsira o ano de publicação do livro:");
        int anoPublicacao = sc.nextInt();

        System.out.println("\nInsira o autor do livro:");
        sc.nextLine();
        String autor = sc.nextLine();

        System.out.println("\nInsira a quantidade de páginas do livro:");
        int qntPaginas = sc.nextInt();

        materiais.add(new Livro(codigo, titulo, anoPublicacao, autor, qntPaginas));
    }

    public void cadastrarRevista(){
        System.out.println("\nInsira o código da revista:");
        int codigo = sc.nextInt();

        System.out.println("\nInsira o título da revista:");
        sc.nextLine();
        String titulo = sc.nextLine();

        System.out.println("\nInsira o ano de publicação da revista:");
        int anoPublicacao = sc.nextInt();

        System.out.println("\nInsira a edição da revista:");
        sc.nextLine();
        String edicao = sc.nextLine();

        System.out.println("\nInsira a categoria da revista:");
        sc.nextLine();
        String categoria = sc.nextLine();

        materiais.add(new Revista(codigo, titulo, anoPublicacao, edicao, categoria));
    }

    public void cadastrarDVD(){
        System.out.println("\nInsira o código do DVD:");
        int codigo = sc.nextInt();

        System.out.println("\nInsira o título do DVD:");
        sc.nextLine();
        String titulo = sc.nextLine();

        System.out.println("\nInsira o ano de publicação do DVD:");
        int anoPublicacao = sc.nextInt();

        System.out.println("\nInsira a duração do DVD:");
        double duracao = sc.nextDouble();

        System.out.println("\nInsira a classificação do DVD:");
        sc.nextLine();
        String classificacao = sc.nextLine();

        materiais.add(new DVD(codigo, titulo, anoPublicacao, duracao, classificacao));
    }

    public void listarMateriais(){
        System.out.println("\nLista dos materiais:");

        for(Material material : materiais){
            material.mostrarInformacoes();
        }
    }

    public void consultaCodigo(){
        System.out.println("Insira o código da máquina que você deseja buscar:");
        int codigo = sc.nextInt();

        Material material = procurarMaquina(codigo);

        if(material != null){
            material.mostrarInformacoes();
        }else{
            System.out.println("\nMaterial não encontrado!");
        }
    }

    public void emprestimo(){
        System.out.println("Insira o código da máquina que você deseja buscar:");
        int codigo = sc.nextInt();

        Material material = procurarMaquina(codigo);

        if(material != null){
            material.emprestimo();
        }else{
            System.out.println("\nMaterial não encontrado!");
        }
    }

    public void devolucao(){
        System.out.println("Insira o código da máquina que você deseja buscar:");
        int codigo = sc.nextInt();

        Material material = procurarMaquina(codigo);

        material.devolucao();
    }

    public void alterarDados(){

    }

    private Material procurarMaquina(int codigo){
        for(Material material : materiais){
            if(codigo == material.getCodigo()){
                return material;
            }
        }

        return null;
    } 
}
