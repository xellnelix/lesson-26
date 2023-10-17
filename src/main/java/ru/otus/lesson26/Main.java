package ru.otus.lesson26;

import ru.otus.lesson26.fruit.Apple;
import ru.otus.lesson26.fruit.Fruit;
import ru.otus.lesson26.fruit.Orange;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Box<Apple> appleBox = new Box<>(new ArrayList<>());
		Box<Apple> appleBox1 = new Box<>(new ArrayList<>());
		Box<Orange> orangeBox = new Box<>(new ArrayList<>());
		Box<Fruit> fruitBox = new Box<>(new ArrayList<>());

		appleBox.addFruit(new Apple(5));
		appleBox.addFruit(new Apple(10));
		orangeBox.addFruit(new Orange(10));
		orangeBox.addFruit(new Orange(5));
		orangeBox.addFruit(new Orange(5));
		System.out.println(appleBox.compareByWeight(orangeBox));
		fruitBox.addFruit(new Apple(15));
		System.out.println(appleBox.compareByWeight(fruitBox));

		appleBox.printBox();
		appleBox1.printBox();
		appleBox.replaceFruits(appleBox1);
		appleBox.printBox();
		appleBox1.printBox();
		appleBox1.replaceFruits(fruitBox);
		fruitBox.printBox();
		appleBox1.printBox();

	}
}
