package com.dio.ponto.model;

import lombok.*;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Calendario {
    @Id
    private Long id;
    private TipoData tipoData;
    private String descricao;
    private LocalDateTime dataEspecial;
}
