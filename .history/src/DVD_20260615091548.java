public class DVD extends Material implements Emprestavel{

    
    public DVD(int codigo, String titulo, int anoPublicacao) {
        super(codigo, titulo, anoPublicacao);
    }

    @Override
    public void mostrarInformacoes() {
    }
    
}
