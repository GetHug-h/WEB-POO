/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servico;

import java.util.ArrayList;
import modelo.Cliente;
import modelo.Pedido;
import modelo.Produto;
import modelo.Categoria;


/**
 *
 * @author glauc
 */
public class Dados {

    private static ArrayList<Cliente> LISTA_CLIENTES;
    private static ArrayList<Pedido> LISTA_PEDIDOS;
    private static ArrayList<Produto> LISTA_PRODUTOS;
    private static ArrayList<Categoria> LISTA_CATEGORIAS;

    private static void init() {
       
        LISTA_PEDIDOS = new ArrayList();
        LISTA_CLIENTES = new ArrayList();
        LISTA_PRODUTOS = new ArrayList();
        LISTA_CATEGORIAS = new ArrayList();
    }

    public static ArrayList<Cliente> getClientes() {
        if (LISTA_CLIENTES == null) {
            init();
        }
        return LISTA_CLIENTES;
    }

    public static ArrayList<Pedido> getPedidos() {
        if (LISTA_PEDIDOS == null) {
            init();
        }
        return LISTA_PEDIDOS;
    }
    
    public static ArrayList<Produto> getProdutos() {
        if (LISTA_PRODUTOS == null) {
            init();
        }
        return LISTA_PRODUTOS;
    }
    
    public static ArrayList<Categoria> getCategorias() {
        if (LISTA_CATEGORIAS == null) {
            init();
        }
        return LISTA_CATEGORIAS;
    }
}
