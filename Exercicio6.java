//Faça um programa que peça ao usuário um número inteiro qualquer e exiba esse número elevado a 2, 4, 6, 8 e 10 (use a biblioteca Math).
import java.util.Scanner;
class Exercicio6{
    public static void main(String[] args){
int numero1;
double result2;
double result4;
double result6;
double result8;
double result10;
Scanner s = new Scanner(System.in);
System.out.print("Informe um número inteiro: ");
numero1 = s.nextInt();
result2 = Math.pow(numero1, 2);
result4 = Math.pow(numero1, 4);
result6 = Math.pow(numero1 , 6);
result8 = Math.pow(numero1, 8);
result10 = Math.pow(numero1, 10);
System.out.println("Resultados: " + numero1 + " Elevado a 2: " + result2 + " " + numero1 + " Elevado a 4: " + result4 + " " +  numero1 + " Elevado a 6: " + result6 + " " +  numero1 + " Elevado a 8: " + result8 + " " +  numero1 + " Elevado a 10: " + result10 + " ");
}
}