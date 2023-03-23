package io.github.guisso.lab.relacionamentos.classeassociacao;

/**
 *
 * @author ifnmg
 */
public class Item {

    private double quantidade;
    private Produto produto;

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    //</editor-fold>

    public double calcularValor() {
        return quantidade * produto.getPreco();
    }

    @Override
    public String toString() {
        return "Item{"
                + "quantidade=" + quantidade
                + ", produto=" + produto
                + ", total=" + calcularValor()
                + + +'}';
    }

}
