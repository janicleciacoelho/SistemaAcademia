package com.sistema.academia.internal.dto;

public record UsuarioResponseRecord(
    Long id,
    String nome,
    String cpf,
    String email,
    String telefone
) {
}
