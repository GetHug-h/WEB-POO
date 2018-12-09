/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servico;

import java.util.ArrayList;
import modelo.Cliente;
import modelo.Categoria;

/**
 *
 * @author 171070
 */
public class CategoriaService {
    private ArrayList<Categoria> listaCat = Dados.getCategorias();
    
    public void salvar(Categoria c){
      listaCat.add(c);
    }
    public ArrayList<Categoria> getCategorias(){
      return listaCat;
    }
    public void removerCliente(Cliente c) {
       listaCat.remove(c);
    }
}
