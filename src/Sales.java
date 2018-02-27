class Sales {   // each object contains details of one sale
    private String itemld;  // id of the item
    private double value;   // the price of one item private int quantity; // the number of the items sold
    // constructor missing
    private int quantity;

    public double getValue() {
        return value;
    }

    public int getQuantity() {
        return quantity;
    }

    public Sales(String itemld, double value, int quantity) {
        this.itemld = itemld;
        this.value = value;
        this.quantity = quantity;

    }
}




