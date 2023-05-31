/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postgresql.principal4;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 *
 * @author aluno
 */

class Aluguel {
  private Hospede hospede;
  private Quarto quarto;
  private LocalDateTime dataHoraEntrada;
  private LocalDateTime dataHoraSaida;

  public Aluguel(Hospede hospede, Quarto quarto, LocalDateTime dataHoraEntrada, LocalDateTime dataHoraSaida) {
    this.hospede = hospede;
    this.quarto = quarto;
    this.dataHoraEntrada = dataHoraEntrada;
    this.dataHoraSaida = dataHoraSaida;
  }

  public int calcularNumeroDiarias() {
    LocalDate dataEntrada = dataHoraEntrada.toLocalDate();
    LocalTime horaEntrada = dataHoraEntrada.toLocalTime();
    LocalDate dataSaida = dataHoraSaida.toLocalDate();
    LocalTime horaSaida = dataHoraSaida.toLocalTime();

    if (horaEntrada.isAfter(LocalTime.NOON)) {
      dataEntrada = dataEntrada.plusDays(1);
    }

    if (horaSaida.isBefore(LocalTime.NOON)) {
      dataSaida = dataSaida.minusDays(1);
    }

    return (int) Duration.between(dataEntrada.atStartOfDay(), dataSaida.atStartOfDay()).toDays();
  }

  public double calcularValorPago() {
    int numDiarias = calcularNumeroDiarias();
    return numDiarias * quarto.getValorDiaria();
  }
}