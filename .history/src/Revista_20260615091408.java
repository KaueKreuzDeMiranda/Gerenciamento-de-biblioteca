public class Revista extends Material implements Emprestavel{
    public Revista(int codigo, String titulo, int anoPublicacao) {
        super(codigo, titulo, anoPublicacao);
        //TODO Auto-generated constructor stub
    }
    private String edicao;
    private String categoria;
    @Override
    public void mostrarInformacoes() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrarInformacoes'");
    }
}
