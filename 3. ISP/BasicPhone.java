public class BasicPhone implements Calling, SendableSMS{

    @Override
    public void sendSMS(String number, String message) {
        //logic to send SMS
    }

    @Override
    public void makeCall(String number) {
        // logic to make a call
    }

}
