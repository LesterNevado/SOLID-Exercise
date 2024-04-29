public class SeniorCitizenDiscount implements DiscountCalculator{

    @Override
    public double calculateDiscount(double amount) {
        return amount * 0.10;
    }

}
