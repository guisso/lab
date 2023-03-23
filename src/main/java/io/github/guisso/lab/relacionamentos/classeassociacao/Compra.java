package io.github.guisso.lab.relacionamentos.classeassociacao;

import java.util.ArrayList;

/**
 *
 * @author ifnmg
 */
public class Compra {

    private Long codigo;
    private Cliente cliente;
    private ArrayList<Item> itens;

    public Compra() {
        itens = new ArrayList<>();
    }

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Item> getItens() {
        return itens;
    }

    public void setItens(ArrayList<Item> itens) {
        this.itens = itens;
    }
    //</editor-fold>

    public void adicionarItem(Item item) {
        itens.add(item);
    }

    @Override
    public String toString() {
        return "Compra{"
                + "codigo=" + codigo
                + "cliente=" + cliente.getNome()
                // TODO Exibir todos os itens
                + '}';
    }

}
