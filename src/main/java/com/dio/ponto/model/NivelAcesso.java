package com.dio.ponto.model;

import lombok.*;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class NivelAcesso {
    @Id
    private long id;
    private String descricao;
}
