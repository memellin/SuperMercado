package edu.entities;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	
	private List<Item> itemList;
	
	public CarrinhoDeCompras() {
		this.itemList = new ArrayList<>();
	}
	
	public void adcionarItem(Item item) {
		this.itemList.add(item);
		
	}
	
	public double calcularValorTotal() {
		double valorTotal = 0d;
		if(itemList.isEmpty()) {
			throw new RuntimeException("Lista vazia");
		}
		return itemList.stream()
			.mapToDouble(item -> item.getPrice() * item.getQuantity())
			.sum();
		
	}
}
