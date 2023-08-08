package Com.gfg;

import Com.gfg.calculator.Calculator;
import Com.gfg.exception.DivideByZeroException;

import java.io.*;
import java.nio.Buffer;
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
//
//        Set<Review> set = new TreeSet<>(new UserReviewComp());
//        for(int i=0; i<100; i++){
//            set.add(new Review(random.nextInt(5), random.nextInt(5)));
//        }
//
//        print(set);


        // session 3

//        Calculator calculator = new Calculator(5, 0);

//        try{
//            System.out.println(calculator.getDivision());
//        }catch(DivideByZeroException e){
//            e.printStackTrace();
////            System.exit(0);
//            throw new RuntimeException("100");
//        }finally {
//            System.out.println("in finally block");
//        }
//
//        System.out.println(100);

        // write in the console
//        System.out.println("hello world");

        // take input from the console
//        Scanner scanner = new Scanner(System.in);
//        int[] a = new int[2];//take input form console
//        int i = 0;
//        while(i<2 && scanner.hasNext()){
//            a[i] = scanner.nextInt();
//            i++;
//        }

//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        int[] a = new int[2];
//        int i=0;
//        String input = null;
//        try{
//            input = bufferedReader.readLine();
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        while(i<2 && input != null){
//            a[i] = Integer.parseInt(input);
//            i++;
//            try{
//                input = bufferedReader.readLine();
//            }catch (Exception e){
//                e.printStackTrace();
//            }
//        }

        File file = new File("test.txt");
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file);
            fileWriter.write("Hello world");
            fileWriter.write("Bye World");
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try{
                fileWriter.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }

        try{
            BufferedReader reader = new BufferedReader(new FileReader("test.txt"));
            System.out.println(reader.readLine());
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }


//
//            Calculator calculator = new Calculator(a[0], a[1]);
//        System.out.println(calculator.getSum());
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