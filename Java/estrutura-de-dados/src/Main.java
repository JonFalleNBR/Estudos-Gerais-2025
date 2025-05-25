public class Main {
    public static void main(String[] args) {

        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.adiciona(1);


        lista.adiciona(2);


        lista.adiciona(3);


        lista.adiciona(4);

       // lista.Limpa();

        lista.buscaporElemento(6);

        lista.buscaPosicao(1);

        System.out.println(lista);
        System.out.println("Tamanho da Lista: " + lista.getTamanho());

    }
}