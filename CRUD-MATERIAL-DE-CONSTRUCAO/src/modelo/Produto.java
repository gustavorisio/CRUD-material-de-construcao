/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

public class Produto {
    private int id;
    private String nome;
    private int categoria;
    private String marca;
    private double venda;
    private double custo;
    private String ean;
    private String fornecedor;
    private double estoque;
    private double peso;
    
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setVenda(double venda){
        this.venda = venda;
    }
    
    public double getVenda() {
        return venda;
    }
    
    public void setCusto(double custo) {
        this.custo = custo;
    }
    
    public double getCusto(){
        return custo;
    }
    
    public void setEan(String ean) {
        this.ean = ean;
    }
    
    public String getEan() {
        return ean;
    }
    
    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }
    
    public String getFornecedor(){
        return fornecedor;
    }
    
    public void setEstoque(double estoque) {
        this.estoque = estoque;
    }
    
    public double getEstoque(){
        return estoque;
    }
    
    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public double getPeso() {
        return peso;
    }

    public void setInt(int i, int categoria) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setString(int i, String nome) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setDouble(int i, double venda) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
