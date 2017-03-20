package br.com.satc;
import java.text.DecimalFormat;
import java.util.Scanner;
/**
 *
 * @author Markson
 */
public class Main {
    public static void main(String[] args) {
        DecimalFormat formato = new DecimalFormat("R$0.00");
        Scanner entradaDeDados = new Scanner(System.in);
        System.out.println("Valor do produto: ");
        double valorProduto = entradaDeDados.nextDouble();
        System.out.println("É BR? [S/N]");
        char nacionalidadeProduto
                = entradaDeDados.next().toUpperCase().charAt(0);
        if (!(nacionalidadeProduto == 'S')) {
            double imposto = valorProduto * 0.5;
            System.out.println("Valor do produto sem imposto: "
                    + formato.format(valorProduto - imposto));
            System.out.println("Valor do imposto: " + formato.format(imposto));
        } else {
            if (valorProduto < 1000) {
                double imposto = valorProduto * 0.1;
                System.out.println("Valor do produto sem imposto: "
                        + formato.format(valorProduto - imposto));
                System.out.println("Valor do imposto: " + formato.format(imposto));
            } else {
                double imposto = valorProduto * 0.15;
                System.out.println("Valor do produto sem imposto: "
                        + formato.format(valorProduto - imposto));
                System.out.println("Valor do imposto: " + formato.format(imposto));
            }
        }
    }
}