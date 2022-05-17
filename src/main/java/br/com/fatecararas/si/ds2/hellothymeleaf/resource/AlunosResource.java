package br.com.fatecararas.si.ds2.hellothymeleaf.resource;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fatecararas.si.ds2.hellothymeleaf.model.Aluno;
import br.com.fatecararas.si.ds2.hellothymeleaf.repository.MockAlunoRepository;

@RestController
@RequestMapping("/alunos")
public class AlunosResource {
    
    @GetMapping
    public ResponseEntity getAll() {

        MockAlunoRepository alunoRepository = new MockAlunoRepository();
        List<Aluno> all = alunoRepository.getAll();
        return ResponseEntity.ok().body(all);
    }
}
