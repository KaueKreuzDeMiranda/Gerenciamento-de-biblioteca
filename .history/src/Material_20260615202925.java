public abstract class Material implements Emprestavel{
    private int codigo;
    private String titulo;
    private int anoPublicacao;
    private boolean disponivel;
    
    public Material(int codigo, String titulo, int anoPublicacao) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.disponivel = true;
    }

    public abstract void mostrarInformacoes();

    @Override
    public void emprestimo(){
        if(disponivel)
    }

    @Override
    public void devolucao(){

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
