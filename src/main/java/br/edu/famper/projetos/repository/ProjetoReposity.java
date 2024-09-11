package br.edu.famper.projetos.repository;

import br.edu.famper.projetos.model.Projeto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjetoReposity extends JpaRepository<Projeto, Long> {
}
