package desafios.DesafioAplicacaoCompras.modelos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Compra implements Comparable<Compra> {
    private String descricaoCompra;
    private double compra;
    List <Produto> listaCompras = new ArrayList<>();


    public String getDescricaoCompra() {
        return descricaoCompra;
    }

    public void setDescricaoCompra(String descricaoCompra) {
        this.descricaoCompra = descricaoCompra;
    }

    public double getCompra() {
        return compra;
    }

    public void setCompra(double compra) {
        this.compra = compra;
    }

    public void comprar(CartaoCredito cartao, Produto produto) {
        if(cartao.getLimite() >= produto.getPreco()) {
            cartao.setLimite(cartao.getLimite() - produto.getPreco());
            listaCompras.add(produto);
        } else {
            System.out.println("Você não tem limite para essa compra.");
        }
    }

    public void exibirExtrato() {
        System.out.println("*******************************************");
        System.out.println("COMPRAS REALIZADAS:\n\n\n\n");

        Collections.sort(listaCompras);
        for (Produto item : listaCompras) {
            System.out.println(item.getNome() + " - " +  item.getPreco());
            System.out.println();
        }

        System.out.println("*******************************************");
    }

    @Override
    public int compareTo(Compra outro) {
        return Double.compare(this.compra, outro.compra);
    }

}
