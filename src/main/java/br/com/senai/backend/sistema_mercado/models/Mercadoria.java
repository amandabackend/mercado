package br.com.senai.backend.sistema_mercado.models;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="Mercadoria")   
public class Mercadoria{

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="id")
private Integer id;

@Column(name="preco")
private Integer preco;

@Column(name="quantidade")
private Integer quantidade;

@Column(name="nome")
private Integer nome;

@Column(name="categoria")
private Integer categoria;

public Mercadoria() {
}

public Mercadoria(Integer id, Integer preco, Integer quantidade, Integer nome, Integer categoria) {
    this.id = id;
    this.preco = preco;
    this.quantidade = quantidade;
    this.nome = nome;
    this.categoria = categoria;
}

public Integer getId() {
    return id;
}

public void setId(Integer id) {
    this.id = id;
}

public Integer getPreco() {
    return preco;
}

public void setPreco(Integer preco) {
    this.preco = preco;
}

public Integer getQuantidade() {
    return quantidade;
}

public void setQuantidade(Integer quantidade) {
    this.quantidade = quantidade;
}

public Integer getNome() {
    return nome;
}

public void setNome(Integer nome) {
    this.nome = nome;
}

public Integer getCategoria() {
    return categoria;
}

public void setCategoria(Integer categoria) {
    this.categoria = categoria;
}


}


