
import java.util.Scanner;

class Exercicio2 {

    public static void main(String[] args) {
        //Variaveis
        String nome;
        int idade;
        String genero;
        String cor;
        String esporte;
//Entrada de dados
        Scanner s = new Scanner(System.in);
//Mostrar ao usuário
        System.out.print("Informe seu nome: ");
        nome = s.next();

        System.out.print("Informe sua idade ");
        //funcionar a entrada de dados
        idade = s.nextInt();

        System.out.print("Informe seu genêro: ");
//funcionar a entrada de dados
        genero = s.next();

        System.out.print("Informe sua cor favorita: ");
//funcionar a entrada de dados
        cor = s.next();

        System.out.print("Você pratica esportes?");
//funcionar a entrada de dados
        esporte = s.next();

        System.out.println("Informações informadas: ");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Genêro: " + genero);
        System.out.println("Cor: " + cor);
        System.out.println("Esporte: " + esporte);

    }
}
