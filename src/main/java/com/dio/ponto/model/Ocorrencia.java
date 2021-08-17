package com.dio.ponto.model;

import lombok.*;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Ocorrencia {
    @Id
    private Long id;
    private String nome;
    private String descricao;
}
