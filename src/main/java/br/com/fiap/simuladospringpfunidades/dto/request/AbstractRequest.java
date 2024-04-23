package br.com.fiap.simuladospringpfunidades.dto.request;

import jakarta.validation.constraints.NotNull;

public record AbstractRequest(

        @NotNull(message = "É necessário um número id")
        Long id
) {
}