package Com.gfg;

public class Animal {
    private int weight;

    Animal(int weight){
        this.weight = weight;
    }
    void eat() {
        System.out.println("eating");
    }
    int getWeight(){
        return this.weight;
    }
}
