package ru.otus.lesson26;

import ru.otus.lesson26.fruit.Fruit;

import java.util.ArrayList;

public class Box<T extends Fruit> {
	private final ArrayList<T> fruits;

	public void addFruit(T fruit) {
		fruits.add(fruit);
	}

	public Box(ArrayList<T> fruits) {
		this.fruits = fruits;
	}

	public double weightCalc() {
		int weight = 0;
		for (Fruit fruit : this.fruits) {
			weight += fruit.getWeight();
		}
		return weight;
	}

	public boolean compareByWeight(Box<?> another) {
		return Math.abs(this.weightCalc() - another.weightCalc()) < 0.000001;
	}

	public void replaceFruits(Box<? super T> another) {
		if (another.fruits.equals(this.fruits)) {
			return;
		}
		another.fruits.addAll(this.fruits);
		this.fruits.clear();
	}

	public void printBox() {
		if (this.fruits.isEmpty()) {
			System.out.println("Коробка пустая");
			return;
		}
		for (T fruit : this.fruits) {
			System.out.print(fruit.getWeight() + " ");
		}
		System.out.println();
	}
}
