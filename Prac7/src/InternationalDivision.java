/**
 * Created by jc321258 on 19/09/16.
 */
public class InternationalDivision extends Division {
    String country, lang;

    public InternationalDivision(String name, int num, String country, String lang) {
        super(name, num);
        this.country = country;
        this.lang = lang;
    }

    @Override
    public void display() {
        System.out.println("Name: " + name + " Account: " + num + " Country: " + country + " Language: " + lang);
    }
}
