/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servico;

import java.util.ArrayList;
import modelo.Pedido;

/**
 *
 * @author 171070
 */
public class PedidoService {
    private ArrayList<Pedido> listaPed = Dados.getPedidos();
    
    public void salvar(Pedido p){
      listaPed.add(p);
    }
    public ArrayList<Pedido> getPedidos(){
      return listaPed;
    }

    public void removerPedido(Pedido p) {
       listaPed.remove(p);
    }
}
