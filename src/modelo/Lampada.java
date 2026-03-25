package modelo;

public class Lampada {
    private boolean ligado;
    private String marca;
    private int potencia;
    private TipoLampada tipo;
    private int brilho;

    public Lampada(String marca, int potencia, TipoLampada tipo){
        this.marca = marca;
        this.potencia = potencia;
        this.tipo = tipo;
        brilho = 50;
    }

    public boolean isLigado(){
        return ligado;
    }

    public void alterarEstado(){
        ligado = !ligado;
    }

    public int getBrilho(){
        return brilho;
    }

    public void aumentarBrilho(){
        if(brilho>=100){
            System.out.println("Brilho já está no máximo");
            return;
        }
        brilho+=10;
    }

    public void diminuirBrilho(){
        if(brilho<=0){
            System.out.println("Brilho já está no mínimo");
            return;
        }
        brilho-=10;
    }

}
