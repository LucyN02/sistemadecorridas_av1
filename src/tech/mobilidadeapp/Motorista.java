package tech.mobilidadeapp;

public abstract class Motorista {
    private String nome;
    private String placaVeiculo;
    private int quantidadeCorridas;
    private double valorBrutoArrecadado;

    public Motorista(String nome, String placaVeiculo) {
        this.nome = nome;
        this.placaVeiculo = placaVeiculo;
        this.quantidadeCorridas = 0;
        this.valorBrutoArrecadado = 0.0;
    }

    public void registrarCorrida(double valor) {
        if (valor > 0) {
            this.quantidadeCorridas++;
            this.valorBrutoArrecadado += valor;
        }
    }

    public abstract double calcularPagamentoLiquido();

    public String getNome() {
        return nome;
    }

    public String getPlacaVeiculo() {
        return placaVeiculo;
    }

    public int getQuantidadeCorridas() {
        return quantidadeCorridas;
    }

    public double getValorBrutoArrecadado() {
        return valorBrutoArrecadado;
    }
}