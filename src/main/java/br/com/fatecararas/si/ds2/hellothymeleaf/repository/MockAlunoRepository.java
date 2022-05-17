package br.com.fatecararas.si.ds2.hellothymeleaf.repository;

import java.util.Arrays;
import java.util.List;

import br.com.fatecararas.si.ds2.hellothymeleaf.model.Aluno;

public class MockAlunoRepository {
    
    public List<Aluno> getAll() {
        return Arrays.asList(
            new Aluno("1", "Allan", "allan@gmail.com", "Sistemas para Internet"),
            new Aluno("2", "Vitor", "vitor@gmail.com", "Sistemas para Internet"),
            new Aluno("3", "Willian", "willian@gmail.com", "Sistemas para Internet"),
            new Aluno("4", "Ricardo", "ricardo@gmail.com", "Sistemas para Internet"),
            new Aluno("5", "David", "david@gmail.com", "Sistemas para Internet"),
            new Aluno("6", "Gabriel", "gabriel@gmail.com", "Sistemas para Internet"),
            new Aluno("7", "Antonio", "antonio@gmail.com", "Sistemas para Internet"),
            new Aluno("8", "Felipe", "felipe@gmail.com", "Sistemas para Internet"),
            new Aluno("9", "Rafael", "rafael@gmail.com", "Sistemas para Internet"),
            new Aluno("10", "Luiz Carlos", "luizacarlos@gmail.com", "Sistemas para Internet"),
            new Aluno("11", "Jose Carlos", "josecarlos@gmail.com", "Sistemas para Internet"),
            new Aluno("12", "Carlos", "carlos@gmail.com", "Sistemas para Internet")
        );
    }
}
