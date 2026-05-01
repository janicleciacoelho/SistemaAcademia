package com.sistema.academia.internal.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "registros_acesso")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RegistroDeAcesso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "data_hora_entrada", nullable = false)
    private LocalDateTime dataHoraEntrada;

    @Column(name = "data_hora_saida")
    private LocalDateTime dataHoraSaida;
}
