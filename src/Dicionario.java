public class Dicionario {
ListaDinamica Vetor[];
public Dicionario(){
    Vetor = new ListaDinamica[26];
    inicializaLista();
}
final void inicializaLista(){
    for (int i=0;i<26;i++){
        Vetor[i]=new ListaDinamica();
    }
}

final int funcaoHash(String palavra){
    //calcular o valor hash da minha palavra
    palavra = palavra.toLowerCase();
    int posicao = palavra.charAt(0);

    return posicao - 97;
}
final void addTabela(String palavra, String descricao){
    Vetor[funcaoHash(palavra)].add(palavra, descricao);
}

  final void excluiItem(String palavra){
      System.out.println("****Itens nesse indice:****\n");
      Vetor[funcaoHash(palavra)].ImprimeLista();
      Vetor[funcaoHash(palavra)].RemoveItem(palavra);
      System.out.println("****Itens nesse indice após excluir:****\n");
      Vetor[funcaoHash(palavra)].ImprimeLista();
  }

    final void buscaPalavra(String palavra){
    Vetor[funcaoHash(palavra)].buscaItem(palavra);
    }

    public static void main(String[] args) {
        Dicionario teste = new Dicionario();
        teste.addTabela("Alienado","Aquele que sofre de alienação mental");
        teste.addTabela("Apatico","que apresenta apatia");

        teste.Vetor[0].ImprimeLista();
        teste.excluiItem("Alienado");
        teste.buscaPalavra("Apatico");
    }
}
