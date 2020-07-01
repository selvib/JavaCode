package Variables_Learning;

public class Assingnment {

	int Call_a(int x) {
		return (x *= 15);

	}

	int Call_b(int x) {
		return Call_b(x /= 15);//We should not return with method name

	}

	int Call_c(int x) {
		return Call_c(x -= 15);

	}

	int Call_d(int x) {
		return Call_d(x += 15);

	}

	public static void main(String[] args) {
		Assingnment as = new Assingnment();
		System.out.println(as.Call_a(15));
		//System.out.println(as.Call_b(30)); THis will give StackOverflowError
	}

}
