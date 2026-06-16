public class DVD extends Material implements Emprestavel{
    private double duracao;
    private String classificacao;

    public DVD(int codigo, String titulo, int anoPublicacao, double duracao, String classificacao) {
        super(codigo, titulo, anoPublicacao);
        this.duracao = duracao;
        this.classificacao = classificacao;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("\nCódigo: " + getCodigo());
        System.out.println("Título: " + getTitulo());
        System.out.println("Ano de publicação: " + getAnoPublicacao());
        System.out.println("Duração: " + duracao);
        System.out.println("Class");
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
