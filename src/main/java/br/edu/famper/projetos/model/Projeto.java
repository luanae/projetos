package br.edu.famper.projetos.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table
@Data
public class Projeto {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "projeto_id")
    private Long codigo;

    @Column(name = "nome", length = 75, nullable = false)
    private String nome;

    @Column(name = "descricao", length = 150)
    private String descricao;

    @Column(name = "dataInicio", nullable = false)
    private String dataInicio;

    @Column(name = "dataFim")
    private String dataFim;
}
