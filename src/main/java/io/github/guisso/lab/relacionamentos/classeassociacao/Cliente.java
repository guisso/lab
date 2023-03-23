package io.github.guisso.lab.relacionamentos.classeassociacao;

import java.util.ArrayList;

/**
 *
 * @author ifnmg
 */
public class Cliente {

    private String nome;
    private ArrayList<Compra> compras;

    public Cliente() {
        compras = new ArrayList<>();
    }

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Compra> getCompras() {
        return compras;
    }

    public void setCompras(ArrayList<Compra> compras) {
        this.compras = compras;
    }
    //</editor-fold>

    public void adionarCompra(Compra compra) {
        compras.add(compra);
    }

    @Override
    public String toString() {
        return "Cliente{"
                + "nome=" + nome
                // TODO Exibir todas as compras
                + '}';
    }

}
