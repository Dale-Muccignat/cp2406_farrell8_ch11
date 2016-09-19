/**
 * Created by jc321258 on 19/09/16.
 */
public class OnlineNewspaperSubsciption extends NewspaperSubscription {
    public OnlineNewspaperSubsciption(String subscriber, String address) {
        super(subscriber, address);
    }

    @Override
    public void setRate(String address) {
        if (address.indexOf('@') == -1) {
            this.rate = 0;
        }
        else {
            this.rate = 9;
        }
    }
}
