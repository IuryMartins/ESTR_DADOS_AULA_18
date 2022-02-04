public class Lista {
    private String Nome;
    private String Descricao;

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    private Lista Prox;

    public Lista(){

    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public Lista getProx() {
        return Prox;
    }

    public void setProx(Lista prox) {
        Prox = prox;
    }
}
