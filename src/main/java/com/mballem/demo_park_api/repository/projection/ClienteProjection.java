package com.mballem.demo_park_api.repository.projection;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ClienteProjection {
    private Long id;
    private String nome;
    private String cpf;

}
