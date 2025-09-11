package model;

public class Financiamento{
    private double valorImovel;
    private int prazoFinanciamento;
    private double taxaJurosAnual;



    ///METODO FINANCIAMENTO
    public Financiamento(double valorDeImovel, int prazoFinanciamento, double taxaJurosAnual){
        this.valorImovel = valorDeImovel;
        this.prazoFinanciamento = prazoFinanciamento;
        this.taxaJurosAnual = taxaJurosAnual;
    }
    ///1. Pagamento mensal = (valor do imóvel / (prazo do financiamento em anos * 12)) * (1 + (taxa anual / 12))
    ///
    public double calculoPagamentoMensal (){
        return (this.valorImovel/(this.prazoFinanciamento*12))*(1+(this.taxaJurosAnual/12));
    }
    ///2. Total do pagamento = pagamento mensal * prazo do financiamento em anos * 12
    public double calculoTotalDoPagamento (){
        return this.calculoPagamentoMensal() * this.prazoFinanciamento * 12;
    }

}
