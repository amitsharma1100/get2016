package session3.assignment1;

public class GCD {
	static GCD gcdObject;

	public static void main(String[] args) {
		int x = 100;
		int y = 3;
		gcdObject = new GCD();
		int result = (x > y) ? gcdObject.gcd(x, y) : gcdObject.gcd(y, x);
		System.out.println("GCD:" + result);
	}

	int gcd(int x, int y) {
		if(y>x)
		{
			int temp=x;
			x=y;
			y=temp;
		}
		try {
			if (y == 0) {
				throw new ArithmeticException();
			}
			if ((x % y) == 0) {
				return y;
			} else {
				return gcd(y, (x % y));
			}
		} catch (ArithmeticException arithmeticException) {
			System.out.println("Cannot divide by zero");
			return -1;
		}

	}
}