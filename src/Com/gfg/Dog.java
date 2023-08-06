package Com.gfg;

public class Dog extends Animal{
    Dog(int weight, int age){
        super(weight, age);
    }

    void eat(){
        System.out.println("Dog is eating");
    }
}
