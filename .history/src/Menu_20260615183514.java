import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);
    ArrayList<Material> materiais = new ArrayList<>();

    public void exibirMenu(){
        System.out.println("O que você deseja fazer?");
        System.out.println("1 - Cadastrar Livro");
        System.out.println("1 - Cadastrar Revista");
        System.out.println("1 - Cadastrar DVD");
        System.out.println("1 - Listar Materiais");
        System.out.println("1 - Consultar Material por Código");
        System.out.println("1 - Realizar Empréstimo");
        System.out.println("1 - Cadastrar Livro");
        System.out.println("1 - Cadastrar Livro");
        System.out.println("1 - Cadastrar Livro");
        System.out.println("1 - Cadastrar Livro");
        System.out.println("0 - Sair");
    }
}
