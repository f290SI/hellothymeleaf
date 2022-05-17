package br.com.fatecararas.si.ds2.hellothymeleaf.model;

public class Aluno {

    private String ra;
    private String nome;
    private String email;
    private String curso;

    public Aluno(){}

    public Aluno(String ra, String nome, String email, String curso) {
        this.ra = ra;
        this.nome = nome;
        this.email = email;
        this.curso = curso;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Aluno [curso=" + curso + ", email=" + email + ", nome=" + nome + ", ra=" + ra + "]";
    }
}
