package com.api.gerenciador_de_tarefas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.gerenciador_de_tarefas.model.Tarefa;
import com.api.gerenciador_de_tarefas.repository.TarefaRepository;

import jakarta.validation.Valid;

@Service
public class TarefaService {
    
    @Autowired
    private TarefaRepository tarefaRepository;
    
    public List<Tarefa> listarTodos() {
        return tarefaRepository.findAll();
    }

    public Optional<Tarefa> listar(Long id) {
        return tarefaRepository.findById(id);
    }

    public Tarefa criar(@Valid Tarefa tarefa) {
        tarefa.setDataCriacao(java.time.LocalDateTime.now());
        return tarefaRepository.save(tarefa);
    }

    public Tarefa atualizar(Long id, @Valid Tarefa tarefaAtualizada) {
        Optional<Tarefa> tarefaOptional = tarefaRepository.findById(id);

        if(tarefaOptional.isEmpty()) {
            throw new RuntimeException("Tarefa não encontrada");
        }

        Tarefa tarefa = tarefaOptional.get();
        tarefa.setTitulo(tarefaAtualizada.getTitulo());
        tarefa.setDescricao(tarefaAtualizada.getDescricao());
        tarefa.setStatus(tarefaAtualizada.getStatus());
        return tarefaRepository.save(tarefa);
    }

    public void excluir(Long id) {
        tarefaRepository.deleteById(id);
    }
}
