package br.com.alunoonline.api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "disciplina")
@Entity
public class Disciplina
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "disciplina_id")
    private Long id;

    @Column(name = "nome_disciplina", length = 120)
    private String nome;
    
    private Integer cargaHoraria;


    @ManyToOne
    @JoinColumn(name = "professor_id")
    private Professor professor;
}
