package io.github.guisso.lab.relacionamentos;

/**
 *
 * @author Luis Guisso &lt;luis.guisso at ifnmg.edu.br&gt;
 */
public class Telefone {

    private Byte ddd;
//    private byte ddd;
    private Integer numero;
//    private int numero;

    private Pessoa pessoa;

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public Byte getDdd() {
        return ddd;
    }

    public void setDdd(Byte ddd) {
        this.ddd = ddd;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    //</editor-fold>
    
    @Override
    public String toString() {
        return "Telefone{"
                + "ddd=" + ddd
                + ", numero=" + numero
                + '}';
    }

}
