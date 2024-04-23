package br.com.fiap.simuladospringpfunidades.dto.request;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import java.time.LocalDateTime;

public record ChefeRequest(

        Boolean substituto,

        @NotNull(message = "É necessário o usuário")
        @Valid
        AbstractRequest usuario,

        @Valid
        @NotNull(message = "É necessário a unidade")
        AbstractRequest unidade,

        @PastOrPresent(message = "A data de início tem de coincidir")
        @NotNull(message = "Informe o início")
        LocalDateTime inicio,

        @NotNull(message = "Informe o fim")
        LocalDateTime fim
) {
}
