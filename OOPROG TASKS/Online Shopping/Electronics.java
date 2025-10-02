package shopping;

class Electronics extends Product {
    double warrantyFee;

    Electronics(String name, double price, double warrantyFee) {
        super(name, price);
        this.warrantyFee = warrantyFee;
    }

    @Override
    double calculatePrice() {
        return price + warrantyFee;
    }
}