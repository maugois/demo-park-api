package com.mballem.demo_park_api.web.dto;

import jakarta.validation.constraints.*;
import lombok.*;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString
public class UsuarioCreateDto {

    @NotBlank
    @Email(regexp = "^[a-z0-9.+-]+@[a-z0-9.-]+\\.[a-z]{2,}$", message = "Formato do e-mail está inválido!")
    private String username;

    @NotBlank
    @Size(min = 6, max = 6)
    private String password;
}
