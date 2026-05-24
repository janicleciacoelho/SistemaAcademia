package com.sistema.academia.internal.plano.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record PlanoRequestRecord(

        @NotBlank(message="Nome obrigatório")
        String nome,

        @NotNull(message="Valor obrigatório")
        Double valor,

        @NotNull(message="Duração obrigatória")
        Integer duracaoDias

) {
}