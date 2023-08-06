package Com.gfg;

public class Animal extends Lifeform {
    private int weight;

    Animal(int weight, int age){
        super(age);
        this.weight = weight;
    }
    void eat() {
        System.out.println("eating");
    }
    int getWeight(){
        return this.weight;
    }
}
