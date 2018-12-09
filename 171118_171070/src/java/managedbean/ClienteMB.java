/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedbean;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import modelo.Cliente;

/**
 *
 * @author glauc
 */

@ManagedBean
@SessionScoped
public class ClienteMB {
    private ArrayList <Cliente> listaClientes = 
            new ArrayList();
    private Cliente cliente = new Cliente();

    public void salvar(){
        listaClientes.add(cliente);
        cliente = new Cliente();
    }
    
    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(ArrayList<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    
}



