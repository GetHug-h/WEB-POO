/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Objects;

/**
 *
 * @author Lucas
 */
public class Produto {
    private int codigo;
    private int nome;
    private Categoria categoria;
    private double preco;
    private int moeda;
    private double imposto;

    public int getCodigo() {
        return codigo;
    }
    
    public int getNome() {
        return nome;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public double getPreco() {
        return preco;
    }

    public int getMoeda() {
        return moeda;
    }

    public double getImposto() {
        return imposto;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + this.codigo;
        hash = 83 * hash + this.nome;
        hash = 83 * hash + Objects.hashCode(this.categoria);
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.preco) ^ (Double.doubleToLongBits(this.preco) >>> 32));
        hash = 83 * hash + this.moeda;
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.imposto) ^ (Double.doubleToLongBits(this.imposto) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Produto other = (Produto) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        if (this.nome != other.nome) {
            return false;
        }
        if (Double.doubleToLongBits(this.preco) != Double.doubleToLongBits(other.preco)) {
            return false;
        }
        if (this.moeda != other.moeda) {
            return false;
        }
        if (Double.doubleToLongBits(this.imposto) != Double.doubleToLongBits(other.imposto)) {
            return false;
        }
        if (!Objects.equals(this.categoria, other.categoria)) {
            return false;
        }
        return true;
    }
    
    
}
