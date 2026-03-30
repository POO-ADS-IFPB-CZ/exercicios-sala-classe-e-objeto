import modelo.Cliente;
import modelo.ContaCorrente;

void main() {

    Cliente cliente = new Cliente("111.111.111-01",
        "Paulo", LocalDate.of(2000,1,1));
    ContaCorrente contaCorrente = new ContaCorrente(cliente,1,
            1);

}