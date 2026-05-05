package br.com.alunoonline.api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "professor")
@Entity
public class Professor
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "professor_id")
    private Long id;

    @Column(name = "nome_professor", length = 75)
    private String name;

    @Column(name = "email_professor", length = 200)
    private String email;

    @Column(name = "cpf_professor")
    private String cpf;
}
