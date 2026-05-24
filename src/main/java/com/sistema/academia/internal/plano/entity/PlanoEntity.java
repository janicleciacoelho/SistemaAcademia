package com.sistema.academia.internal.plano.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="planos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PlanoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private Double valor;

    private Integer duracaoDias;

}