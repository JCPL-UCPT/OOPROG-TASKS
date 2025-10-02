package shopping;

class Clothes extends Product {
    double discount;

    Clothes(String name, double price, double discount) {
        super(name, price);
        this.discount = discount;
    }

    @Override
    double calculatePrice() {
        return price - discount;
    }
}