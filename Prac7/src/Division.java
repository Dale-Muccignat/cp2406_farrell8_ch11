/**
 * Created by jc321258 on 19/09/16.
 */
public abstract class Division {
    String name;
    int num;

    public Division(String name, int num) {
        this.name = name;
        this.num = num;
    }

    public abstract void display();
}
