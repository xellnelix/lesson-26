package ru.otus.lesson26.fruit;

public abstract class Fruit {
	protected double weight;

	public double getWeight() {
		return weight;
	}

	public Fruit(double weight) {
		this.weight = weight;
	}
}
