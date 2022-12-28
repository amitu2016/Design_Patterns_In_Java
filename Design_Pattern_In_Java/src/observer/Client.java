package observer;

public class Client {

    public static void main(String[] args) {
    	Order order = new Order("100");
    	PriceObserver price = new PriceObserver();
    	QuantityObserver quantity = new QuantityObserver();
    	order.attach(price);
    	order.attach(quantity);
    	order.addItem(50);
    	order.addItem(179);
    	order.addItem(20);
    	order.addItem(150);
    	order.addItem(52);
    	order.addItem(20);
    	System.out.println(order);
    }
}
