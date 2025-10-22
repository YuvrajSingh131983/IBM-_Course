package Polymorphism;

public class AnimalExamole {
public static void main(String[] args) {
	Animal a = new Cow();
	Animal a1 = new Cat();
	Animal a2 = new Dog();
	a.makeSound();
	System.out.println();
	a1.makeSound();
	System.out.println();
	a2.makeSound();
}
}
