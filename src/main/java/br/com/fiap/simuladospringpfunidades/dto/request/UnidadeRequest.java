package br.com.fiap.simuladospringpfunidades.dto.request;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record UnidadeRequest(

        @Size(min = 2, max = 25)
        @NotNull(message = "É necessário inserir o nome")
        String nome,

        @NotNull(message = "É necessário inserir a sigla")
        String sigla,

        @NotNull(message = "É necessário inserir a descrição")
        String descricao,

        @Valid
        @NotNull(message = "É necessário inserir o macro")
        AbstractRequest macro
) {
}