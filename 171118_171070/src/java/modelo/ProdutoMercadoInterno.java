/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Lucas
 */
public class ProdutoMercadoInterno extends Produto{
    private boolean incentivo;

    public boolean isIncentivo() {
        return incentivo;
    }

    public void setIncentivo(boolean incentivo) {
        this.incentivo = incentivo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + (this.incentivo ? 1 : 0);
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
        final ProdutoMercadoInterno other = (ProdutoMercadoInterno) obj;
        if (this.incentivo != other.incentivo) {
            return false;
        }
        return true;
    }
}
