public class ListaEncadeada <T>{


    // Esse trecho é parte de um estudo de Estrutura de Dados
    // e Algoritmos, onde o objetivo é criar uma lista encadeada
    //
    // Um LikedList é uma estrutura de dados linear onde cada elemento representa um nó
    // e cada nó contém um valor e uma referência para o próximo nó na lista.
    //cada lista encadeada é composta por nós, onde cada nó contém um valor e uma referência para o próximo nó na lista.
    // A lista encadeada é uma estrutura de dados dinâmica, o que significa que ela pode crescer e encolher conforme necessário.

    // As ligações entre os nós é feita pelos ponteiros ou referências, que são variáveis que armazenam o endereço de memória do próximo nó na lista.

    private No<T> inicio;

    private No<T> fim; // nó que irá referenciar o fim da lista

    private int tamanho; // objeto que irá retornar o tamanho da Lista


    public int getTamanho(){
        return this.tamanho;
    }

    public void Adiciona(T elemento){
        // Metodo que faz a adição do novo elemento no final da lista
        // Uma lista sempre começa com o item inicial como null

        No<T> celula = new No<T>(elemento); // passa o elemento do nó inicial

        if(this.tamanho == 0){

            this.inicio = celula;
        }else {

            this.fim.setProximo(celula);

        }
        this.fim = celula; // o fim da lista agora é o novo nó
        this.tamanho++; // incrementar o tamanho da Lista



}


public void Limpa(){
    // Metodo que limpa a lista encadeada

    for(No<T> atual = this.inicio ; atual != null;){
        No<T> proximo = atual.getProximo();  // guarda o proximo nó;
        atual.setElemento(null); // limpa o elemento atual
        atual.setProximo(null); // limpa o nó atual
        atual = proximo; // atualiza o nó atual para o próximo nó


        // esse loop for diz que atual é igual ao inicio da lista , e enquanto ele não for nulo, ira fazer o loop pulando para o proximo nó
    }

    // somente esse trecho aqui ja limpa a lista, mas para o exemplo ficar mais completo e treinar logica de programação, foi ensinado o loop for gerenciando cada espaço da memoria
    this.inicio = null;
    this.fim = null; // limpa o fim da lista
    this.tamanho = 0 ;

}


public T buscaPosicao(T elemento){
        No<T> atual = this.inicio; // variável que irá percorrer a lista - o ponteiro
        int posicao = 0; // variável que irá armazenar a posição do elemento
        while(atual != null){
        if(atual.getElemento().equals(elemento)){
            System.out.println("Elemento encontrado na posição: " + posicao);
            return atual.getElemento(); // retorna o elemento se for encontrado
        }else{
            atual = atual.getProximo();
            posicao++; // incrementa a posição se o elemento não for encontrado

        }

    }
        System.out.println("Posição do Elemento não encontrada: " + elemento);
        return null;
}


public T BuscaporElemento(T elemento) {

    // Logica do metodo que irá buscar um elemento da Lista e retornar - caso não encontre ,retorna null;

    No<T> atual = this.inicio; // variável que irá percorrer a lista - o ponteiro - mesma logica do toString e Limpa()
    while (atual != null) {
        if (atual.getElemento().equals(elemento)) {
            System.out.println("Elemento encontrado: " + atual.getElemento());
            return elemento; // retorna o nó atual se o elemento for encontrado
        } else {

            atual = atual.getProximo(); // se não for encontrado, atualiza o ponteiro para o próximo nó
        }

    }
    System.out.println("Elemento não encontrado: " + elemento);
    return null;
}


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ListaEncadeada [");

        No<T> atual = inicio; // variável que irá percorrer a lista - o ponteiro
        while(atual != null){
            sb.append(atual);
            if(atual.getProximo() != null){
                sb.append(" -> "); // se o próximo nó não for nulo, adiciona a seta
            }
            atual = atual.getProximo();
        }

        sb.append(']');
        return sb.toString();

    }


}
