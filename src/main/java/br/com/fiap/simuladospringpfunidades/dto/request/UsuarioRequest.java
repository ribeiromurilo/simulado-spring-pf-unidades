package br.com.fiap.simuladospringpfunidades.dto.request;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record UsuarioRequest(

        @NotNull(message = "É necessário inserir o usuário")
        String username,

        @Pattern(
                message = "A senha não atende aos requisitos!",
                regexp = "/^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[$*&@#])[0-9a-zA-Z$*&@#]{8,16}$/"
        )
        String password,

        @Valid
        @NotNull(message = "É necessário inserir a pessoa")
        AbstractRequest pessoa
) {
}