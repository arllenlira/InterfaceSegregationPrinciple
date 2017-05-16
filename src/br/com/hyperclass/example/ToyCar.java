package br.com.hyperclass.example;

import br.com.hyperclass.example.interfaces.Movable;
import br.com.hyperclass.example.interfaces.Toy;

public class ToyCar implements Toy, Movable {

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
	public void move() {
		System.out.println("Moving the ToyCar.. vruuummmm ~~~~");
	}

}
