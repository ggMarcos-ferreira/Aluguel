/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postgresql.principal4;

/**
 *
 * @author aluno
 */

class Hospede {
  private String nome;
  private String cpf;
  private String endereco;
  private String telefone;
  private String email;

  public Hospede(String nome, String cpf, String endereco, String telefone, String email) {
    this.nome = nome;
    this.cpf = cpf;
    this.endereco = endereco;
    this.telefone = telefone;
    this.email = email;
  }

  // getters

  public String getNome() {
    return nome;
  }

  public String getCpf() {
    return cpf;
  }

  public String getEndereco() {
    return endereco;
  }

  public String getTelefone() {
    return telefone;
  }

  public String getEmail() {
    return email;
  }
}
