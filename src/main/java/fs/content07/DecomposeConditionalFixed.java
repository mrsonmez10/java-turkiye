package fs.content07;

public class DecomposeConditionalFixed {

	public int getDiscount(Customer customer) {
		int discount = 15;
		if (isCustomerPrime(customer)) {
			discount = 65;
		}
		return discount;
	}

	public boolean isCustomerPrime(Customer customer) {
		return (customer.getAge() > 34 && customer.getCreditScore() > 1000);
	}
}
