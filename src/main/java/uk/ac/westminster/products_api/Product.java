package uk.ac.westminster.products_api;

public class Product {


    private Long id;
    private String name;
    private double price;

    public Product() {
    }

    public Product(Long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
      public Long getId() { return id; }
//    When getName() is missing it has no way to read name and silently leaves it out.
      public String getName() { return name; }
      public double getPrice() { return price; }
}

