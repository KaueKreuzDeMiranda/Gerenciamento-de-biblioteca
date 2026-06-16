public class Livro extends Material implements Emprestavel{
    private String autor;
    private int qntPaginas;

    public Livro(int codigo, String titulo, int anoPublicacao, String autor, int qntPaginas) {
        super(codigo, titulo, anoPublicacao);
        this.autor = autor;
        this.qntPaginas = qntPaginas;
    }

    @Override
    public void emprestar(){
        
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("\nCódigo: " + getCodigo());
        System.out.println("Título: " + getTitulo());
        System.out.println("Ano de publicação: " + getAnoPublicacao());
        System.out.println("Autor: " + autor);
        System.out.println("Quantidade de páginas: " + qntPaginas);
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getQntPaginas() {
        return qntPaginas;
    }

    public void setQntPaginas(int qntPaginas) {
        this.qntPaginas = qntPaginas;
    }
}
