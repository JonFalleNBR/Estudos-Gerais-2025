import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.Adiciona(1);


        lista.Adiciona(2);


        lista.Adiciona(3);


        lista.Adiciona(4);

        System.out.println(lista);
        System.out.println("Tamanho da Lista: " + lista.getTamanho());

        lista.Limpa();

        System.out.println(lista);
        System.out.println("Tamanho da Lista: " + lista.getTamanho());


    }
}