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
import modelo.Empresa;
import modelo.Funcionario;
import org.primefaces.event.RowEditEvent;

/**
 *
 * @author glauc
 */
@ManagedBean
@SessionScoped
public class FuncionarioMB {
    /*private FuncionarioService funcionarioService = new FuncionarioService();
    private EmpresaService empresaService = new EmpresaService();*/
    private Empresa empresaEscolhida;
    private Funcionario func = new Funcionario();
    private Funcionario selectedFunc;

    public Empresa getEmpresaEscolhida() {
        return empresaEscolhida;
    }

    public void setEmpresaEscolhida(Empresa empresaEscolhida) {
        this.empresaEscolhida = empresaEscolhida;
    }

    
    public List<Empresa> getEmpresas(){
     // return empresaService.getListaEmpresa();
    }
    
    public Funcionario getSelectedFunc() {
        return selectedFunc;
    }

    public void setSelectedFunc(Funcionario selectedFunc) {
        this.selectedFunc = selectedFunc;
    }
    
    public void removeFuncionario(Funcionario func){
        funcionarioService.removerFuncionario(func);
    }
    
    public void removeSelected(){
        selectedFunc.getEmpresa().removeFuncionario(selectedFunc);
        funcionarioService.removerFuncionario(selectedFunc);
        selectedFunc = null;
    }
    
    public void onRowEdit(RowEditEvent event) {
       FacesMessage msg = new 
        FacesMessage("Funcionário Editado",
                ((Funcionario) event.getObject()).getNome());
       FacesContext.getCurrentInstance().
               addMessage(null, msg);
    }
    
    public void salvar(){
        
        if(empresaEscolhida != null){
            func.setEmpresa(empresaEscolhida);
            empresaEscolhida.addFuncionario(func);
        }
       
        funcionarioService.salvar(func);
        func = new Funcionario();
        empresaEscolhida=null;
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
