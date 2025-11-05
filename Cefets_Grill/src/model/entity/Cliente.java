package model.entity;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Cliente {
    private static int proximoId = 1;
    private int id_cliente;
    private String nome_cliente;
    private String cpf_cliente;
    private String endereco_cliente;
    private LocalDate data_nascimento;



    public Cliente(){
        this.id_cliente = proximoId++;
    }

    // Getters.
    public int getId_cliente() { return id_cliente; }
    public String getNome_cliente() { return nome_cliente; }
    public String getCpf_cliente() { return cpf_cliente; }
    public String getEndereco_cliente() { return endereco_cliente; }
    public LocalDate getData_nascimento() { return data_nascimento; }
    public int getIdade() {
        if (this.data_nascimento == null) {
            return 0;
        }
        return Period.between(this.data_nascimento, LocalDate.now()).getYears();
    }
    // Setters.
    public void setNome_cliente(String nome_cliente) { this.nome_cliente = nome_cliente; }
    public void setCpf_cliente(String cpf_cliente) { this.cpf_cliente = cpf_cliente; }
    public void setEndereco_cliente(String endereco_cliente) { this.endereco_cliente = endereco_cliente; }
    public void setData_nascimento(LocalDate data_nascimento) { this.data_nascimento = data_nascimento; }

    @Override
    public String toString() {
        DateTimeFormatter formatadorData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada = (this.data_nascimento != null) ? this.data_nascimento.format(formatadorData) : "N/A";

        return "--- Dados do Cliente ---\n" +
                "ID: " + id_cliente + "\n" +
                "Nome: " + nome_cliente + "\n" +
                "CPF: " + cpf_cliente + "\n" +
                "Endereco: " + endereco_cliente + "\n" +
                "Idade: " + this.getIdade() + " anos\n" +
                "Data Nasc.: " + dataFormatada;
    }
}
