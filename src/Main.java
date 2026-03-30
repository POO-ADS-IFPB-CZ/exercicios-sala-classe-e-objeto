import modelo.Disciplina;
import modelo.Professor;

void main() {

    Disciplina disciplina = new Disciplina("POO", "ADS",
            new Professor("111.111.111-01", "Paulo",
                    LocalDate.of(2000,1,1)));


}