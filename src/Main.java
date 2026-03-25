import modelo.Lampada;
import modelo.TipoLampada;

void main() {

    Lampada lampada = new Lampada("Phillips", 60,
            TipoLampada.NEON);
    lampada.alterarEstado();

    lampada.aumentarBrilho();
    lampada.aumentarBrilho();
    lampada.aumentarBrilho();
    lampada.aumentarBrilho();
    lampada.aumentarBrilho();
    lampada.aumentarBrilho();

    System.out.println(lampada.isLigado());
    System.out.println(lampada.getBrilho());

    lampada.diminuirBrilho();
    lampada.diminuirBrilho();
    lampada.diminuirBrilho();

    System.out.println(lampada.getBrilho());

}