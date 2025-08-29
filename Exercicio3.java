
import java.util.Scanner;

class Exercicio3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double numero1;
        double numero2;
        double soma;
        double div;
        double sub;
        double multi;

        System.out.print("Informe o primeiro número; ");
        numero1 = s.nextDouble();
        System.out.print("Informe o segundo número: ");
        numero2 = s.nextDouble();

        soma = numero1 + numero2;
        System.out.println("Soma: " + soma);

        div = numero1 / numero2;
        System.out.println("Divisão: " + div);

        sub = numero1 - numero2;
        System.out.println("Subtração: " + sub);

        multi = numero1 * numero2;
        System.out.println("Multiplicação: " + multi);
    }
}
