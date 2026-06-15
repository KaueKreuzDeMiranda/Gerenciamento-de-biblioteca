public class Revista extends Material implements Emprestavel{
    private String edicao;
    private String categoria;

    public Revista(int codigo, String titulo, int anoPublicacao) {
        super(codigo, titulo, anoPublicacao);
    }

    @Override
    public void mostrarInformacoes() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrarInformacoes'");
    }
}
