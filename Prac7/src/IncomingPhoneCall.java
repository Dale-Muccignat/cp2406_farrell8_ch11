/**
 * Created by jc321258 on 19/09/16.
 */
public class IncomingPhoneCall extends PhoneCall {
    public IncomingPhoneCall(String phoneNo) {
        super(phoneNo);
        this.price = 0.02;
    }

    public void display() {
        System.out.println("The phone number is: " + phoneNo + " The rate and price is: " + price);
    }

    public Double getPrice() {
        return price;
    }

    public String getPhoneNo() {
        return phoneNo;
    }
}
