package modelo;

public class Matricula {

    private Aluno aluno;
    private Disciplina disciplina;
    private float notas[];

    public Matricula(Aluno aluno, Disciplina disciplina, float[] notas) {
        this.aluno = aluno;
        this.disciplina = disciplina;
        this.notas = notas;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public float[] getNotas() {
        return notas;
    }

    public void setNotas(float notas[]) {
        this.notas = notas;
    }

    public float calcularMedia(){
        float agregador = 0;
        for(float nota: notas){
            agregador+=nota;
        }
        return agregador/notas.length;
    }

}
