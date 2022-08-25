package br.com.alura.loja.modelo;

import javax.persistence.*;

@Entity
@Table(name = "categoria")
public class Categoria {

    @EmbeddedId
    private CategoriaId id;

    public Categoria(){}

    public Categoria(CategoriaId id) {
        this.id = id;
    }

    public Categoria(String nome) {
        this.id = new CategoriaId(nome,"XPTO");
    }

    public String getNome() {
        return this.id.getNome();
    }


}
