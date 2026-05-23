package com.sistema.academia.internal.dto;

import java.time.LocalDate;

public record MatriculaResponseRecord(
    Long id,
    Long clienteId,
    String clienteNome,
    Long planoId,
    String planoNome,
    LocalDate dataInicio,
    LocalDate dataFim
) {
}
