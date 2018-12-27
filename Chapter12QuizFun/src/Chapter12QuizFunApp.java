import java.util.HashMap;

public class Chapter12QuizFunApp {
	HashMap<String, Double> sales =new HashMap<>();
	
	sales.put("January" 389.45);
	sales.put("February", 432.89);
	sales.put("March", 275.30);
	
	for(Maps.Entry sale: sales.entrySet()) {
		System.out.println(sale.getKey() + ": " + sale.getValue());
	}
}
