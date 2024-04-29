public class EWalletPayment implements PaymentMethod{

    @Override
    public void pay(double amount) {
        // logic to pay with e-wallet
        System.out.println("You are paying with GCash");
    }

}
