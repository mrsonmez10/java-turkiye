package fs.content07;

public class DecomposeConditional {

	public int getDiscount(Customer customer) {
		int discount = 15;
		if (customer.getAge() > 34 && customer.getCreditScore() > 1000) {
			discount = 65;
		}
		return discount;
	}
}
