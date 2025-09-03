//Faça um programa que peça um número ao usuário. Exiba se esse número é Par ou Ímpar (use o operador de resto da divisão - mod)
import java.util.Scanner;
class Exercicio5{
    public static void main(String[] args){
        int numero1;
        Scanner s = new Scanner(System.in);
        System.out.print("Informe um número para saber se ele é par ou impar: ");
        numero1 = s.nextInt();
        if(numero1 % 2 == 0  ){
            System.out.println("O número é par");
        }else{
            System.out.println("O número é impar");
        }
        s.close();
//usado para fechar o terminal e parar de rodar o programa..
    }
}