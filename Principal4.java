/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package postgresql.principal4;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Principal4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Criando os quartos
    Quarto quarto1 = new Quarto(100, 2, true, false);
    Quarto quarto2 = new Quarto(150, 4, false, true);

    // Criando a residência e adicionando os quartos
    Residencia residencia = new Residencia("Rua A", 123, "Bairro X", "12345-678", "123456789",
        "residencia@example.com");
    residencia.adicionarQuarto(quarto1);
    residencia.adicionarQuarto(quarto2);

    // Lendo informações do hóspede
    System.out.println("Informe os dados do hóspede:");
    System.out.print("Nome: ");
    String nomeHospede = scanner.nextLine();
    System.out.print("CPF: ");
    String cpfHospede = scanner.nextLine();
    System.out.print("Endereço: ");
    String enderecoHospede = scanner.nextLine();
    System.out.print("Telefone: ");
    String telefoneHospede = scanner.nextLine();
    System.out.print("Email: ");
    String emailHospede = scanner.nextLine();

    Hospede hospede = new Hospede(nomeHospede, cpfHospede, enderecoHospede, telefoneHospede,
        emailHospede);

    // Lendo data e hora de entrada
    System.out.println("\nInforme a data e hora de entrada (no formato dd/MM/yyyy HH:mm):");
    System.out.print("Data e Hora: ");
    String entradaStr = scanner.nextLine();
    LocalDateTime dataHoraEntrada = LocalDateTime.parse(entradaStr, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));

    // Lendo data e hora de saída
    System.out.println("\nInforme a data e hora de saída (no formato dd/MM/yyyy HH:mm):");
    System.out.print("Data e Hora: ");
    String saidaStr = scanner.nextLine();
    LocalDateTime dataHoraSaida = LocalDateTime.parse(saidaStr, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));

    // Criando o aluguel com as informações fornecidas pelo usuário
    Aluguel aluguel = new Aluguel(hospede, quarto1, dataHoraEntrada, dataHoraSaida);

    // Calculando o número de diárias e o valor a ser pago
    int numDiarias = aluguel.calcularNumeroDiarias();
    double valorPago = aluguel.calcularValorPago();

    // Exibindo o resultado
    System.out.println("\nNúmero de diárias: " + numDiarias);
    System.out.println("Valor a ser pago: " + valorPago);

    scanner.close();
  }
}
