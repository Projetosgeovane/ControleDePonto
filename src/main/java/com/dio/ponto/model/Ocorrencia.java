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
public class Ocorrencia {
    @Id
    private Long id;
    private String nome;
    private String descricao;
}
