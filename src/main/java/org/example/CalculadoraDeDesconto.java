package org.example;

public class CalculadoraDeDesconto {
  private ServicoDeDesconto serviçoDeDesconto;

  public CalculadoraDeDesconto(ServicoDeDesconto servicoDeDesconto){
    this.serviçoDeDesconto = servicoDeDesconto;

  }
  public double calcularDesconto(double valorOriginal){
    double porcentagem = serviçoDeDesconto.getPorcentagemDeDescoonto();
    return valorOriginal * (1 - porcentagem);
  }
}
