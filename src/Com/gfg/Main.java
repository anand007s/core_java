package Com.gfg;

import Com.gfg.calculator.Calculator;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random(); // no arg constructor
//        Calculator calculator = new Calculator(random.nextInt(100), random.nextInt(100)); // all-arg constructor
//        System.out.println(calculator.getSum());

//        Bird bird = new Bird(random.nextInt(100));
//        bird.eat();
//        Animal animal = new Animal(random.nextInt(100));
//        animal.eat();
//        Dog dog = new Dog(random.nextInt(100));
//        dog.eat();
//
//        eat(bird);
//        eat(animal);
//        eat(dog);

        // Session -- 2

//        Calculator calculator = new Calculator(2,5, new PowerByMul());
//
//        System.out.println(calculator.getPower());

        Lifeform lifeform = new Dog(12, 4);
        System.out.println(new AgeFinder(lifeform).getAge());




    }

    //public, private, default/package
    public static void eat(Animal animal){
        animal.eat();
    }
}