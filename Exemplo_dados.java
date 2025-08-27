//Criar as variaveis para cada tipo primitivo, peça ao usuario os valores e depois mostre na tela os valores informados pelo usuário.
import java.util.Scanner;
class Exemplo_dados{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int ex_inteiro;
        char ex_char;
        String texto;
        double decimal;
        boolean booleano;

        System.out.print("Informe um valor inteiro: ");
        ex_inteiro = s.nextInt();
        System.out.println("Valor informado: " + ex_inteiro);

        System.out.print("Informe um caracter " );
        ex_char = s.next().charAt(0);
        System.out.println("Caracter informado: " + ex_char);

        System.out.print("Informe uma palavra: ");
        texto = s.next();
        System.out.println("Palavra informada: " + texto);

        System.out.print("Informe um numero decimal: ");
        decimal = s.nextDouble();
        System.out.println("Valor informado: " + decimal);

        System.out.print("Informe um valor booleano: ");
        booleano = s.nextBoolean();
        System.out.println("Valor booleano informado: " + booleano);


    }
}