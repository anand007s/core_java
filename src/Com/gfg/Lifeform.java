package Com.gfg;

public abstract class Lifeform {
    int age;
    Lifeform(int age) {
        this.age = age;
    }
    void brathe() {
        System.out.println("breathes");
    }
    public int getAge(){
        return this.age;
    }
}
