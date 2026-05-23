package com.sistema.academia.internal.dto;

import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;

public record MatriculaRequestRecord(
    @NotNull(message = "ID do cliente é obrigatório")
    Long clienteId,

    @NotNull(message = "ID do plano é obrigatório")
    Long planoId,

    @NotNull(message = "Data de início é obrigatória")
    LocalDate dataInicio,

    LocalDate dataFim
) {
}
