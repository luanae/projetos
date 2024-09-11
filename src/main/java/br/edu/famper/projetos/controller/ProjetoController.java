package br.edu.famper.projetos.controller;

import br.edu.famper.projetos.model.Projeto;
import br.edu.famper.projetos.service.ProjetoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/projetos")
public class ProjetoController {
    @Autowired
    private ProjetoService projetoService;

    @GetMapping
    public ResponseEntity<List<Projeto>> finAll() {
        return ResponseEntity.status(HttpStatus.OK).body(projetoService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Projeto>> finById(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(projetoService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Projeto> create(@RequestBody Projeto projeto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(projetoService.salvar(projeto));
    }

    @PutMapping
    public ResponseEntity<Projeto> update(@RequestBody Projeto projeto) {
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(projetoService.update(projeto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        projetoService.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
