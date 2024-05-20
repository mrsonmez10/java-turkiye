package fs.content07;

public class Customer {
	private int age;
	private int creditScore;

	public Customer(int age, int creditScore) {
		this.age = age;
		this.creditScore = creditScore;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getCreditScore() {
		return creditScore;
	}

	public void setCreditScore(int creditScore) {
		this.creditScore = creditScore;
	}
}
