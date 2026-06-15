public class Revista extends Material implements Emprestavel{
    private String edicao;
    private String categoria;

    public Revista(int codigo, String titulo, int anoPublicacao) {
        super(codigo, titulo, anoPublicacao);
        this.
    }

    @Override
    public void mostrarInformacoes() {

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
