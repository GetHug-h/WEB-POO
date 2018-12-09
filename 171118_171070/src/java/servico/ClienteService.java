/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servico;

import java.util.ArrayList;
import modelo.Cliente;

/**
 *
 * @author 171070
 */
public class ClienteService {
    private ArrayList<Cliente> listaCli = Dados.getClientes();
    
    public void salvar(Cliente c){
      listaCli.add(c);
      System.out.println(c.getCodigo());
    }
    public ArrayList<Cliente> getClientes(){
      return listaCli;
    }
    public void removerCliente(Cliente c) {
       listaCli.remove(c);
    }
}
