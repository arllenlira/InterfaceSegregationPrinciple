package br.com.hyperclass.example;

import br.com.hyperclass.example.interfaces.Toy;

public class ToyHouse implements Toy {

	double price;
	String color;

	@Override
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "ToyHouse: Toy house- Price: " + price + " Color: " + color;
	}

}
