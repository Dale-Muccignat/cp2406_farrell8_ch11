import javax.swing.*;

/**
 * Created by jc321258 on 19/09/16.
 */
public class PhoneCallArray {
    protected static PhoneCall[] phoneCalls = new PhoneCall[10];
    public static void main(String[] args) {
        buildArray();
        displayArray();
    }
    public static void buildArray() {
        char phoneType;
        for (int x=0; x< phoneCalls.length; x++) {
            phoneType = getType();
            if (phoneType == 'o') {
                phoneCalls[x] = new OutgoingPhoneCall("55555555",0.0);
            }
            else if (phoneType == 'i') {
                phoneCalls[x] = new IncomingPhoneCall("555555555");
            }

        }
    }

    public static void displayArray() {
        for (PhoneCall phoneCall : phoneCalls) {
            phoneCall.display();
        }
    }

    public static char getType() {
        return JOptionPane.showInputDialog("Input 'i' for incoming and 'o' for outgoing").charAt(0);
    }

}
