void main() {

    Phone iphone = new Phone("Apple", "iPhone 15");
    Phone pixel = new Phone("Google", "Pixel 8");
    Phone motorola = new Phone("Motorola", "Motorola Edge 50");

    // Insertion of 'Phone' objects to the 'Phone' array
    Phone[] usBrands = {iphone, pixel, motorola};

    // Direct insertion of 'Phone objects' by instantiating directly on the array
    Phone[] asianBrands = {
            new Phone ("Samsung", "Galaxy S24"),
            new Phone ("Xiaomi", "Xiaomi 13"),
            new Phone ("Huawei", "Huawei P60")
    };

    // Standard For Loops on Object Array
    for (int i = 0; i < usBrands.length; i++) {
        System.out.println();
        System.out.printf("[%d] ", i + 1);
        usBrands[i].printDetails();
    }

    // Enhanced For Loops on Object Array
    for (Phone brand : asianBrands) {
        System.out.println();
        brand.printDetails();
    }
}

class Phone {
    String brand;
    String model;

    Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    void printDetails() {
        System.out.println(model);
        System.out.printf("Developed by %s\n", brand);
    }
}