public class Revista extends Material implements Emprestavel{
    private String edicao;
    private String categoria;

    public Revista(int codigo, String titulo, int anoPublicacao, String edicao, String categoria) {
        super(codigo, titulo, anoPublicacao);
        this.edicao = edicao;
        this.categoria = categoria;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("\nCódigo: " + getCodigo());
        System.out.println("Título: " + getTitulo());
        System.out.println("Ano de publicação: " + getAnoPublicacao());
        System.out.println("Edição: " + edicao);
        System.out.println("Categoria: ");
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
