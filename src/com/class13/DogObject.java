package com.class13;

public class DogObject {

	public static void main(String[] args) {
		
		Dog Dog1Object = new Dog();
		Dog1Object.breed = "Bulldog";
		Dog1Object.size = "Large";
		Dog1Object.color = "Light Gray";
		Dog1Object.age = 5;
		Dog1Object.bark();
		Dog1Object.eat();
		Dog1Object.sleep();
		Dog1Object.look();
		
		System.out.println();
		
		Dog Dog2Object = new Dog();
		Dog2Object.breed = "Beagle";
		Dog2Object.size = "Large";
		Dog2Object.color = "Orange";
		Dog2Object.age = 6;
		Dog2Object.bark();
		Dog2Object.eat();
		Dog2Object.sleep();
		Dog2Object.look();
		
		System.out.println();
		
		Dog Dog3Object = new Dog();
		Dog3Object.breed = "German Shephard";
		Dog3Object.size = "Large";
		Dog3Object.color = "White & Orange";
		Dog3Object.age = 6;
		Dog3Object.bark();
		Dog3Object.eat();
		Dog3Object.sleep();
		Dog3Object.look();
		
		
	}

}
