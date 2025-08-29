
import java.util.Scanner;

class Exercicio4 {



    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1;
        int num2;
        System.out.print("Informe o primeiro número: ");
        num1 = s.nextInt();
        System.out.print("Informe o segundo número; ");
        num2 = s.nextInt();

        if(num1 > num2){
            System.out.print("Número 1 é maior que número 2");
        } else{
            if(num1 == num2){
System.out.print("Número 1 é igual ao número 2");
            } else{ System.out.print("Número 1 é menor que número 2");}
        }
       
    }
}
