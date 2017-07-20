package pl.coderslab.junit;

public class First {

	public String concatString(String first, String second) {
		return first + second;
	}

	public int multiply(int first, int second) throws InterruptedException {
		Thread.sleep(2000);
		return first * second;
	}

	public double divide(double a, double b) throws DivideException {
		if (b == 0) {
			throw new DivideException("Próba dzielenia przez zero");
		}
		return a / b;
	}

}
