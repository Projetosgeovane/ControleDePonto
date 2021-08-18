package com.dio.ponto.model;

import lombok.*;

import javax.persistence.Id;
import javax.persistence.Entity;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class JornadaTrabalho {
    @Id
    private long id;
    private String descricao;
}
