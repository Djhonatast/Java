//Faça um programa que peça ao usuário o valor do relógio de água de uma residência no dia 1º do mês e no dia 30º do mesmo mês. Depois mostre quantos litros foram consumidos e a média por dia. considere 30 dias.

import java.util.Scanner;

class Exercicio8 {

    public static void main(String[] args) {
        double leiturainicial, leiturafinal;
        double media, consumo;
        Scanner s = new Scanner(System.in);
        System.out.print("Informe a leitura inicial: ");
        leiturainicial = s.nextDouble();
        System.out.print("Informe a leitura final: ");
        leiturafinal = s.nextDouble();
        consumo = leiturafinal - leiturainicial;
        media = consumo / 30;
        System.out.print("Litros consumidos: " + consumo + " Litros" + " Média diária: " + media + " Litros");

    }
}
