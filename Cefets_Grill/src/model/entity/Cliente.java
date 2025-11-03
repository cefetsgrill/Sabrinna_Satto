package model.entity;

import java.time.LocalDate;

public class Cliente {
    private int id_cliente;
    private String nome_cliente;
    private String cpf_cliente;
    private String endereco_cliente;
    private LocalDate data_nascimento;

    // Getters.
    public int getId_cliente() { return id_cliente; }
    public String getNome_cliente() { return nome_cliente; }
    public String getCpf_cliente() { return cpf_cliente; }
    public String getEndereco_cliente() { return endereco_cliente; }
    public LocalDate getData_nascimento() { return data_nascimento; }

    // Setters.
    public void setId_cliente(int id_cliente) { this.id_cliente = id_cliente; }
    public void setNome_cliente(String nome_cliente) { this.nome_cliente = nome_cliente; }
    public void setCpf_cliente(String cpf_cliente) { this.cpf_cliente = cpf_cliente; }
    public void setEndereco_cliente(String endereco_cliente) { this.endereco_cliente = endereco_cliente; }
    public void setData_nascimento(LocalDate data_nascimento) { this.data_nascimento = data_nascimento; }

}
