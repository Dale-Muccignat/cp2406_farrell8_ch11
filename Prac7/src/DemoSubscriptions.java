/**
 * Created by jc321258 on 19/09/16.
 */
public class DemoSubscriptions {
    public static void main(String[] args) {
        PhysicalNewspaperSubscription physical = new PhysicalNewspaperSubscription("one","");
        OnlineNewspaperSubsciption online = new OnlineNewspaperSubsciption("one","");
        PhysicalNewspaperSubscription physical2 = new PhysicalNewspaperSubscription("one","three");
        OnlineNewspaperSubsciption online2 = new OnlineNewspaperSubsciption("one","thre@e");
        physical.display();
        online.display();
        online2.display();
        physical2.display();
    }
}
