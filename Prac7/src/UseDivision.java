/**
 * Created by jc321258 on 19/09/16.
 */
public class UseDivision {
    public static void main(String[] args) {
        InternationalDivision intd = new InternationalDivision("one",1,"two","three");
        intd.display();
        DomesticDivision domd = new DomesticDivision("one",2,"two");
        domd.display();
    }
}
