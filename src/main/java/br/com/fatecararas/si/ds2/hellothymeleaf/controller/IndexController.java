package br.com.fatecararas.si.ds2.hellothymeleaf.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.fatecararas.si.ds2.hellothymeleaf.model.Aluno;
import br.com.fatecararas.si.ds2.hellothymeleaf.repository.MockAlunoRepository;

@Controller
@RequestMapping("/")
public class IndexController {
    
    @GetMapping
    public String index(Model model) {

        MockAlunoRepository repository = new MockAlunoRepository();

        List<Aluno> alunos = repository.getAll();

        model.addAttribute("alunos", alunos);

        return "index";
    }
}
