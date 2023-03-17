package io.github.guisso.lab.relacionamentos;

/**
 *
 * @author Luis Guisso &lt;luis.guisso at ifnmg.edu.br&gt;
 */
public class Endereco {

    private String logradouro;
    private String bairro;
    private Integer numero;
    private Pessoa pessoa;

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
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
        return "Endereco{"
                + "logradouro=" + logradouro
                + ", bairro=" + bairro
                + ", numero=" + numero
                + '}';
    }

}
