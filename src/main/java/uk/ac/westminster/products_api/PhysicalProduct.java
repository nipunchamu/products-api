package uk.ac.westminster.products_api;

//  A PhysicalProduct is still a Product because it has an id, name and price
//A ShoppingCart is not a Product because it holds products


public class PhysicalProduct extends Product implements Discountable {

    private double weightKg;
    private String dimensions;
    private double discountedPrice;

    public PhysicalProduct() {
    }

    public PhysicalProduct(Long id, String name, double price,
                           double weightKg, String dimensions) {
        super(id, name, price);
        this.weightKg = weightKg;
        this.dimensions = dimensions;
        this.discountedPrice = price;
    }

    @Override
    public String getSummary() {
        return "Physical: " + getName()
                + " | Weight: " + weightKg + "kg";
    }

    @Override
    public void applyDiscount(double rate) {
        // Shipping is never discounted, so cap the discount at 20%.
        double capped = Math.min(rate, 0.20);
        this.discountedPrice = getPrice() * (1 - capped);
    }

    @Override
    public double getDiscountedPrice() {
        return discountedPrice;
    }

    public double getWeightKg() { return weightKg; }
    public String getDimensions() { return dimensions; }
}


