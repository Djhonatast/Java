//Faça um programa que peça ao usuário um número inteiro qualquer. Se ele for maior que 10 e menor que 100, calcule a potência dele elevado a 2. Se ele for maior que 100 ou menor que 10, exiba a raiz quadrada do valor. Exiba os valores com 5 casas decimais.
class Exercicio9{
public static void main(String[] args){
    int opcao;
    String resultado;
     opcao = 3;
     switch(opcao){
        case 1:
        resultado = "opção 1";
        break;
        case 2:
        resultado = "opção 2";
        break;
        case 3:
        resultado = "opção 3";
        break;
        case 4:
        resultado = "opção 4";
        break;
        case 5:
        resultado = "opção 5";
        break;
        default :
        resultado = "opção inválida";
        break;
     }
     System.out.println("opção escolhida: " + resultado);
}
}