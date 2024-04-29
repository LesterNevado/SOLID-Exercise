public class Samsung implements Calling, SendableSMS, BrowsableWeb, TakingPicture{

    @Override
    public void takePicture() {
        //logic to take a picture
    }

    @Override
    public void browseWeb(String url) {
        // logic to browse the web
    }

    @Override
    public void sendSMS(String number, String message) {
        // logic to send SMS
    }

    @Override
    public void makeCall(String number) {
        // logic to make a call
    }

}
