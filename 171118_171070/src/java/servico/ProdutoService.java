/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servico;

import java.util.ArrayList;
import modelo.Produto;

/**
 *
 * @author 171070
 */
public class ProdutoService {
    private ArrayList<Produto> listaProd = Dados.getProdutos();
    
    public void salvar(Produto p){
      listaProd.add(p);
    }
    public ArrayList<Produto> getProdutos(){
      return listaProd;
    }

    public void removerProduto(Produto p) {
       listaProd.remove(p);
    }
}
