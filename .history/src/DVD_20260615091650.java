public class DVD extends Material implements Emprestavel{
    private double duracao;
    private String classificacao;

    public DVD(int codigo, String titulo, int anoPublicacao) {
        super(codigo, titulo, anoPublicacao);
        this.duracao = duracao;
        this.
    }

    @Override
    public void mostrarInformacoes() {
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }
}
