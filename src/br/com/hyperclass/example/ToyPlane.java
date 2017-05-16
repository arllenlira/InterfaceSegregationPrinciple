package br.com.hyperclass.example;

import br.com.hyperclass.example.interfaces.Flyable;
import br.com.hyperclass.example.interfaces.Movable;
import br.com.hyperclass.example.interfaces.Toy;

public class ToyPlane implements Toy, Movable, Flyable {

	double price;
	String color;

	@Override
	public void move() {
		System.out.println("The plane is going to move forward and take off");
	}

	@Override
	public void fly() {
		System.out.println("Lift off! We have a lift off!");
	}

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
		return "ToyPlane: Moveable and flyable toy plane- Price: " + price + " Color: " + color;
	}

}
