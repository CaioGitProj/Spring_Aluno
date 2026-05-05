package br.com.alunoonline.api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

@Table(name = "aluno")
@Entity
public class Aluno
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "aluno_id")
    private Long id;


    @Column(name = "nome_aluno", length = 75)
    private String nome;

    @Column(name = "email_aluno", length = 200)
    private String email;

    @Column(name = "cpf_aluno", nullable = false)
    private String cpf;
}
