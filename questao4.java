/*Faca um programa que pergunte ao usuário o numero de alunos a ser lido. O tamanho dos
vetores será o numero informado pelo usuário. Armazene num vetor as notas G1 destes
alunos; num outro vetor, armazene as notas G2 destes alunos. Ambas notas, G1 e G2, são
informadas pelo usuário. Calcule a media aritmética destes alunos e armazene num
terceiro vetor. Ao final, mostre as 3 notas dos alunos.  */

import java.util.Scanner;

public class questao4{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Qual a quantidade de alunos?");
        int qtd = input.nextInt();

        float[] G1 = new float[qtd];
        float[] G2 = new float[qtd];
        float[] media = new float [qtd];

        for (int i = 0; i < G1.length; i++){

            System.out.println("Digite a nota G1 do " + (i+1) + "º aluno:");
            G1[i] = input.nextFloat();
        }

        for (int i = 0; i < G2.length; i++){

            System.out.println("Digite a nota G2 do " + (i+1) + "º aluno:");
            G2[i] = input.nextFloat();
        }
        //media dna posiçao i = g1 na posição i + nota g2 na posição i / 2
        input.close();

        for (int i = 0; i < media.length; i++){
            media[i] = (G1[i] + G2[i]) / 2;
            System.out.println("\nNotas do " + (i+1) + "º aluno:");
            System.out.println("G1: " + G1[i] + "\nG2: " + G2[i]);
            System.out.println("Média: " + media[i]);
        }
    }
}