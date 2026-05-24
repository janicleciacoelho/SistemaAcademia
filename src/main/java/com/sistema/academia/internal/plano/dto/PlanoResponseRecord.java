package com.sistema.academia.internal.plano.dto;

public record PlanoResponseRecord(

        Long id,
        String nome,
        Double valor,
        Integer duracaoDias

) {
}