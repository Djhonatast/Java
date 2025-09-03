//Faça um programa que peça ao usuário dois números (num1 e num2) e depois exiba o resultado das operações relacionais maior que, menor que, igual e diferente
import java.util.Scanner;
class Exercicio7{
    public static void main(String[] args){
Scanner s = new Scanner(System.in);
double num1;
double num2;

System.out.print("Informe o primeiro número: ");
num1 = s.nextDouble();
System.out.print("Informe o segundo número: ");
num2 = s.nextDouble();

System.out.println("num1 > num2: " + (num1 > num2));
System.out.println("num1 < num2: " + (num1 < num2));
System.out.println("num1 == num2: " + (num1 == num2));
System.out.println("num1 != num2: " + (num1 != num2));
    }
}