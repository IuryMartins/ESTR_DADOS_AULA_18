public class ListaDinamica {
    Lista Primeiro;
    Lista Ultimo;
    int Tamanho = 0;

    public ListaDinamica() {
        Primeiro = null;
        Ultimo = Primeiro;
    }

    public void add(String nome, String descricao){
        if (Primeiro ==null){
            Primeiro = new Lista();
            Ultimo = Primeiro;
            Lista Novo = new Lista();
            Novo.setNome(nome);
            Novo.setDescricao(descricao);
            Novo.setProx(null);
            Ultimo.setProx(Novo);
            Ultimo = Novo;
            Tamanho++;
        }else {
            Lista Novo = new Lista();
            Novo.setNome(nome);
            Novo.setDescricao(descricao);
            Novo.setProx(null);
            Ultimo.setProx(Novo);
            Ultimo = Novo;
            Tamanho++;
        }
    }

    public void ImprimeLista(){
        Lista percorre = Primeiro.getProx();
        while (percorre != null){
            System.out.println("Palavra: " + percorre.getNome());
            System.out.println("Descrição: " + percorre.getDescricao()+ "\n");
            percorre = percorre.getProx();
        }
    }

    public void RemoveItem(String Nome){
        Lista remove = Primeiro.getProx();
        Lista sentinela = Primeiro;
        if (Primeiro == null){
            while (remove != null){
                if (remove.getNome().equals(Nome)){
                    if(remove.getProx() == null){
                        Ultimo = sentinela;
                        Ultimo.setProx(null);
                        remove = null;
                        Tamanho--;
                        break;
                    }else {
                        sentinela.setProx(remove.getProx());
                        remove.setProx(null);
                        remove = null;
                        Tamanho--;
                        break;
                    }
                }
                remove = remove.getProx();
                sentinela = sentinela.getProx();
            }
        }
    }

    public void buscaItem(String Nome){
        Lista percorre = Primeiro.getProx();
        int find = 0;
        while (percorre != null){
            if (percorre.getNome().equals(Nome)){
                System.out.println("Palavra: " + percorre.getNome());
                System.out.println("Descrição: " + percorre.getDescricao()+ "\n");
                find = 1;
                break;
            }
            percorre = percorre.getProx();
        }
        if (find !=1){
            System.out.println("Palavra não encontrada");
        }
    }
}
