package util;

import model.Financiamento;

import java.util.InputMismatchException;
import java.util.Scanner;
///throws InputMismatchException

public class InterfaceUsuario {
    /// METODOS ENTRADA DE DADOS DO USUÁRIO

    private static final Scanner scanner = new Scanner(System.in);

    public static double valorImovelUsuario() {

        while (true) {
            try {
                System.out.print("Digite o valor do Imovel: ");
                double valorDeImovel = scanner.nextDouble();
                if (valorDeImovel > 0) {
                    return valorDeImovel;
                } else {
                    System.out.print("Valor invalido, digite um valor acima de 0: ");

                }
            } catch (InputMismatchException e) {
                System.out.print("Valor invalido, digite um valor acima de 0: ");
                scanner.next();

            }
        }
    }

    public static int prazoFinanciamentoImovel() {

        while (true) {
            try {
                System.out.print("Digite o tempo de financiamento em anos: ");
                int prazoFinanciamento = scanner.nextInt();
                if (prazoFinanciamento > 0) {
                    return prazoFinanciamento;
                } else {
                    System.out.print("Valor invalido, digite um valor acima de 0: ");

                }
            } catch (InputMismatchException e) {
                System.out.print("Valor invalido, digite um valor acima de 0: ");
                scanner.next();

            }
        }

    }    
    public static double taxaJurosAnualImovel() {
        while(true) {
            try {
                System.out.print("Digite o valor da taxa de juros anual: ");
                var taxaJurosAnual = scanner.nextDouble();
                if (taxaJurosAnual >= 0){
                    return taxaJurosAnual;
                } else {
                    System.out.print("Valor invalido, digite um valor acima de 0: ");

                }
            } catch (InputMismatchException e) {
                System.out.print("Valor invalido, digite um valor acima de 0: ");
                scanner.next();

            }
        }


    }

}    