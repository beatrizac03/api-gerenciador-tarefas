package com.api.gerenciador_de_tarefas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.api.gerenciador_de_tarefas.model.Tarefa;

public interface TarefaRepository extends JpaRepository<Tarefa, Long>{
}
