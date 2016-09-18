/**
 * Created by jc321258 on 19/09/16.
 */
public class OutgoingPhoneCall extends PhoneCall {
    protected Double time;

    public OutgoingPhoneCall(String phoneNo, Double time) {
        super(phoneNo);
        this.price = 0.04;
        this.time = time;
    }

    @Override
    public String getPhoneNo() {
        return null;
    }

    @Override
    public Double getPrice() {
        return price;
    }

    @Override
    public void setPrice(Double price) {
        super.setPrice(price);
    }

    @Override
    public void display() {
        System.out.println("The phone number is: " + phoneNo + " The rate is: " + price + " The time is: " + time + " The total price is: " + (price*time));
    }
}
