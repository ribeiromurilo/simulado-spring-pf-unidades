package br.com.fiap.simuladospringpfunidades.dto.request;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public record PessoaRequest(

        @Size(min = 2, max = 25)
        @NotNull(message = "É necessário inserir o nome")
        String nome,

        @Size(min = 3, max = 255)
        String sobrenome,

        @NotNull(message = "Email não correspondente")
        String email,

        @PastOrPresent(message = "A data deve coincidir")
        LocalDate nascimento
) {
}