package io.github.guisso.lab.relacionamentos.classeassociacao;

/**
 *
 * @author ifnmg
 */
public class Loja {

    public static void main(String[] args) {
        // Cliente 1
        Cliente c1 = new Cliente();
        c1.setNome("Ana Zaira");
        
        // Cliente 2
        Cliente c2 = new Cliente();
        c2.setNome("Ana Zaira");
        
        // Produto 1
        Produto p1 = new Produto();
        p1.setNome("Abacaxi");
        p1.setPreco(1.0);
        
        // Produto 2
        Produto p2 = new Produto();
        p2.setNome("Banana");
        p2.setPreco(2.0);
        
        // Produto 3
        Produto p3 = new Produto();
        p3.setNome("Caqui");
        p3.setPreco(3.0);
        
        // Produto 4
        Produto p4 = new Produto();
        p4.setNome("Damasco");
        p4.setPreco(4.0);
        
        // Compra 1 (cliente 1)
        Compra cp1 = new Compra();
        cp1.setCodigo(123L);
        
        // Item 1
        Item i1 = new Item();
        i1.setQuantidade(2.0);
        i1.setProduto(p1);
        
        cp1.adicionarItem(i1);
        c1.adionarCompra(cp1);
        
        
        
    }
}
