package edu.application;

import edu.entities.CarrinhoDeCompras;
import edu.entities.Item;

public class Application {

	public static void main(String[] args) {

		Item item1 = new Item(1, "ritalina", 50.0, 1);

		System.out.println(item1);

		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adcionarItem(item1);
		
		double valorTotal = carrinho.calcularValorTotal();
		System.out.println("valor total do carrinho é: " + valorTotal);

	}
}
