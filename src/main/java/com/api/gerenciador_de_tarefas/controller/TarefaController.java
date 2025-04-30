package com.api.gerenciador_de_tarefas.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.api.gerenciador_de_tarefas.service.TarefaService;

import jakarta.validation.Valid;

import com.api.gerenciador_de_tarefas.model.Tarefa;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class TarefaController {
    @Autowired
    private TarefaService tarefaService;

    @GetMapping("/tarefas")
    public List<Tarefa> listarTodos() {
        return tarefaService.listarTodos();
    }

    @GetMapping("/tarefas/{id}")
    public Optional<Tarefa> listar(@PathVariable Long id) {
        return tarefaService.listar(id);
    }
    

    @PostMapping("/tarefas")
    @ResponseStatus(HttpStatus.CREATED)
    public Tarefa criar(@Valid @RequestBody Tarefa tarefa) {
        return tarefaService.criar(tarefa);
    }

    @PutMapping("tarefas/{id}")
    public Tarefa atualizar(@PathVariable Long id, @Valid @RequestBody Tarefa tarefa) {
        return tarefaService.atualizar(id, tarefa);
    }

    @DeleteMapping("/tarefas/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void excluir(@PathVariable Long id) {
        tarefaService.excluir(id);
    }
}
