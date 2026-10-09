package tech.mobilidadeapp;

public class MotoristaIniciante extends Motorista {

    public MotoristaIniciante(String nome, String placaVeiculo) {
        super(nome, placaVeiculo);
    }

    @Override
    public double calcularPagamentoLiquido() {
        double valorLiquido = getValorBrutoArrecadado() * 0.75;

        if (getQuantidadeCorridas() < 5) {
            valorLiquido -= 50.00;
        }

        return Math.max(valorLiquido, 0.0);
    }
}
