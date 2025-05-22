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



    public void Adiciona(T elemento){
        // Metodo que faz a adição do novo elemento no final da lista
        // Uma lista sempre começa com o item inicial como null

        No<T> celula = new No<T>(elemento); // passa o elemento do nó inicial

    // apontar o inicio para o nó

    this.inicio = celula;
}


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ListaEncadeada{");
        sb.append("inicio=").append(inicio); // imprime o nó inicial
        sb.append('}');
        return sb.toString();
    }


}
