import modelo.Aluno;
import modelo.Disciplina;
import modelo.Matricula;
import modelo.Professor;

void main() {

    Disciplina disciplina = new Disciplina("POO", "ADS",
            new Professor("111.111.111-01", "Paulo",
                    LocalDate.of(2000,1,1)));
    Aluno aluno = new Aluno("222.222.222-02", "João",
            LocalDate.of(2004,3,2));

    float notas[] = {7.5f,6.8f,7.3f};
    Matricula matricula = new Matricula(aluno,
            disciplina, notas);
    System.out.println(matricula.calcularMedia());


}