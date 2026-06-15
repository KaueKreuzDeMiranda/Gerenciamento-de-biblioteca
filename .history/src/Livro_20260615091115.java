public class Livro extends Material implements Emprestavel{
    private String autor;
    private int qntPaginas;

    public Livro(int codigo, String titulo, int anoPublicacao) {
        super(codigo, titulo, anoPublicacao, disponivel);
        this.autor = autor;
        this.qntPaginas = qntPaginas;
    }

    @Override
    public void mostrarInformacoes() {
        throw new UnsupportedOperationException("Unimplemented method 'mostrarInformacoes'");
    }
}
