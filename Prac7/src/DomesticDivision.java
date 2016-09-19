/**
 * Created by jc321258 on 19/09/16.
 */
public class DomesticDivision extends Division {
    String state;

    public DomesticDivision(String name, int num, String state) {
        super(name, num);
        this.state = state;
    }

    @Override
    public void display() {
        System.out.println("Name: " + name + " Account: " + num + " State: " + state);
    }
}
