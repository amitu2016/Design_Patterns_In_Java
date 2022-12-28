package stratagyPattern;

import java.util.Collection;

//Strategy
public interface OrderPrinter {

	void print(Collection<Order> orders);
}
