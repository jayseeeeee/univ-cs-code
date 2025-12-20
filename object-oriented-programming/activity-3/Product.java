import java.util.Scanner;

class Product {
    private String productName;
    private String productCode;
    private float price;

    // constructor for product (parent)
    Product(String productName, String productCode, float price) {
        this.productName = productName;
        this.productCode = productCode;
        this.price = price;
    }

    // setters
    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    // getters
    public String getProductName() {
        return productName;
    }

    public String getProductCode() {
        return productCode;
    }

    public float getPrice() {
        return price;
    }

}

class DiscountedProduct extends Product {
    float discountRate;

    DiscountedProduct(String productName, String productCode, float price, float discountRate) {
        super(productName, productCode, price);
        this.discountRate = discountRate;
    }

    // discounted price
    @Override
    public float getPrice() {
        // compute for discounted price before returning
        float discountedPrice = super.getPrice() * (1 - discountRate / 100);
        return discountedPrice;
    }

    // original price
    public float getOriginalPrice() {
        // get parent class original price
        return super.getPrice();
    }
}

class Input {
    private static Scanner scanner = new Scanner(System.in);

    // input handler for string
    static String getString(String text) {
        while (true) {
            System.out.print(text);
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                System.out.println("Error: Input cannot be blank.");
                continue;
            }
            return input;
        }
    }

    // input handler for float
    static float getFloat(String text) {
        while (true) {
            // get input through string first then convert it to float input
            try {
                float floatInput = Float.parseFloat(getString(text));
                if (floatInput > 1) {
                    return floatInput;
                }
                System.out.println("Error: Input must be greater than 0.");
            }
            catch(Exception e) {
                System.out.println("Error: Incorrect input.");
            }
        }
    }
}

void main() {
    // get user input through input handler
    String productName = Input.getString("Enter product name: ");
    String productCode = Input.getString("Enter product code: ");
    float productPrice = Input.getFloat("Enter product price: ");
    float discountRate = Input.getFloat("Enter discounted rate (in percentage): ");

    DiscountedProduct myProduct = new DiscountedProduct(productName, productCode, productPrice, discountRate);

    // display product details
    System.out.println("\nProduct Details:");
    System.out.println("Name: " + myProduct.getProductName());
    System.out.println("Code: " + myProduct.getProductCode());
    System.out.println("Original Price: $" + myProduct.getOriginalPrice());
    // round off decimals to two decimals for standardized payment
    System.out.println("Price after " + myProduct.discountRate + "% discount: " + Math.round(myProduct.getPrice() * 100.0) / 100.0);

    // close scanner to avoid memory leak
    Input.scanner.close();
}