/**
 * Created by jc321258 on 19/09/16.
 */
public class DemoPhoneCalls {
    public static void main(String[] args) {
        IncomingPhoneCall one = new IncomingPhoneCall("04321234");
        one.display();
        OutgoingPhoneCall two = new OutgoingPhoneCall("49532345",5.0);
        two.display();
    }
}
