package br.com.alunoonline.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import br.com.alunoonline.api.repository.AlunoRepository;
import org.springframework.stereotype.Service;
import br.com.alunoonline.api.model.Aluno;


@Service
public class AlunoService {

    @Autowired
    AlunoRepository alunoRepository;

    public void criarAluno(Aluno aluno)
    {
        alunoRepository.save(aluno);
    }

}