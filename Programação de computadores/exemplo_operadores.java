class exemplo_operadores{
    public static void main(String[] args){
int A;
int B;
A = 15;
B = 12;
System.out.println("Operações em JAVA:");
int soma;
soma = A + B;
System.out.println("Soma: " + soma);
int sub;
sub = A - B;
System.out.println("Subtração: " + sub);

int multi;
multi = A * B;
System.out.println("Multiplicação: " + multi);
//double usado quando há decimal,pode ser usado mas evitar para que não ocupe espaço/memoria.
double divi;
divi = A / B;
System.out.println("Divisão: " + divi);

double restodiv;
restodiv = A % B;
System.out.println("Resto da divisão: " + restodiv);
//Calculos com variaveis
// \n é usado para quebrar linha


//Operadores relacionais

System.out.println("Resultado das operações relacionais entre A e B:");
System.out.println("A: " + A + "\nB: " + B);

System.out.println( (A<B));

    }

}