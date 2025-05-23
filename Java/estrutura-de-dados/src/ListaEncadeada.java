public class ListaEncadeada <T>{


    // Esse trecho é parte de um estudo simples de Estrutura de Dados
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
