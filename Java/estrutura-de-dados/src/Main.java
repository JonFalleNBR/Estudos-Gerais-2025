import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        String nome;
//
//        System.out.println("Informe seu nome: ");
//        nome = sc.nextLine();
//
//        System.out.println("Ola " + nome)


        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.Adiciona(1);

        System.out.println(lista);
        System.out.println("Tamanho da Lista: " + lista.getTamanho());

    }
}