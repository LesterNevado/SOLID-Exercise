public class CreditCardPayment implements PaymentMethod{

    @Override
    public void pay(double amount) {
        // logic to pay with credit card
        System.out.println("You are paying using Credit Card");
    }

}
