package io.github.guisso.lab.relacionamentos.classeassociacao;

/**
 *
 * @author ifnmg
 */
public class Produto {

    private String nome;
    private double preco;

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    //</editor-fold>

    @Override
    public String toString() {
        return "Produto{"
                + "nome=" + nome
                + ", preco=" + preco
                + '}';
    }

}
