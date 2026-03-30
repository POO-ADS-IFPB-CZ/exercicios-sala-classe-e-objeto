package modelo;

public class Disciplina {

    private String nome;
    private String curso;
    private Professor professor;

    public Disciplina(String nome, String curso, Professor professor) {
        this.nome = nome;
        this.curso = curso;
        this.professor = professor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}
