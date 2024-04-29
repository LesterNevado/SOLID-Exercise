public class Customer {

    
    private String name;
    private String type; // "Student", "Senior Citizen", or "Regular"
    private DiscountCalculator discount;
  
    public Customer(String name, String type, DiscountCalculator discount) {
      this.name = name;
      this.type = type;
      this.discount = discount;
    }

    /* 
    public double calculateDiscount(double amount) {
      if (type.equalsIgnoreCase("Student")) {
        return amount * 0.05;
      } else if (type.equalsIgnoreCase("Senior Citizen")) {
        return amount * 0.10;
      } else {
        return 0.0; // No discount for Regular
      }
    }
  
    public double applyDiscount(double amount) {
      return amount - calculateDiscount(amount);
    }
    */
    
    public double applyDiscount(double amount) {
        return amount - discount.calculateDiscount(amount);
      }
  }
  