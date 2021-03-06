/*
- Mahmoud Gamal Ahmed Hassanein
- Luxor City
 */
package restaurantmanagement;


public class Item {
    
    private String id; //setting id as private
    private String name;
    protected double price; //setting price as protected not public cause have to call in another class
    protected double profit;
    

    public Item(String id, String name, double price, double profit) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.profit = profit;
    }

    Item() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    
    public double getProfit() {
        return profit;
    }
}
