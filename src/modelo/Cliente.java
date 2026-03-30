package modelo;

import java.time.LocalDate;

public class Cliente {
    private String cpf;
    private String nome;
    private LocalDate nascimento;

    public Cliente(String cpf, String nome, LocalDate nascimento){
        this.cpf = cpf;
        this.nome = nome;
        this.nascimento = nascimento;
    }

}
