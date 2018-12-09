/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedbean;

import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import modelo.Pedido;
import modelo.Categoria;
import org.primefaces.event.RowEditEvent;

/**
 *
 * @author glauc
 */
@ManagedBean
@SessionScoped
public class PedidoMB {
    private PedidoService pedidoService = new PedidoService();
    private CategoriaService categoriaService = new EmpresaService();
    private Categoria categoriaEscolhida;
    private Pedido ped = new Pedido();
    private Pedido selectedPed;

    public Categoria getCategoriaEscolhida() {
        return categoriaEscolhida;
    }

    public void setCategoriaEscolhida(Categoria categoriaEscolhida) {
        this.categoriaEscolhida = categoriaEscolhida;
    }

    
    public List<Categoria> getCategorias(){
        return categoriaService.getListaCategorias();
    }
    
    public Pedido getSelectedPed() {
        return selectedPed;
    }

    public void setSelectedPed(Pedido selectedPed) {
        this.selectedPed = selectedPed;
    }
    
    public void removePedido(Pedido ped){
        pedidoService.removerPedido(ped);
    }
    
    public void removeSelected(){
        selectedPed.getCategoria().removePedido(selectedPed);
        pedidoService.removerPedido(selectedPed);
        selectedPed = null;
    }
    
    public void onRowEdit(RowEditEvent event) {
       FacesMessage msg = new 
        FacesMessage("Pedido Editado");
       FacesContext.getCurrentInstance().
               addMessage(null, msg);
    }
    
    public void salvar(){
        
        if(categoriaEscolhida != null){
            ped.setCategoria(categoriaEscolhida);
            categoriaEscolhida.addPedido(ped);
        }
       
        pedidoService.salvar(ped);
        ped = new Pedido();
        categoriaEscolhida=null;
    }
    
    public List<Funcionario> getFuncionarios(){
        return funcionarioService.getFuncionarios();
    }
    
    public Funcionario getFunc() {
        return func;
    }

    public void setFunc(Funcionario func) {
        this.func = func;
    }
}
