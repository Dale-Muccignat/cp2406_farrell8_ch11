/**
 * Created by jc321258 on 19/09/16.
 */
public abstract class NewspaperSubscription {
    String subscriber, name, address;
    int rate;

    public NewspaperSubscription(String subscriber, String address) {
        this.subscriber = subscriber;
        this.address = address;
        setRate(address);

    }

    public abstract void setRate(String address);

    public void setAddress(String address) {
        this.address = address;
        setRate(address);
    }

    public void display() {
        System.out.println("Subscriber: " + subscriber + " Address: "+ address + " rate: " + rate);
    }

    public String getAddress() {
        return address;
    }

    public int getRate() {
        return rate;
    }

    public String getSubscriber() {
        return subscriber;
    }

    public void setSubscriber(String subscriber) {
        this.subscriber = subscriber;
    }
}
