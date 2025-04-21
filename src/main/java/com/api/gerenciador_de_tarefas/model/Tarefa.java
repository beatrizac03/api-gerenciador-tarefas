package com.api.gerenciador_de_tarefas.model;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;

@Data
@Entity
public class Tarefa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Para bancos relacionais
    private Long id;

    @NotNull
    @Size(min = 3, max = 100)
    private String titulo;

    @Size(max = 500)
    private String descricao;

    @NotNull
    private String status; // Ex.: "Em andamento", "Concluído"

    @CreationTimestamp
    private LocalDateTime dataCriacao;
}
