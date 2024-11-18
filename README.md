


import java.util.Scanner;
/*
i. This class represents financing.
ii. Ela deve conter três atributos: valorImovel (double), prazoFinanciamento (int) e taxaJurosAnual (double).
iii. Deve conter pelo menos três métodos: um construtor para inicializar esses atributos, um
método para calcular o pagamento mensal, e outro método para calcular o total do pagamento.
 */


class Financiamento{
    double valorImovel;
    int prazoFinanciamento;
    double taxaJurosAnual;
    ///METODO FINANCIAMENTO
    Financiamento(double valorDeImovel, int prazoFinanciamento, double taxaJurosAnual){
        this.valorImovel = valorDeImovel;
        this.prazoFinanciamento = prazoFinanciamento;
        this.taxaJurosAnual = taxaJurosAnual;
    }
    ///1. Pagamento mensal = (valor do imóvel / (prazo do financiamento em anos * 12)) * (1 + (taxa anual / 12))
    ///
    double calculoPagamentoMensal (){
        return (this.valorImovel/(this.prazoFinanciamento*12))*(1+(this.taxaJurosAnual/12));
    }
    ///2. Total do pagamento = pagamento mensal * prazo do financiamento em anos * 12
    double calculoTotalDoPagamento (){
        return this.calculoPagamentoMensal() * this.prazoFinanciamento * 12;
    }
}

/*
b. Classe InterfaceUsuario:

i. Esta classe é responsável por lidar com a entrada de dados do usuário.
Estes dados podem ser recebidos via entrada do usuário usando o Scanner.
 */

class InterfaceUsuario {
    ///METODOS ENTRADA DE DADOS DO USUÁRIO
    /*
1. Pedir ao usuário o valor do imóvel: Ela deve conter um método o
qual pede ao usuário para que digite o valor do imóvel, e retorne o valor digitado pelo usuário.
     */
    double valorImovelUsuario(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do Imovel: ");
        double valorDeImovel = scanner.nextDouble();
        return valorDeImovel;
    }
    /*
2. Pedir ao usuário o prazo do financiamento: Ela deve conter um método o
qual pede ao usuário para que digite o prazo do financiamento em anos, e retorne o valor digitado pelo usuário.
     */
    int prazoFinanciamentoImovel() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tempo de financiamento em anos: ");
        int prazoFinanciamento = scanner.nextInt();
        return prazoFinanciamento;
    }
    /*
3. Pedir ao usuário a taxa de juros: Ela deve conter um método o
qual pede ao usuário para que digite a taxa de juros anual, e retorne o valor digitado pelo usuário.
*/
    double taxaJurosAnualImovel(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor da taxa de juros Anual: ");
        double taxaJurosAnualImovel = scanner.nextDouble();
        return taxaJurosAnualImovel;
    }

}
/*
c. Classe Main:
i. Esta é a classe principal do programa.
ii. Ela deve conter o método main(), onde o fluxo principal do programa será implementado.
 */
public class Cacau {
    public static void main(String[] args) {
        ///1. Dentro do método main() vocêdeve usar os métodos da classe InterfaceUsuario para ler os dados do financiamento.
        InterfaceUsuario InterfaceUsuario = new InterfaceUsuario();

        double valorImovel = InterfaceUsuario.valorImovelUsuario();
        int prazoFinanciamento = InterfaceUsuario.prazoFinanciamentoImovel();
        double taxaJurosAnual = InterfaceUsuario.taxaJurosAnualImovel();

        ///2. Após ler os dados do financiamento, instancie um objeto do tipo Financiamento para criar este financiamento.
        Financiamento novoFinanciamento = new Financiamento( valorImovel, prazoFinanciamento, taxaJurosAnual);
        double pagamentoMensal = novoFinanciamento.calculoPagamentoMensal();
        double pagamentoTotal = novoFinanciamento.calculoTotalDoPagamento();


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


    }
}
