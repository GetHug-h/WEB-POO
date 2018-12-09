/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.Objects;
/**
 *
 * @author 171070
 */
public class Cliente {
    private int codigo;
    private String nome;
//    private String endereco;
//    private String  telefone;
//    private int status;
//    private double limite;
//    private final ArrayList <Pedido> pedidos = new ArrayList <>();

    public int getCodigo() {
        return codigo;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

//    public String getEndereco() {
//        return endereco;
//    }
//
//    public void setEndereco(String endereco) {
//        this.endereco = endereco;
//    }
//
//    public String getTelefone() {
//        return telefone;
//    }
//
//    public void setTelefone(String telefone) {
//        this.telefone = telefone;
//    }
//
//    public int getStatus() {
//        return status;
//    }
//
//    public void setStatus(int status) {
//        this.status = status;
//    }
//
//    public double getLimite() {
//        return limite;
//    }
//
//    public void setLimite(double limite) {
//        this.limite = limite;
//    }
//
//    public void addPedido(Pedido pedido) {
//        this.pedidos.add(pedido);
//    }
//    
//    public ArrayList<Pedido> getPedidos(){
//        return pedidos;
//    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + this.codigo;
        hash = 47 * hash + Objects.hashCode(this.nome);
//        hash = 47 * hash + Objects.hashCode(this.endereco);
//        hash = 47 * hash + Objects.hashCode(this.telefone);
//        hash = 47 * hash + this.status;
//        hash = 47 * hash + (int) (Double.doubleToLongBits(this.limite) ^ (Double.doubleToLongBits(this.limite) >>> 32));
//        hash = 47 * hash + Objects.hashCode(this.pedidos);
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
        final Cliente other = (Cliente) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
//        if (this.status != other.status) {
//            return false;
//        }
//        if (Double.doubleToLongBits(this.limite) != Double.doubleToLongBits(other.limite)) {
//            return false;
//        }
//        if (!Objects.equals(this.nome, other.nome)) {
//            return false;
//        }
//        if (!Objects.equals(this.endereco, other.endereco)) {
//            return false;
//        }
//        if (!Objects.equals(this.telefone, other.telefone)) {
//            return false;
//        }
//        if (!Objects.equals(this.pedidos, other.pedidos)) {
//            return false;
//        }
        return true;
    }
    
    
}
