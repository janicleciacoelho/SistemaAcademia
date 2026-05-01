package com.sistema.academia.internal.entity;

import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;

@Entity
@Table(name = "planos")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Plano {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String nome;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal valor;

    @Column(nullable = false, name = "duracao_meses")
    private Integer duracaoMeses;
}
