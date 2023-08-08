package Com.gfg;

import Com.gfg.calculator.Calculator;

import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;

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

//        Lifeform lifeform = new Dog(12, 4);
//        System.out.println(new AgeFinder(lifeform).getAge());

        Set<Review> set = new TreeSet<>(new UserReviewComp());
        for(int i=0; i<100; i++){
            set.add(new Review(random.nextInt(5), random.nextInt(5)));
        }

        print(set);
        
    }

    static void print(Collection<Review> collection){
        for(Review i : collection){
            System.out.println(i.criticReview + " " + i.userReview);
//            collection.remove(i);
        }
    }

    //public, private, default/package
    public static void eat(Animal animal){
        animal.eat();
    }
}