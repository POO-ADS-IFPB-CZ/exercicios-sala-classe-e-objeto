import modelo.ContaCorrente;
import modelo.Lampada;
import modelo.TipoLampada;

void main() {

    ContaCorrente contaCorrente =
            new ContaCorrente("Paulo",1, 1);
    contaCorrente.depositar(1000); //vai fazer
    contaCorrente.depositar(10000); // não vai fazer
    contaCorrente.sacar(300);
    System.out.println(contaCorrente.getSaldo());
}