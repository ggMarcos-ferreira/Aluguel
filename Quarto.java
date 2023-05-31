/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postgresql.principal4;

/**
 *
 * @author aluno
 */
class Quarto {
  private double valorDiaria;
  private int capacidadeMaxima;
  private boolean possuiArCondicionado;
  private boolean possuiBanheiraHidromassagem;

  public Quarto(double valorDiaria, int capacidadeMaxima, boolean possuiArCondicionado,
      boolean possuiBanheiraHidromassagem) {
    this.valorDiaria = valorDiaria;
    this.capacidadeMaxima = capacidadeMaxima;
    this.possuiArCondicionado = possuiArCondicionado;
    this.possuiBanheiraHidromassagem = possuiBanheiraHidromassagem;
  }

  // getters e setters

  public double getValorDiaria() {
    return valorDiaria;
  }

  public int getCapacidadeMaxima() {
    return capacidadeMaxima;
  }

  public boolean isPossuiArCondicionado() {
    return possuiArCondicionado;
  }

  public boolean isPossuiBanheiraHidromassagem() {
    return possuiBanheiraHidromassagem;
  }
}