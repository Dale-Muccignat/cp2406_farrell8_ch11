/**
 * Created by jc321258 on 19/09/16.
 */
public abstract class PhoneCall {
    protected String phoneNo;
    protected Double price;

    public PhoneCall(String phoneNo) {
        this.phoneNo = phoneNo;
        this.price = 0.0;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public abstract String getPhoneNo();

    public abstract Double getPrice();

    public abstract void display();
}
