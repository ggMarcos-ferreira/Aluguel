/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postgresql.principal4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aluno
 */


class Residencia {
  private String rua;
  private int numero;
  private String bairro;
  private String cep;
  private String telefone;
  private String email;
  private List<Quarto> quartos;

  public Residencia(String rua, int numero, String bairro, String cep, String telefone, String email) {
    this.rua = rua;
    this.numero = numero;
    this.bairro = bairro;
    this.cep = cep;
    this.telefone = telefone;
    this.email = email;
    this.quartos = new ArrayList<>();
  }

  public void adicionarQuarto(Quarto quarto) {
    quartos.add(quarto);
  }

  // getters

  public String getRua() {
    return rua;
  }

  public int getNumero() {
    return numero;
  }

  public String getBairro() {
    return bairro;
  }

  public String getCep() {
    return cep;
  }

  public String getTelefone() {
    return telefone;
  }

  public String getEmail() {
    return email;
  }

  public List<Quarto> getQuartos() {
    return quartos;
  }
}
