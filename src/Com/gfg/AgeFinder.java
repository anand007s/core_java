package Com.gfg;

public class AgeFinder {
    Lifeform lifeform;

    AgeFinder(Lifeform lifeform){
        this.lifeform = lifeform;
    }

    public int getAge() {
        return lifeform.getAge();
    }
}
