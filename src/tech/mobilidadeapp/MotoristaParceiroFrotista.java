package tech.mobilidadeapp;

public class MotoristaParceiroFrotista extends Motorista {

    public MotoristaParceiroFrotista(String nome, String placaVeiculo) {
        super(nome, placaVeiculo);
    }

    @Override
    public double calcularPagamentoLiquido() {
        double valorLiquido = getValorBrutoArrecadado() * 0.80;
        valorLiquido -= 800.00;

        if (valorLiquido < 0.0) {
            return 0.0;
        }

        return valorLiquido;
    }
}
