public class Livro extends Material implements Emprestavel{
    public Livro(int codigo, String titulo, int anoPublicacao, boolean disponivel) {
        super(codigo, titulo, anoPublicacao, disponivel);
    }
    private String autor;
    private int qntPaginas;
    @Override
    public void mostrarInformacoes() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrarInformacoes'");
    }
}
