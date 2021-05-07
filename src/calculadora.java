import java.util.Scanner;

public class calculadora {

    public static void main(String[] args){

        int valorInvestido;
        int anuncioOriginal;
        int anuncioCompartilhado;
        float resultado;

        //entrada
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o valor de investimento");
        valorInvestido = input.nextInt();

        //a cada 20 pessoas que clicam no anúncio 3 compartilham nas redes sociais.
        //cada compartilhamento nas redes sociais gera 40 novas visualizações.
        //30 pessoas visualizam o anúncio original (não compartilhado) a cada R$ 1,00 investido.

        anuncioOriginal = 30; //qtd.visualizações
        anuncioCompartilhado = 120; //qtd.visualizações


        resultado =  (anuncioOriginal + anuncioCompartilhado) * valorInvestido;

        int numeroResultado = Math.round(resultado);
        System.out.println(numeroResultado+" Visualizações aproximadas com o valor investido!");



    }
}
