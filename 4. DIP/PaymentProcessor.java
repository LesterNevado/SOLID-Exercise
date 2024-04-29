public class PaymentProcessor {
    private PaymentMethod method;

    public PaymentProcessor(PaymentMethod method) {
        this.method = method;
    }

    public void processPayment(Order order) {
        method.pay(order.getAmount());
    }
}
