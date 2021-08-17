package com.dio.ponto.model;


import lombok.*;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class CategoriaUsuario {
    @Id
    private Long id;
    private String descricao;
}
