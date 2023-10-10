package task5_4;

import java.util.Map;

public class ShoppingCart {
    private Map <String, Double> cart;

    public ShoppingCart() {
        this.cart = new java.util.HashMap<>();
    }
    public void addItem(String item, double price){
        cart.put(item, price);
    }
    public void removeItem(String item){
        cart.remove(item);
    }
    public int getItemCount(){
        return cart.size();
    }
    public double calculateTotal(){
        double total = 0;
        for (double price : cart.values()) {
            total += price;
        }
        return total;
    }
}
