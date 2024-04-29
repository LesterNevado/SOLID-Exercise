public class CashPayment implements PaymentMethod{

    @Override
    public void pay(double amount) {
        // logic to pay with cash
        System.out.println("You are paying with Cash");
    }

}
