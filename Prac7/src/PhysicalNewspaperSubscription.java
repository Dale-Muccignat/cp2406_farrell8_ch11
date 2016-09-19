/**
 * Created by jc321258 on 19/09/16.
 */
public class PhysicalNewspaperSubscription extends NewspaperSubscription {
    public PhysicalNewspaperSubscription(String subscriber, String address) {
        super(subscriber, address);
    }

    @Override
    public void setRate(String address) {
        if (address.length() == 0) {
            this.rate = 0;
        }
        else {
            this.rate = 15;
        }
    }
}
