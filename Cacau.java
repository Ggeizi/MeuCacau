package subpasta;


import util.InterfaceUsuario;
import model.Financiamento;

import java.util.ArrayList;
import java.util.List;



public class Cacau {
    public static void main(String[] args) {
        ///1. Dentro do método main() vocêdeve usar os métodos da classe InterfaceUsuario para ler os dados do financiamento.
        ///////////////InterfaceUsuario InterfaceUsuario = new InterfaceUsuario();
        List<Financiamento> listaDeFinanciamento = new ArrayList<Financiamento>(5);

        double valorImovel = InterfaceUsuario.valorImovelUsuario();
        int prazoFinanciamento = InterfaceUsuario.prazoFinanciamentoImovel();
        double taxaJurosAnual = InterfaceUsuario.taxaJurosAnualImovel();

        listaDeFinanciamento.add(new model.Financiamento( valorImovel, prazoFinanciamento, taxaJurosAnual));

        ///2. Após ler os dados do financiamento, instancie um objeto do tipo Financiamento para criar este financiamento.
        Financiamento novoFinanciamento = new Financiamento( valorImovel, prazoFinanciamento, taxaJurosAnual);
        double pagamentoMensal = novoFinanciamento.calculoPagamentoMensal();
        double pagamentoTotal = novoFinanciamento.calculoTotalDoPagamento();

        /// NOVOS DADOS
        String financiamento1 = new String("Financiamento1"); // Instancia com new
        String financiamento2 = new String("Financiamento2");
        String financiamento3 = new String("Financiamento3"); // Instancia com new
        String financiamento4 = new String("Financiamento4");


        String numb1 = financiamento1 + "valor do imóvel: R$ " + valorImovel + ", valor do financiamento: R$" + pagamentoTotal;
        System.out.println(numb1);

        String numb2 = financiamento2 + "valor do imóvel: R$ " + valorImovel + ", valor do financiamento: R$" + pagamentoTotal;
        System.out.println(numb2);

        String numb3 = financiamento3 + "valor do imóvel: R$ " + valorImovel + ", valor do financiamento: R$" + pagamentoTotal;
        System.out.println(numb3);

        String numb4 = financiamento4 + "valor do imóvel: R$ " + valorImovel + ", valor do financiamento: R$" + pagamentoTotal;
        System.out.println(numb4);







        ///SAÍDA DE DADOS PARA O USUÁRIO

        System.out.println("*******************************************\n" +
                "*******************************************");
        System.out.println("DADOS INSERIDOS PELO USUÁRIO");
        System.out.println("O valor do Imóvel é de: " + valorImovel);
        System.out.println("O prazo do Financiamento em anos é: " + prazoFinanciamento);
        System.out.println("O valor da taxa de juros Anual é de: " + taxaJurosAnual);

        System.out.println("*******************************************\n" +
                "*******************************************");
        System.out.println("RESULTADO DO FINANCIAMENTO...");
        System.out.printf("O valor mensal a ser pago será de: R$ %.2f\n", pagamentoMensal);
        System.out.printf("O valor total a ser pago será de: R$ %.2f\n", pagamentoTotal);



        System.out.println("*******************************************\n" +
                "*******************************************");
        System.out.println("RESULTADO DO FINANCIAMENTO...");
        System.out.printf("valor do imóvel: R$ %.2f, valor do financiamento: R$ %.2f", valorImovel, pagamentoTotal);





    }
}