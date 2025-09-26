package org.example;

import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Esse eh o desafio proposto pela Atech para a vaga de Analise de Suporte

        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.nextLine().trim());

        String[] lineE = sc.nextLine().trim().split("\\s+");
        String[] lineS = sc.nextLine().trim().split("\\s+");


        if (lineE.length != N || lineS.length != N) {
            System.out.println("Entrada inválida");
            return;
        }


        int[] E = new int[N];
        int[] S = new int[N];
        for (int k = 0; k < N; k++) {
            E[k] = Integer.parseInt(lineE[k]);
            S[k] = Integer.parseInt(lineS[k]);
        }

        int resposta = Capacidade.maxCapacidadeSim(N, E, S);

        System.out.println(resposta);
    }

    public static class Capacidade{


        public static int maxCapacidadeSim(int N, int[] E, int[] S){

            int[] input = Arrays.copyOf(E, N);
            int[] output = Arrays.copyOf(S, N);

            Arrays.sort(input);
            Arrays.sort(output);

            int i = 0;
            int j = 0;
            int pico = 0;
            int atual = 0;


            while (i < N && j < N){

                if(input[i] < output[j]){
                    atual++;
                    pico = Math.max(pico, atual);
                    i++;

                    if(atual > pico){
                        pico = atual;
                    }
                } else {
                    atual--;
                    j++;
                }

            }
            return pico;
        }

    }
}