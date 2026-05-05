package br.com.alunoonline.api.model;

import br.com.alunoonline.api.MatriculaAlunoStatusEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Table(name = "matricula_aluno")
@Entity
@Data
public class MatriculaAluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "matricula_aluno_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "aluno_id")
    private Aluno aluno;

    @ManyToOne
    @JoinColumn(name = "disciplina_id")
    private Disciplina disciplina;

    private Double nota1;
    private Double nota2;

    @Enumerated(EnumType.STRING)
    @Column(name = "status_matricula_aluno")
    private MatriculaAlunoStatusEnum status;
}
