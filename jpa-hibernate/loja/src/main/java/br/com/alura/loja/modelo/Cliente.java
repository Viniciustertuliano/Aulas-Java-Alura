package br.com.alura.loja.modelo;

import javax.persistence.*;

@Entity
@Table(name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Embedded
    private DadosPessoais dadosPessoais;


    public Cliente(String nome, String cpf) {
        this.dadosPessoais = new DadosPessoais(nome,cpf);
    }

    public Cliente() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome(){
        return this.dadosPessoais.getNome();
    }

    public String getCpf(){
        return this.dadosPessoais.getCpf();
    }

    public DadosPessoais getDadosPessoais() {
        return dadosPessoais;
    }
}
