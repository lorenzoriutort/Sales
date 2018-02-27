class SalesPerson {    // each object contains details of one salesperson
    private String id;
    private Sales[] salesHistory = new Sales[5];   // details of the different sales
    private int count = 0;           // number of sales made

    // constructor for a new salesperson
    public SalesPerson(String id) {
        // code missing
        this.id = id;
    }
    // constructor for a salesperson transferred (together with their sales details) from another branch
    public SalesPerson(String id, Sales[] s, int c) {
        //code missing
        this.id = id;
        this.salesHistory = s;
        this.count = c;
    }

    public int getCount() {
        return count;
    }

    public String getId() {
        return id;
    }

    public void setSalesHistory (Sales s) {
        salesHistory[count] = s;
        count ++;
    }

    public Sales getSalesHistory(int num) {
        for (int i = 0; i < salesHistory.length; i ++) {
            return salesHistory[num];
        }
        return null;
    }

    public double calcTotalSales() {    // calculates total sales for the sales person
        // code missing
        double sum = 0;
        for (int i=0; i<salesHistory.length; i++){
        sum += salesHistory[i].getValue();
        }
        return sum;
    }

    public double largestSale() {    // calculates the sale with the largest value
    double all = 0;
    for (int i=0; i < salesHistory.length; i++){
        if (salesHistory[i].getValue() > all) {
            all = salesHistory[i].getValue();
        }
    }
    return all;
    }

    public double addSales(Sales s, String ID, SalesPerson[] salesPeople){
        for (int i=0; i<salesPeople.length; i++){
         if (salesPeople[i].getId() == ID){
             salesPeople[i].setSalesHistory(s);
         }
        }
        return 0;
    }

}
