package rashmi;

public class SimpleCalculator {
	int a, b;

	SimpleCalculator(int a, int b) {
		this.a = a;
		this.b = b;
	}

	int add() {
		return a + b;
	}

	int sub() {
		return a - b;
	}

	int mul() {
		return a * b;
	}

	int div() {
		return a / b;
	}

	int percentage() {
		return a * 100 / b;
	}

	int mod() {
		return a % b;
	}
}
