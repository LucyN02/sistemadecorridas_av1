package tech.mobilidadeapp;

public class MotoristaPremium extends Motorista {

    public MotoristaPremium(String nome, String placaVeiculo) {
        super(nome, placaVeiculo);
    }

    @Override
    public void registrarCorrida(double valor) {
        if (valor > 0) {
            super.registrarCorrida(valor + 2.00);
        }
    }

    @Override
    public double calcularPagamentoLiquido() {
        return getValorBrutoArrecadado() * 0.85;
    }
}
