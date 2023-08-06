package Com.gfg;

public class Bird extends Animal{
    Bird(int weight, int age){
        super(weight, age);
    }

    void fly(){
        System.out.printf("flying");
    }

    void eat(){
        System.out.println("bird is eating");
    }

}
